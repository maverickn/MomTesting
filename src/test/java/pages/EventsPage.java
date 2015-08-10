package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Заходи"
public class EventsPage extends AbstractPage {

    //заголовок на странице
    private static final String EVENTS = "Заходи";
    private static final By EVENTS_TEXT = By.xpath("//section[@id='block-system-main']/div/div/div/div[1]/h2");

    //xpath линка мероприятия
    private static final String EVENTS_LINKS_1 = "//div[contains(concat(' ', @class, ' '), '  col-lg-9 col-md-9 col-sm-12 col-xs-12 content-title ')]/div[";
    private static final String EVENTS_LINKS_2 = "]/div";

    //xpath названия мероприятия
    private static final String EVENTS_LINK_TEXT_1 = "//div[contains(concat(' ', @class, ' '), '  col-lg-9 col-md-9 col-sm-12 col-xs-12 content-title ')]/div[";
    private static final String EVENTS_LINK_TEXT_2 = "]/div/div/a/div/div";

    public EventsPage(Browser browser) {
        super(browser);
    }

    public WebElement eventsText(Browser browser){
        return browser.findElement(EVENTS_TEXT);
    }

    public WebElement eventsLink(Browser browser, int i){
        return browser.findElement(By.xpath(EVENTS_LINKS_1 + i + EVENTS_LINKS_2));
    }

    public WebElement eventsLinkText(Browser browser, int i){
        return browser.findElement(By.xpath(EVENTS_LINK_TEXT_1 + i + EVENTS_LINK_TEXT_2));
    }

    @Override
    public boolean isOpened() {
        logger.info("Events page is opened");
        if (eventsText(browser).isDisplayed() && eventsText(browser).getText().equals(EVENTS)) return true;
        else return false;
    }
}
