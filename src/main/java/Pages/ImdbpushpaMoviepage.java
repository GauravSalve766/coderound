package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ImdbpushpaMoviepage extends TestBase {

	@FindBy(xpath = "//span[text()='Details']") private WebElement detailmovietext;
	@FindBy(xpath = "//a[text()='January 7, 2022 (United States)']") private WebElement releasedatetext;
	@FindBy(xpath = "//a[text()='India']") private WebElement countrytext;
	
	public ImdbpushpaMoviepage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyreleasedatetext() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", "countrytext");
		return releasedatetext.getText();
	}
	
	public String verifycountrytext() {
		return countrytext.getText();
	}
	
}
