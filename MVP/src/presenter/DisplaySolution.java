package presenter;

public class DisplaySolution extends CommonCommand {

	public DisplaySolution(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		pr.getM().displaySolution(str);

	}

}
