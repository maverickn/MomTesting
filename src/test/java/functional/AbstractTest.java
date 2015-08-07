package functional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PropertyLoader;
import webdriver.Browser;
import webdriver.BrowserFactory;

public class AbstractTest {
    protected Browser browser;
    protected Logger logger;

    @BeforeClass
    public void initDriver(){
        logger = LoggerFactory.getLogger(getClass());
        logger.info("Initiate environment");
        browser = BrowserFactory.create(PropertyLoader.loadProperty("browser"));
        browser.manage().window().maximize();
    }

    @AfterClass
    public void shutEnv(){
        logger.info("Shutdown environment");
        if (browser != null){
            browser.quit();
        }
    }
}
