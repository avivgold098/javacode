package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import presenter.Command;

public class CLI {
	private BufferedReader in;
	private PrintWriter out;
	private HashMap<String,Command> hm;
	private View view;
	
	public CLI(PrintWriter out,BufferedReader in)
	{
		this.out = out;
		this.in = in;
	}

	public void start() {
		new Thread(new Runnable() {
		String s = null;
			@Override
			public void run() {
				try {
					while ((s = in.readLine()).equals("exit") != true) {
						String[] command = s.split(" ",2);		
						if(hm.containsKey(command[0]) == true)
							view.notifyMe(command);
						else
						{
							out.println("Error");
							out.flush();
						}
					}
					}catch (IOException e) {
					e.printStackTrace();
				}
				view.notifyMe(s);
			}
		}).start();
	}
	public void setView(View view){ 
		this.view = view;
	}
	public void setHashCommand(HashMap<String, Command> hc) {
		this.hm = hc;
	}
	public void setMessage(String str){
		out.println(str);
		out.flush();
	}
}
