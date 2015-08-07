package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Про нас"
public class AboutUsPage extends AbstractPage {

    //заголовок на странице
    private static final String ABOUT_US = "Про нас";
    private static final By ABOUT_US_TEXT = By.xpath("//div[@id='node-2']/div/div[1]/h2");

    public AboutUsPage(Browser browser) {
        super(browser);
    }

    public WebElement aboutUsText(Browser browser) {
        return browser.findElement(ABOUT_US_TEXT);
    }

    @Override
    public boolean isOpened() {
        logger.info("About Us page is opened");
        if (aboutUsText(browser).isDisplayed() && aboutUsText(browser).getText().equals(ABOUT_US)) return true;
        else return false;
    }
}
