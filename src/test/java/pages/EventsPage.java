package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Заходи"
public class EventsPage extends AbstractPage {

    //заголовок на странице
    private static final String EVENTS = "Заходи";
    private static final By EVENTS_TEXT = By.xpath("//section[@id='block-system-main']/div/div/div/div[1]/h2");

    public EventsPage(Browser browser) {
        super(browser);
    }

    public WebElement eventsText(Browser browser){
        return browser.findElement(EVENTS_TEXT);
    }

    @Override
    public boolean isOpened() {
        logger.info("Events page is opened");
        if (eventsText(browser).isDisplayed() && eventsText(browser).getText().equals(EVENTS)) return true;
        else return false;
    }
}
