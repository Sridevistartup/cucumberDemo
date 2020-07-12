package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Pagestepdefintionsearch {
	WebDriver driver;
	public Pagestepdefintionsearch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.cssSelector("#twotabsearchtextbox");
	public WebElement search()
	{
		return driver.findElement(search);
	}
			
	
	 By prime=By.xpath("(//i[contains(@class,\"prime\")]//parent::a//i)[1]");
	 public WebElement prime()
	 {
		 return driver.findElement(prime);
	 }
	

}
