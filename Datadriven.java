package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property.txt");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("URL");
		String UN = p.getProperty("Username");
		String PW = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(UN);
		System.out.println(PW);
	}

}
