package presenter;

public class SaveMaze extends CommonCommand {

	public SaveMaze(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		String[] parm = str.split(" ");
		if(parm.length != 2){
			pr.getV().printMessage("Invalid command");			
			return;
		}
		pr.getM().saveMaze(parm[0], parm[1]);

	}

}
