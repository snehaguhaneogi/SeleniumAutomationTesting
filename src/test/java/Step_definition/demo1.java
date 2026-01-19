package Step_definition;

import Locators.page3objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Browser.browser;
import Locators.page1objects;
import Locators.page2objects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.page1;
import Browser.browser;

public class demo1 {
	page1objects page1objects= new page1objects();
	page2objects page2objects= new page2objects();
	
	@Given("Open the browser")
	public void open_the_browser() throws Exception {
	   browser.openBrowser();

	   //page1objects p1=new page1objects(driver);
	}

	@When("User enters the URL")
	public void user_enters_the_url() throws Exception {
		System.out.println("Open the smartbazar");
	}

	@Then("User verifies the title {string}")
	public void user_verifies_the_title(String string) {
	   System.out.println("Verified Title!");
	}
	
	@And("User enters the data {string} of the product")
	public void user_enters_the_data_of_the_product(String searchData) {
		page1objects.searchForRice(searchData);
		System.out.println("search Rice done");
	    
	}@Then("User verifies the product name {string}")
	public void user_verifies_the_product_name(String product) {
		page2objects.clickOnRiceProduct(product);
		}
	@Then("User verifies the result")
	public void user_verifies_the_result() {
		browser.closeBrowser();
	     System.out.println("Rice");
	}



	
}
