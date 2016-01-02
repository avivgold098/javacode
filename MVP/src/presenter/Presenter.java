package presenter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

import presenter.Dir;
import presenter.Display;
import presenter.DisplaySolution;
import presenter.Exit;
import presenter.Generate3dMaze;
import presenter.LoadMaze;
import presenter.SaveMaze;
import presenter.Solve;
import model.Model;
import view.View;

public class Presenter implements Observer {
	View view;
	Model model;
	HashMap<String,Command> hash;
	public Presenter(Model model, View view) {
		this.model = model;
		this.view = view;
		
		this.hash = new HashMap<String,Command>();
		hash.put("dir", new Dir(this));
		hash.put("display", new Display(this));
		hash.put("displayCrossSectionBy", new DisplayCrossSection(this));
		hash.put("displaySolution", new DisplaySolution(this));
		hash.put("generate3dMaze", new Generate3dMaze(this));
		hash.put("solve", new Solve(this));
		hash.put("saveMaze", new SaveMaze(this));
		hash.put("loadMaze", new LoadMaze(this));
		hash.put("mazeSize", new MazeSizeMemory(this));
		hash.put("fileSize", new MazeFileSize(this));
		hash.put("exit", new Exit(this));
		
		view.setHashCommand(hash);
	}
	public void setMessage(String message) {
		this.view.printMessage(message);

	}
	public Model getM(){ return model; }
	public View getV(){ return view; }
	@Override
	public void update(Observable o, Object arg) {
		if(o == view)
		{
			if(((arg.getClass()).getName()).equals("[Ljava.lang.String;")){
				String[] command = (String[]) arg;
				Command com = hash.get(command[0]);	
				if(com != null)
					if(command.length == 1)
						com.doCommand("");
					else
						com.doCommand(command[1]);
				else
					view.printMessage("Error! Command not exist"); 
			}
			else if (((arg.getClass()).getName()).equals("java.lang.String")){
				String command = (String) arg;
				if(command.equals("exit")){
					Command com = hash.get(command);
					com.doCommand("");
				}				
				else
					view.printMessage("Error! Command not exist");	
			}
		}
		if(o == model)
		{
			String s = (String) arg;
			view.printMessage(s);
		}
	}

}
