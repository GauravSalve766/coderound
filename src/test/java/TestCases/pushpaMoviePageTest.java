package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.ImdbpushpaMoviepage;
import Utility.readPropertyfile;

public class pushpaMoviePageTest extends TestBase {

	public ImdbpushpaMoviepage page;
	@BeforeMethod
	public void setup() throws Exception {
		initializationimdb();
		page = new ImdbpushpaMoviepage();
	}
	
	@Test
	public void verifyreleasedatetextTest() throws Exception {
		
		String expres = page.verifyreleasedatetext();
		String actres = readPropertyfile.readPropertyFile("imdbreleasedate");
		Assert.assertEquals(actres, expres, "result not matched");
		
	}
	
	@Test
	public void verifycontrytextTest() throws Exception {
		String expected = page.verifycountrytext();
		String actual = readPropertyfile.readPropertyFile("Country");
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
}
