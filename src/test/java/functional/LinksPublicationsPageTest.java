package functional;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PublicationsPage;

import java.io.IOException;

public class LinksPublicationsPageTest extends AbstractTest {

    //тест видимости и работоспособности линка на первую публикацию
    @Test
    public void testFirstPublicationLink() throws IOException {
        logger.info("Start of create testFirstPublicationLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.publicationsHeaderLink(browser).isDisplayed());
        hp.publicationsHeaderLink(browser).click();

        PublicationsPage pp = hp.openPublicationsPage();
        Assert.assertTrue(pp.isOpened());

        Assert.assertTrue(pp.firstPublicationLink(browser).isDisplayed());
        pp.firstPublicationLink(browser).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("End of create testFirstPublicationLink");
    }

}
