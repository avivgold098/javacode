package presenter;

public class Dir extends CommonCommand {

	public Dir(Presenter presenter) {
		super(presenter);
	}

	@Override
	public void doCommand(String str) {
		pr.getM().dir(str);
		
	}

}
