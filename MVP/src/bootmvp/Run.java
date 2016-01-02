package bootmvp;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import presenter.Properties;

public class Run {
	
	public static void main(String[] args)  {
		Properties p= new Properties();
		XMLDecoder d;
		d = new XMLDecoder(new BufferedInputStream(new FileInputStream("Properties.xml")));

	}

}
