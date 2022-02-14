package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import config.propertiesFile;
import org.openqa.selenium.chrome.ChromeDriver;




public class FirstSelenuimTest {

	//Making this browser veriable as public so that this will be accessible in the properties calss
	public static String browser;
	static WebDriver driver;


	public static void main(String[] args) {
		
		//setbrowser();
		//Instead of using set browser I am calling properties file and readproperties function to set the value of browser from file
		
		
		propertiesFile.readPropertiesFile();
		setbrowserconfig();
		runtest();
		
		//propertiesFile.writePropertiesFile();
		

}

	//setbrowser
	//setbrowserconfig
	//runtest

	public static void setbrowser() {
		browser = "Chrome";

	}

	public static void setbrowserconfig() {
		
		if (browser.contains("Firefox"))
		{

		System.setProperty("webdriver.gecko.driver","E:\\automation-selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		if (browser.contains("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","E:\\automation-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}

}

	public static void runtest() {
		
		driver.get("https://mts.staging.wwcny.com/enterprise/index.aspx");
		//driver.quit();

	}


}
