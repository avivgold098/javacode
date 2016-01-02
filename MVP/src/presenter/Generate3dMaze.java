package presenter;

public class Generate3dMaze extends CommonCommand {

	public Generate3dMaze(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
	String[] parm = str.split(" ");
		
		if(parm.length != 4)
			pr.getV().printMessage("Invalid Input");
		else{
			int x = 0,y = 0,z = 0;
			try{
				x = Integer.parseInt(parm[1]);
				y = Integer.parseInt(parm[2]);
				z = Integer.parseInt(parm[3]);
			}
			catch (NumberFormatException e){
				pr.getV().printMessage("Invalid Input");
			}
			
			pr.getM().generate(parm[0], y, z, x);
			
		}

	}

}
