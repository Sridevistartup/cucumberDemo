package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Pagestepdefintionsearch;
import utilities.Driver;

public class Stepdefintionsearch extends Driver{
	WebDriver driver; 
	Pagestepdefintionsearch pg;
	
	
	 @Given("^user is on amazon website$")
	    public void user_is_on_amazon_website() throws Throwable {
		 
		 driver=Driver.getDriver(); 
		 pg=new Pagestepdefintionsearch(driver);
		 System.out.println("hii y here");
		 System.out.println("yyyyyy");
         System.out.println("hii x here");
		 System.out.println("xxxx");
                                              
		
	       
	    }

	    @When("^user search for \"([^\"]*)\"$")
	    public void user_search_for_something(String strArg1) throws Throwable {
	      pg.search().sendKeys(strArg1,Keys.ENTER);
	    }

	    @Then("^\"(.*)\" are displayed$")
	    public void something_are_displayed(String strArg1) throws Throwable {
	         System.out.println(strArg1);
	    }
	    
	    @When("^user checks the prime checkbox$")
	    public void user_checks_the_prime_checkbox() throws Throwable {
	    	 pg.search().sendKeys("prime",Keys.ENTER);
	         pg.prime().click();
	    }

	    @Then("^checkbox should be selected$")
	    public void checkbox_should_be_selected() throws Throwable {
	       
	        System.out.println("selected");
	    }




}
