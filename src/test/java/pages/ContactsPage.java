package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Контакти"
public class ContactsPage extends AbstractPage {

    //заголовок на странице
    private static final String CONTACTS = "Контакти";
    private static final By CONTACTS_TEXT = By.xpath("//span[@id='cache92']");

    public ContactsPage(Browser browser) {
        super(browser);
    }

    public WebElement contactsText(Browser browser){
        return browser.findElement(CONTACTS_TEXT);
    }

    @Override
    public boolean isOpened() {
        logger.info("Contacts page is opened");
        if (contactsText(browser).isDisplayed() && contactsText(browser).getText().equals(CONTACTS)) return true;
        else return false;
    }
}
