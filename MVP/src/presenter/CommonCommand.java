package presenter;


public abstract class CommonCommand implements Command {

	Presenter pr;
public 	CommonCommand(Presenter presenter){this.pr=presenter;}
	@Override
	public abstract void doCommand(String str) ;

}
