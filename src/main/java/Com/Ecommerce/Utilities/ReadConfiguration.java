package Com.Ecommerce.Utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;

public class ReadConfiguration {
	
	Properties pro;
	
	public ReadConfiguration() {
		
		File src=new File("C:\\Users\\admin\\eclipse-workspace\\Maven_project\\Configuration\\config.properties");
		
		pro=new Properties();
		try {
			FileInputStream fs=new FileInputStream(src);
			try {
				
				pro.load(fs);
				
			}
		
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException e){
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
		
		public String GetURL() {
			String URL=pro.getProperty("BaseURL");
			
			return URL;
			
			
		}
		public String UName() {
			String UN=pro.getProperty("Username");
			
			return UN;	
		}
		
		public String Password() {
			String PW=pro.getProperty("Password");
			
			return PW;	
		}
		
		public String GetCrome() {
			String Cromepath=pro.getProperty("Chromdriver");
			
			return Cromepath;	
		}
		
		public String GetFireFox() {
			String firefoxpath=pro.getProperty("FireFoxDriver");
			
			return firefoxpath;	
		}
		
		
		
	}


