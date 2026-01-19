package pages;

import org.openqa.selenium.WebDriver;
import Locators.page3objects;

public class page3{
	
	private final page3objects page3objects;
	
	public page3() {
		this.page3objects= new page3objects();
	}
	
	public String getPrice() {
		return page3objects.getPrice();
	}
	public String getImageUrl() {
		return page3objects.getImageUrl();
	}
}