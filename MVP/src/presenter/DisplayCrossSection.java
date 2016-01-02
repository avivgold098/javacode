package presenter;

public class DisplayCrossSection extends CommonCommand {

	public DisplayCrossSection(Presenter presenter) {
		super(presenter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doCommand(String str) {
		String[] strings=str.split(" ");
		if(strings.length!=3)
			pr.getV().printMessage("invalid input");
		else
		{
			int index=Integer.parseInt(strings[2]);
			pr.getM().crossBy(strings[1], index, strings[0]);
		}
		
		
	}

}
