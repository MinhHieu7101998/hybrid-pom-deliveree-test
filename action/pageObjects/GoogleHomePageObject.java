package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import googlePageUIs.GoogleHomePageUI;

public class GoogleHomePageObject extends AbstractPage {
	WebDriver driver;

	public GoogleHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToSearchTextbox(String valueInput) {
		waitToElementVisible(driver, GoogleHomePageUI.SEARCH_GOOGLE_TEXTBOX);
		sendkeyToELement(driver, GoogleHomePageUI.SEARCH_GOOGLE_TEXTBOX, valueInput);
	}

	public void clickToGoogleSearchButton() {
		waitToElementClickable(driver, GoogleHomePageUI.SEARCH_GOOGLE_BUTTON);
		clickToElementByJS(driver, GoogleHomePageUI.SEARCH_GOOGLE_BUTTON);
	}

	public void clickToEnglishLanguage() {
		if(isElementDisplayed(driver, GoogleHomePageUI.ENGLISH_LANGUAGE_LINK)) {
			waitToElementVisible(driver, GoogleHomePageUI.ENGLISH_LANGUAGE_LINK);
			clickToElement(driver, GoogleHomePageUI.ENGLISH_LANGUAGE_LINK);
		}
		
	}

}
