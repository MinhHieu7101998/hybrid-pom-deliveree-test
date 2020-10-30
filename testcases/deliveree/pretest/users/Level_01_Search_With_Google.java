package deliveree.pretest.users;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.GoogleHomePageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.SearchResultPageObject;

public class Level_01_Search_With_Google extends AbstractTest {
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		driver = getBrowserDriver(browserName, url);
		GoogleHomePage = PageGeneratorManager.getGoogleHomePage(driver);
	}

	@Test
	public void TC_01_Search_With_Value() {
		GoogleHomePage.clickToEnglishLanguage();

		GoogleHomePage.inputToSearchTextbox("Selenium");

		GoogleHomePage.clickToGoogleSearchButton();

		SearchResultPage = PageGeneratorManager.getSearchResultPage(driver);

		Assert.assertTrue(SearchResultPage.isValueTextboxGoogleSearchDisplayed("Selenium"));

		Assert.assertEquals(SearchResultPage.getTitleUrl(), "Selenium - Google Search");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		removeDriver();
	}

	GoogleHomePageObject GoogleHomePage;
	SearchResultPageObject SearchResultPage;
}
