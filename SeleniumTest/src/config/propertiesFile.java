package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSelenuimTest;

public class propertiesFile {

	static Properties prop = new Properties();

	public static void main(String[] args) {

		//Calling functions in main method

		readPropertiesFile();
		writePropertiesFile();
		


	}

	//Function to get/ read properties from file
	public static void readPropertiesFile() {

		//properties type object declaration / Going to move this properties object
		//out of the function so that all the functions can use this globally
		//Properties prop = new Properties();

		try {

			//inputstream type object to read values from input file (Config.properties)
			
			InputStream Input = new FileInputStream("E:\\Eclipse\\SeleniumTest\\src\\config\\config.properties");
			
			//Using prop veriable to use the properties type file functions.
			prop.load(Input);
			//prop.getProperty("browser");
			//Using the print to ensure the browser value. For this we need to call this function in main class.
			//System.out.println(prop.getProperty("browser"));
			
			FirstSelenuimTest.browser = prop.getProperty("browser");
			System.out.println(FirstSelenuimTest.browser);
		} 

		//Generic catch function to handle all exceptions
		catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}
	
	
	// Function to set value in property file


	public static void writePropertiesFile() {
		
		try {
			
			OutputStream output = new FileOutputStream("E:\\Eclipse\\SeleniumTest\\src\\config\\config.properties");
			//prop.setProperty("browser", "Firefix");
			//prop.store(output, "browser value is changed in properties file using set proprty function");
			prop.setProperty("Result", "Pass");
			prop.store(output,"result is store in the properties file");
		
		} 
		
		catch (Exception e)
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}

















