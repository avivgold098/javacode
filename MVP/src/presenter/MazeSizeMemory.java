package presenter;

public class MazeSizeMemory extends CommonCommand {

	public MazeSizeMemory(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		pr.getM().mazeSizeMemory(str);

	}

}
