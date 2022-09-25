package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.WikipushpaMoviePage;
import Utility.readPropertyfile;

public class WikipushpaMoviePageTest extends TestBase {

	public static WikipushpaMoviePage page;
	@BeforeMethod
	public void setup() throws Exception {
		initializationwiki();
		page = new WikipushpaMoviePage();
	}
	
	@Test
	public void verifyreleaseDatetextTest() throws Exception {
		String expected = page.verifyreleaseDatetext();
		String actual = readPropertyfile.readPropertyFile("wikireleasedate");
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void verifycountrytextTest() throws Exception {
		String expected = page.verifycountrytext();
		String actual = readPropertyfile.readPropertyFile("Country");
		Assert.assertEquals(actual, expected);
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
}
