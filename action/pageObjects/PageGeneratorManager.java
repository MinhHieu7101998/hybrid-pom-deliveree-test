package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static GoogleHomePageObject getGoogleHomePage(WebDriver driver) {
		return new GoogleHomePageObject(driver);
	}
	public static SearchResultPageObject getSearchResultPage(WebDriver driver) {
		return new SearchResultPageObject(driver);
	}
}
