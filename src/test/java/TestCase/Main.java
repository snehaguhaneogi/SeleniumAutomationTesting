package TestCase;


import Browser.browser;
import Locators.page1objects;
import Locators.page2objects;
import Locators.page3objects;
import ScreenShot.capture;

import static Browser.browser.driver;

public class Main {
	public static void main(String[] args) throws InterruptedException{

		try {
		browser.openBrowser();
		
		
		page1objects page1objects= new page1objects();
		page2objects page2objects= new page2objects();
		page3objects page3objects= new page3objects();
		
		//page1objects.closePopup();
		capture.ScreenShot("Home Page");
		page1objects.searchForRice("Rice");
		capture.ScreenShot("Search Rice");
		
		page2objects.clickOnRiceProduct("Shri Hershne Ponni Boiled Rice (10kg)");
		capture.ScreenShot("Ponni Rice");
		
		String price = page3objects.getPrice();
		String imageurl = page3objects.getImageUrl();
		
		System.out.println("Price:"+price);
		System.out.println("Image URL:" +imageurl);
	
	}catch (Exception ignored) {
		
	}finally {
		if(driver != null) {
			browser.closeBrowser();

		}
	}
}
}
