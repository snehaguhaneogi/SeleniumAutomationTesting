package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.browser;

public class page3objects extends browser{
	
	@FindBy(xpath="//span[@class='woocommerce-Price-amount amount']/bdi")
	private WebElement priceLabel;
	
	@FindBy(xpath="//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
	private WebElement imageLabel;

	private WebDriver driver;
	
	public page3objects() {
		this.driver = browser.driver;
		PageFactory.initElements(driver,this);
	}
	
	public String getPrice() {
		return priceLabel.getText();
	}
	
	public String getImageUrl() {
		return imageLabel.getAttribute("src");

	}
}