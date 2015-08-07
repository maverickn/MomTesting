package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Партнери"
public class PartnersPage extends AbstractPage {

    //заголовок на странице
    private static final String PARTNERS = "Партнери";
    private static final By PARTNERS_TEXT = By.xpath("//span[@id='cache94']");

    public PartnersPage(Browser browser) {
        super(browser);
    }

    public WebElement partnersText(Browser browser){
        return browser.findElement(PARTNERS_TEXT);
    }

    @Override
    public boolean isOpened() {
        logger.info("Partners page is opened");
        if (partnersText(browser).isDisplayed() && partnersText(browser).getText().equals(PARTNERS)) return true;
        else return false;
    }
}
