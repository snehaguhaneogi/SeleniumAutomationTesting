package Locators;

import java.time.Duration;

//import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browser.browser;

public class page1objects extends browser{
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class='brave_popup__close__button']")
	private WebElement popupCloseButton;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchBox;
	
	@FindBy(xpath="//span[@class='aws-search-btn_icon']")
	private WebElement searchButton;
	
	public page1objects(){
		this.driver=browser.driver;
        PageFactory.initElements(driver,this);

    }

	
	public void closePopup() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(popupCloseButton));
		popupCloseButton.click();
	}
	
	public void searchForRice(String searchText) {
		browser.navigate("Smartbazaar - Home");
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys(searchText);
		wait.until(ExpectedConditions.visibilityOf(searchButton));
		searchButton.click();
	}

}