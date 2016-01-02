package presenter;

public class Display extends CommonCommand {

	public Display(Presenter presenter) {
		super(presenter);
	}

	@Override
	public void doCommand(String str) {
		pr.getM().display(str);
	}

}
