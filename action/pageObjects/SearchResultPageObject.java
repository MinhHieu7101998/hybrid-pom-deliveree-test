package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import googlePageUIs.SearchResultPageUI;

public class SearchResultPageObject extends AbstractPage {
	WebDriver driver;

	public SearchResultPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitleUrl() {
		return getCurrentPageTitle(driver);
	}
	public boolean isValueTextboxGoogleSearchDisplayed(String dynamicvalues) {
		waitToElementVisible(driver, SearchResultPageUI.GOOGLE_SEARCH_TEXTBOX, dynamicvalues);
		return isElementDisplayed(driver, SearchResultPageUI.GOOGLE_SEARCH_TEXTBOX, dynamicvalues);
	}
}
