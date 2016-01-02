package view;

import java.util.HashMap;

import presenter.Command;

public interface View {
	public void printMessage(String str);
	public void notifyMe(String str);
	public void notifyMe(String [] str);
	public void start();
	public void setHashCommand(HashMap<String, Command> hc);

}
