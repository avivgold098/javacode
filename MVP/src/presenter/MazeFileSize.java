package presenter;

public class MazeFileSize extends CommonCommand {

	public MazeFileSize(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		pr.getM().mazeSizeFile(str);
	}

}
