package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class WikipushpaMoviePage extends TestBase {

	@FindBy(xpath = "//li[contains(text(),'Decem')]") private WebElement releaseDatetext;
	@FindBy(xpath = "//td[text()='India']") private WebElement countrytext;
	
	public WikipushpaMoviePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyreleaseDatetext() {
		return releaseDatetext.getText();
	}
	
	public String verifycountrytext() {
		return countrytext.getText();
	}
}
