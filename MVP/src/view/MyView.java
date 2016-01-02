package view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Observable;

import presenter.Command;

public class MyView extends Observable implements View {
	CLI cli;
	HashMap<String,Command> hc;
	BufferedReader in;
	PrintWriter out;
	public MyView(BufferedReader in,PrintWriter out)
	{
		this.in = in;
		this.out = out;
		cli = new CLI(out,in);
		cli.setView(this);
	}
	@Override
	public void printMessage(String str) {
		cli.setMessage(str);
	}
	@Override
	public void start() {
		cli.start();
	}
	@Override
	public void setHashCommand(HashMap<String, Command> hc) {
		cli.setHashCommand(hc);
		this.hc = hc;
	}
	@Override
	public void notifyMe(String[] str)
	{
		setChanged();
		notifyObservers(str);
	}
	@Override
	public void notifyMe(String str) {
		setChanged();
		notifyObservers(str);
	}


}

	
