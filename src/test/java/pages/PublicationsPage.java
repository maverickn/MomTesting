package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Публікації"
public class PublicationsPage extends AbstractPage {

    //заголовок на странице
    private static final String PUBLICATIONS = "Публікації";
    private static final By PUBLICATIONS_TEXT = By.xpath("//section[@id='block-system-main']/div/div/div/div[1]/h2");

    public PublicationsPage(Browser browser) {
        super(browser);
    }

    public WebElement publicationsText(Browser browser){
        return browser.findElement(PUBLICATIONS_TEXT);
    }

    @Override
    public boolean isOpened() {
        logger.info("Publications page is opened");
        if (publicationsText(browser).isDisplayed() && publicationsText(browser).getText().equals(PUBLICATIONS)) return true;
        else return false;
    }
}
