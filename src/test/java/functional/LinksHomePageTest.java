package functional;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.util.List;

public class LinksHomePageTest extends AbstractTest {

    private static final String KNOW_BUTTON_TEXT_ENG = "KNOW";
    private static final String KNOW_BUTTON_TEXT_UKR = "ЗНАЙ";

    //тест перенаправления Домашняя -> "Про нас"
    @Test
    public void testAboutUsLinkHeader() throws IOException {
        logger.info("Start of create testAboutUsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.aboutUsHeaderLink(browser).isDisplayed());
        hp.aboutUsHeaderLink(browser).click();

        AboutUsPage aup = hp.openAboutUsPage();
        Assert.assertTrue(aup.isOpened());

        logger.info("End of create testAboutUsLinkHeader");
    }

    //тест перенаправления Домашняя -> "Контакти"
    @Test
    public void testContactsLinkHeader() throws IOException {
        logger.info("Start of create testContactsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.contactsHeaderLink(browser).isDisplayed());
        hp.contactsHeaderLink(browser).click();

        ContactsPage cp = hp.openContactsPage();
        Assert.assertTrue(cp.isOpened());

        logger.info("End of create testContactsLinkHeader");
    }

    //тест перенаправления Домашняя -> "Партнери"
    @Test
    public void testPartnersLinkHeader() throws IOException {
        logger.info("Start of create testPartnersLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.partnersHeaderLink(browser).isDisplayed());
        hp.partnersHeaderLink(browser).click();

        PartnersPage pp = hp.openPartnersPage();
        Assert.assertTrue(pp.isOpened());

        logger.info("End of create testPartnersLinkHeader");
    }

    //тест перенаправления Домашняя -> "Заходи"
    @Test
    public void testEventsLinkHeader() throws IOException {
        logger.info("Start of create testEventsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.eventsHeaderLink(browser).isDisplayed());
        hp.eventsHeaderLink(browser).click();

        EventsPage ep = hp.openEventsPage();
        Assert.assertTrue(ep.isOpened());

        logger.info("End of create testEventsLinkHeader");
    }

    //тест перенаправления Домашняя -> "Публікації"
    @Test
    public void testPublicationsLinkHeader() throws IOException {
        logger.info("Start of create testPublicationsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.publicationsHeaderLink(browser).isDisplayed());
        hp.publicationsHeaderLink(browser).click();

        PublicationsPage pp = hp.openPublicationsPage();
        Assert.assertTrue(pp.isOpened());

        logger.info("End of create testPublicationsLinkHeader");
    }

    //тест изменения отображения сайта на англ
    @Test
    public void testChangeToEngLink() throws IOException {
        logger.info("Start of create testChangeToEngLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.changeToEngLink(browser).isDisplayed());

        hp.changeToEngLink(browser).click();
        Assert.assertEquals(hp.knowButton(browser).getText(), KNOW_BUTTON_TEXT_ENG);

        logger.info("End of create testChangeToEngLink");
    }

    //тест изменения отображения сайта на укр
    @Test
    public void testChangeToUkrLink() throws IOException {
        logger.info("Start of create testChangeToUkrLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        Assert.assertTrue(hp.changeToEngLink(browser).isDisplayed());
        hp.changeToEngLink(browser).click();

        Assert.assertTrue(hp.changeToUkrLink(browser).isDisplayed());
        hp.changeToUkrLink(browser).click();
        Assert.assertEquals(hp.knowButton(browser).getText(), KNOW_BUTTON_TEXT_UKR);


        Assert.assertTrue(hp.changeToEngLink(browser).isDisplayed());
        hp.changeToEngLink(browser).click();

        logger.info("End of create testChangeToUkrLink");
    }

    //тест перенаправления Домашняя -> "Про нас"
    @Test
    public void testAboutUsLinkFooter() throws IOException {
        logger.info("Start of create testAboutUsLinkFooter");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.aboutUsFooterLink(browser).isDisplayed());
        hp.aboutUsFooterLink(browser).click();

        AboutUsPage aup = hp.openAboutUsPage();
        Assert.assertTrue(aup.isOpened());

        logger.info("End of create testAboutUsLinkFooter");
    }

    //тест перенаправления Домашняя -> "Контакти"
    @Test
    public void testContactsLinkFooter() throws IOException {
        logger.info("Start of create testContactsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.contactsFooterLink(browser).isDisplayed());
        hp.contactsFooterLink(browser).click();

        ContactsPage cp = hp.openContactsPage();
        Assert.assertTrue(cp.isOpened());

        logger.info("End of create testContactsLinkHeader");
    }

    //тест перенаправления Домашняя -> "Партнери"
    @Test
    public void testPartnersLinkFooter() throws IOException {
        logger.info("Start of create testPartnersLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.partnersFooterLink(browser).isDisplayed());
        hp.partnersFooterLink(browser).click();

        PartnersPage pp = hp.openPartnersPage();
        Assert.assertTrue(pp.isOpened());

        logger.info("End of create testPartnersLinkHeader");
    }

    //тест перенаправления Домашняя -> "Заходи"
    @Test
    public void testEventsLinkFooter() throws IOException {
        logger.info("Start of create testEventsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.eventsFooterLink(browser).isDisplayed());
        hp.eventsFooterLink(browser).click();

        EventsPage ep = hp.openEventsPage();
        Assert.assertTrue(ep.isOpened());

        logger.info("End of create testEventsLinkHeader");
    }

    //тест перенаправления Домашняя -> "Публікації"
    @Test
    public void testPublicationsLinkFooter() throws IOException {
        logger.info("Start of create testPublicationsLinkHeader");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.publicationsFooterLink(browser).isDisplayed());
        hp.publicationsFooterLink(browser).click();

        PublicationsPage pp = hp.openPublicationsPage();
        Assert.assertTrue(pp.isOpened());

        logger.info("End of create testPublicationsLinkHeader");
    }

    //тест видимости ликнов "Поділитись цим фактом"
    @Test
    public void testShareThisFactLinks() throws IOException {
        logger.info("Start of create testShareThisFactLinks");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        List<WebElement> list = hp.shareThisFactLinks(browser);
        for (WebElement webEl : list) {
            Assert.assertTrue(webEl.isDisplayed());
            webEl.click();
        }

        logger.info("End of create testShareThisFactLinks");
    }

    //тест видимости линка подписки на youtube
    @Test
    public void testYtFooterLink() throws IOException {
        logger.info("Start of create testYtFooterLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.ytFooterLink(browser).isDisplayed());
        hp.ytFooterLink(browser).click();

        logger.info("End of create testYtFooterLink");
    }

    //тест видимости линка подписки на facebook
    @Test
    public void testFbFooterLink() throws IOException {
        logger.info("Start of create testFbFooterLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.fbFooterLink(browser).isDisplayed());
        hp.fbFooterLink(browser).click();

        logger.info("End of create testFbFooterLink");
    }

    //тест видимости линка подписки на RSS
    @Test
    public void testRssFooterLink() throws IOException {
        logger.info("Start of create testRssFooterLink");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.rssFooterLink(browser).isDisplayed());
        hp.rssFooterLink(browser).click();

        logger.info("End of create testRssFooterLink");
    }
}