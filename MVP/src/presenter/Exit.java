package presenter;

public class Exit extends CommonCommand {

	public Exit(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		pr.getM().exit();

	}

}
