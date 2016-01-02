package presenter;

public class LoadMaze extends CommonCommand {

	public LoadMaze(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		String[] parm = str.split(" ");
		if(parm.length!=2)
			pr.getV().printMessage("Invalid commnad");		
		else
			pr.getM().loadMaze(parm[0],parm[1]);

	}

}
