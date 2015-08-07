package pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import webdriver.Browser;

public abstract class AbstractPage {
    protected Browser browser;
    protected Logger logger;

    public AbstractPage(Browser browser){
        this.browser = browser;
        this.logger = LoggerFactory.getLogger(getClass());
    }

    private static String MOM_URL = "http://mom.mir3.in.ua/";

    public void openHomePage() {
        logger.info("Open home page");
        browser.get(MOM_URL);
    }

    public abstract boolean isOpened();
}
