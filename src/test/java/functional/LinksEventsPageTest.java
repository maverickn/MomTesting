package functional;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EventsPage;
import pages.HomePage;

import java.io.IOException;

public class LinksEventsPageTest extends AbstractTest {

    //тест перенапрвления на страницы мероприятий
    @Test
    public void testEventsLinks() throws IOException {
        logger.info("Start of create testEventsLinks");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.eventsHeaderLink(browser).isDisplayed());
        hp.eventsHeaderLink(browser).click();

        EventsPage ep = hp.openEventsPage();
        Assert.assertTrue(ep.isOpened());

        for (int i = 1; i <= 12; i++) {
            Assert.assertTrue(ep.eventsLink(browser, i).isDisplayed());
            (new Actions(browser.driver)).moveToElement(ep.eventsLink(browser, i)).perform();

            Assert.assertTrue(ep.eventsLinkText(browser, i).isDisplayed());
            ep.eventsLinkText(browser, i).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            browser.navigate().back();
        }

        logger.info("End of create testEventsLinks");
    }
}
