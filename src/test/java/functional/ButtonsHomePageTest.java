package functional;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;
import java.util.List;

public class ButtonsHomePageTest extends AbstractTest {

    //тест видимости и кликабельности кнопки "Знай"
    @Test
    public void testKnowButton() throws IOException {
        logger.info("Start of create testKnowButton");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.knowButton(browser).isDisplayed());
        hp.knowButton(browser).click();
        Assert.assertTrue(hp.infoblockKnow(browser).isDisplayed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("End of create testKnowButton");
    }

    //тест видимости и кликабельности кнопки "Розумій"
    @Test
    public void testUnderstandButton() throws IOException {
        logger.info("Start of create testUnderstandButton");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.understandButton(browser).isDisplayed());
        hp.understandButton(browser).click();
        Assert.assertTrue(hp.infoblockUnderstand(browser).isDisplayed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("End of create testUnderstandButton");
    }

    //тест видимости и кликабельности кнопки "Дій"
    @Test
    public void testActionButton() throws IOException {
        logger.info("Start of create testActionButton");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.actionButton(browser).isDisplayed());
        hp.actionButton(browser).click();
        Assert.assertTrue(hp.infoblockAction(browser).isDisplayed());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("End of create testActionButton");
    }

    //тест расположения кнопок "Знай", "Розумій", "Дій" после обновления страницы
    @Test
    public void testKUALocationButtons() throws IOException {
        logger.info("Start of create testActionButton");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();
        Assert.assertTrue(hp.knowButton(browser).isDisplayed());

        //ожидаемые координаты кнопки "Знай"
        int expectedKnowButtonLocationX = 154;
        int expectedKnowButtonLocationY = 421;

        for (int i = 0; i <= 50; i++) {
            browser.navigate().refresh();
            //реальные координаты кнопки "Знай"
            int actualKnowButtonLocationX = hp.knowButton(browser).getLocation().getX();
            int actualKnowButtonLocationY = hp.knowButton(browser).getLocation().getY();

            Assert.assertEquals(actualKnowButtonLocationX, expectedKnowButtonLocationX);
            Assert.assertEquals(actualKnowButtonLocationY, expectedKnowButtonLocationY);
        }

        logger.info("End of create testActionButton");
    }

    //тест видимости кнопок (3 шт) под инфоблоками (3 шт)
    @Test
    public void testUnderInfoblocksButtons() throws IOException {
        logger.info("Start of create testUnderInfoblocksButtons");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        List<WebElement> list = hp.underInfoblocksButtons(browser);
        for (WebElement webEl : list) {
            Assert.assertTrue(webEl.isDisplayed());
            webEl.click();
        }

        logger.info("End of create testUnderInfoblocksButtons");
    }

    //тест видимости и работоспособности DropDownMenu с англ языком сайта
    @Test
    public void testChooseReportDropDownMenuButtonEng() throws IOException {
        logger.info("Start of create testChooseReportDropDownMenuButtonEng");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        Assert.assertTrue(hp.changeToEngLink(browser).isDisplayed());
        hp.changeToEngLink(browser).click();

        Assert.assertTrue(hp.chooseReportDropDownMenuButton(browser).isDisplayed());
        hp.chooseReportDropDownMenuButton(browser).click();

        Assert.assertTrue(hp.firstItemChooseReportDropDownMenuButton(browser).isDisplayed());
        hp.firstItemChooseReportDropDownMenuButton(browser).click();

        logger.info("End of create testChooseReportDropDownMenuButtonEng");
    }

    //тест видимости и работоспособности DropDownMenu с укр языком сайта
    @Test
    public void testChooseReportDropDownMenuButtonUkr() throws IOException {
        logger.info("Start of create testChooseReportDropDownMenuButtonUkr");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        Assert.assertTrue(hp.chooseReportDropDownMenuButton(browser).isDisplayed());
        hp.chooseReportDropDownMenuButton(browser).click();

        Assert.assertTrue(hp.firstItemChooseReportDropDownMenuButton(browser).isDisplayed());
        hp.firstItemChooseReportDropDownMenuButton(browser).click();

        logger.info("End of create testChooseReportDropDownMenuButtonUkr");
    }

    //тест видимости и работоспособности пунктов DropDownMenu с англ языком сайта
    @Test
    public void testChooseReportDropDownMenuButtonItemsEng() throws IOException {
        logger.info("Start of create testChooseReportDropDownMenuButtonItemsEng");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        Assert.assertTrue(hp.changeToEngLink(browser).isDisplayed());
        hp.changeToEngLink(browser).click();

        Assert.assertTrue(hp.chooseReportDropDownMenuButton(browser).isDisplayed());
        hp.chooseReportDropDownMenuButton(browser).click();

        List<WebElement> list = hp.chooseReportDropDownMenuButtonItems(browser);
        hp.chooseReportDropDownMenuButton(browser).click();
        for (WebElement webEl : list) {
            hp.chooseReportDropDownMenuButton(browser).click();
            Assert.assertTrue(webEl.isDisplayed());
            webEl.click();
            Assert.assertTrue(hp.chooseReportDropDownMenuButton(browser).getText().equals(webEl.getText()));
            hp.chooseReportDropDownMenuButton(browser).click();
            hp.statisticsMoreButton(browser).click();
        }

        logger.info("End of create testChooseReportDropDownMenuButtonItemsEng");
    }

    //тест видимости и работоспособности пунктов DropDownMenu с укр языком сайта
    @Test
    public void testChooseReportDropDownMenuButtonItemsUkr() throws IOException {
        logger.info("Start of create testChooseReportDropDownMenuButtonItemsUkr");

        HomePage hp = new HomePage(browser);
        hp.openHomePage();
        hp.isOpened();

        Assert.assertTrue(hp.chooseReportDropDownMenuButton(browser).isDisplayed());
        hp.chooseReportDropDownMenuButton(browser).click();

        List<WebElement> list = hp.chooseReportDropDownMenuButtonItems(browser);
        hp.chooseReportDropDownMenuButton(browser).click();
        for (WebElement webEl : list) {
            hp.chooseReportDropDownMenuButton(browser).click();
            Assert.assertTrue(webEl.isDisplayed());
            webEl.click();
            Assert.assertTrue(hp.chooseReportDropDownMenuButton(browser).getText().equals(webEl.getText()));
            hp.chooseReportDropDownMenuButton(browser).click();
            hp.statisticsMoreButton(browser).click();
        }

        logger.info("End of create testChooseReportDropDownMenuButtonItemsUkr");
    }
}