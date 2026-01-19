package pages;

import org.openqa.selenium.WebDriver;

import Locators.page1objects;

public class page1{
	private page1objects page1objects;
	
	public page1() {
		this.page1objects= new page1objects();
	}

	
//	public void closePopup() {
//		page1objects.closePopup();
//	}
	
	public void searchForRice(String riceName) {
		page1objects.searchForRice(riceName);
	}
}