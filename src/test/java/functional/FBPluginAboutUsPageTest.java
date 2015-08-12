package functional;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AboutUsPage;
import pages.HomePage;

import java.io.IOException;

public class FBPluginAboutUsPageTest extends AbstractTest {

    //тест видимости и работоспособности линка "STOP Trufficking" в плагине фейсбука
    @Test
    public void testFBPluginStopTraffickingLink() throws IOException {
        logger.info("Start of create testFBPluginStopTraffickingLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.aboutUsHeaderLink(browser).isDisplayed());
        hp.aboutUsHeaderLink(browser).click();

        AboutUsPage aup = hp.openAboutUsPage();
        Assert.assertTrue(aup.isOpened());

        browser.switchTo().frame(2);
        Assert.assertTrue(aup.fbPluginStopTraffickingLink(browser).isDisplayed());
        aup.fbPluginStopTraffickingLink(browser).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("End of create testFBPluginStopTraffickingLink");
    }

    //тест видимости и работоспособности кнопки "Вподобати сторінку" в плагине фейсбука
    @Test
    public void testFBPluginLikePageButton() throws IOException {
        logger.info("Start of create testFBPluginLikePageButton");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.aboutUsHeaderLink(browser).isDisplayed());
        hp.aboutUsHeaderLink(browser).click();

        AboutUsPage aup = hp.openAboutUsPage();
        Assert.assertTrue(aup.isOpened());

        browser.switchTo().frame(2);
        Assert.assertTrue(aup.fbPluginLikePageButton(browser).isDisplayed());
        aup.fbPluginLikePageButton(browser).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("End of create testFBPluginLikePageButton");
    }

    //тест видимости и работоспособности кнопки "Поширити" в плагине фейсбука
    @Test
    public void testFBPluginShareButton() throws IOException {
        logger.info("Start of create testFBPluginShareButton");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.aboutUsHeaderLink(browser).isDisplayed());
        hp.aboutUsHeaderLink(browser).click();

        AboutUsPage aup = hp.openAboutUsPage();
        Assert.assertTrue(aup.isOpened());

        browser.switchTo().frame(2);
        Assert.assertTrue(aup.fbPluginShareButton(browser).isDisplayed());
        aup.fbPluginShareButton(browser).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("End of create testFBPluginShareButton");
    }

}
