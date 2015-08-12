package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

//страница "Про нас"
public class AboutUsPage extends AbstractPage {

    //заголовок на странице
    private static final String ABOUT_US = "Про нас";
    private static final By ABOUT_US_TEXT = By.xpath("//div[@id='node-2']/div/div[1]/h2");
    //линк "STOP Trufficking" в плагине фейсбука
    private static final By FB_PLUGIN_STOP_TRAFFICKING_LINK = By.xpath("//a[contains(concat(' ', @class, ' '), ' _1drp _5lv6 ')]");
    //кнопка "Вподобати сторінку" в плагине фейсбука
    private static final By FB_PLUGIN_LIKE_PAGE_BUTTON = By.xpath("//form[@id='u_0_1']");
    //кнопка "Поширити" в плагине фейсбука
    private static final By FB_PLUGIN_SHARE_BUTTON = By.xpath("//a[@id='u_0_2']");

    public AboutUsPage(Browser browser) {
        super(browser);
    }

    public WebElement aboutUsText(Browser browser) {
        return browser.findElement(ABOUT_US_TEXT);
    }

    public WebElement fbPluginStopTraffickingLink(Browser browser) {
        return browser.findElement(FB_PLUGIN_STOP_TRAFFICKING_LINK);
    }

    public WebElement fbPluginLikePageButton(Browser browser) {
        return browser.findElement(FB_PLUGIN_LIKE_PAGE_BUTTON);
    }

    public WebElement fbPluginShareButton(Browser browser) {
        return browser.findElement(FB_PLUGIN_SHARE_BUTTON);
    }

    @Override
    public boolean isOpened() {
        logger.info("About Us page is opened");
        if (aboutUsText(browser).isDisplayed() && aboutUsText(browser).getText().equals(ABOUT_US)) return true;
        else return false;
    }
}
