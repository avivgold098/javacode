package presenter;

public class Solve extends CommonCommand {

	public Solve(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		String[] pram=str.split(" ");
		if(pram.length!=2)
			pr.getV().printMessage("Invalid command");
		else
			pr.getM().createSolution(pram[0],pram[1]);
	}

}
