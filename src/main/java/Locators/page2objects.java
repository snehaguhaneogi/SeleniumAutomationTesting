package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;

public class page2objects extends browser{
	private WebDriver driver;
	
	@FindBy(xpath="/ul[@class='products column-5']/li")
	private List<WebElement> riceProductList;
	
	public page2objects() {
		this.driver=browser.driver;
		PageFactory.initElements(driver,this);
	}
	
	public List<WebElement> getRiceProductList(){
		return riceProductList;
	}
	
	public void clickOnRiceProduct(String riceName) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		WebElement productElement= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='"+ riceName + "']")));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",productElement);
		
		productElement.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='woocommerce-Price-amount amount']/bdi")));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		
		
		
	}
}