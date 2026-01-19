package pages;

import org.openqa.selenium.WebDriver;

import Locators.page2objects;

public class page2{
	private page2objects page2objects;
	
	public page2() {
		this.page2objects= new page2objects();
	}
	
	public void clickOnRiceProduct(String riceName) {
		page2objects.clickOnRiceProduct(riceName);
	}
}