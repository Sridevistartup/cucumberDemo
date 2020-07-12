package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	protected static WebDriver driver;
	public static WebDriver getDriver() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sri Sree\\Desktop\\Jars\\driverlatestversion\\chromedriverlatest.exe");
		  driver=new ChromeDriver();
		  FileInputStream file=new FileInputStream("C:\\Eclipse-java-Practical\\Mavenproject\\src\\test\\java\\utilities\\Global.prop");
		  Properties p=new Properties();
		  p.load(file);
		  driver.get(p.getProperty("url"));
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  return driver;
	}

}
