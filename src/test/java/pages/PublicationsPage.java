package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Публікації"
public class PublicationsPage extends AbstractPage {

    //заголовок на странице
    private static final String PUBLICATIONS = "Публікації";
    private static final By PUBLICATIONS_TEXT = By.xpath("//section[@id='block-system-main']/div/div/div/div[1]/h2");
    //линк на первую публикацию
    private static final By FIRST_PUBLICATION_LINK = By.xpath("//div[contains(concat(' ', @class, ' '), ' row node node-publication node-teaser clearfix ')]/div/div/a[2]");

    public PublicationsPage(Browser browser) {
        super(browser);
    }

    public WebElement publicationsText(Browser browser){
        return browser.findElement(PUBLICATIONS_TEXT);
    }

    public WebElement firstPublicationLink(Browser browser){
        return browser.findElement(FIRST_PUBLICATION_LINK);
    }

    @Override
    public boolean isOpened() {
        logger.info("Publications page is opened");
        if (publicationsText(browser).isDisplayed() && publicationsText(browser).getText().equals(PUBLICATIONS)) return true;
        else return false;
    }
}
