package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Browser;

import java.util.List;

//домашняя страница
public class HomePage extends AbstractPage {

    //логотип в хедере
    private static final By LOGO = By.xpath("//a[contains(concat(' ', @class, ' '), ' logo navbar-btn pull-left ')]/img");
    //линк "Про нас" в хедере
    private static final By ABOUT_US_HEADER_LINK = By.xpath("//li[contains(concat(' ', @class, ' '), ' first leaf ')]/a");
    //линк "Контакти" в хедере
    private static final By CONTACTS_HEADER_LINK = By.xpath("//div[contains(concat(' ', @class, ' '), ' hidden-sm hidden-xs main-menu-wrapper ')]/ul/li[2]/a");
    //линк "Партнери" в хедере
    private static final By PARTNERS_HEADER_LINK = By.xpath("//div[contains(concat(' ', @class, ' '), ' hidden-sm hidden-xs main-menu-wrapper ')]/ul/li[3]/a");
    //линк "Заходи" в хедере
    private static final By EVENTS_HEADER_LINK = By.xpath("//div[contains(concat(' ', @class, ' '), ' hidden-sm hidden-xs main-menu-wrapper ')]/ul/li[4]/a");
    //линк "Публікації" в хедере
    private static final By PUBLICATIONS_HEADER_LINK = By.xpath("//div[contains(concat(' ', @class, ' '), ' hidden-sm hidden-xs main-menu-wrapper ')]/ul/li[5]/a");

    //линк "Про нас" в футере
    private static final By ABOUT_US_FOOTER_LINK = By.xpath("//li[contains(concat(' ', @class, ' '), ' menu-488 first ')]/a");
    //линк "Контакти" в футере
    private static final By CONTACTS_FOOTER_LINK = By.xpath("//li[contains(concat(' ', @class, ' '), ' menu-489 active ')]/a");
    //линк "Партнери" в футере
    private static final By PARTNERS_FOOTER_LINK = By.xpath("//li[contains(concat(' ', @class, ' '), ' menu-491 active ')]/a");
    //линк "Заходи" в футере
    private static final By EVENTS_FOOTER_LINK = By.xpath("//li[contains(concat(' ', @class, ' '), ' menu-490 ')]/a");
    //линк "Публікації" в футере
    private static final By PUBLICATIONS_FOOTER_LINK = By.xpath("//li[contains(concat(' ', @class, ' '), ' menu-492 last ')]/a");

    //линк изменения языка на англ
    private static final By CHANGE_TO_ENG_LINK = By.xpath("//section[@id='block-locale-language']/ul/li[1]/a/img");
    //линк изменения языка на укр
    private static final By CHANGE_TO_UKR_LINK = By.xpath("//section[@id='block-locale-language']/ul/li[2]/a/img");

    //заголовок "Знай" инфоблока
    private static final By INFOBLOCK_KNOW_TITLE = By.xpath("//div[@id='second-block']/div/div/div[1]/h1");
    //заголовок "Розумій" инфоблока
    private static final By INFOBLOCK_UNDERSTAND_TITLE = By.xpath("//div[@id='third-block']/div/div/div[1]/h1");
    //заголовок "Дій" инфоблока
    private static final By INFOBLOCK_ACTION_TITLE = By.xpath("//div[@id='fourth-block']/div/div/div[1]/h1");

    //линки с текстом "Поділитись цим фактом"
    private static final By SHARE_THIS_FACT_LINKS = By.xpath("//td[contains(concat(' ', @class, ' '), ' fact-text ')]/a");

    //линк для подписки на youtube
    private static final By YT_FOOTER_LINK = By.xpath("//td[contains(concat(' ', @class, ' '), ' col-lg-2 col-md-2 col-sm-3 col-xs-3 social-icons ')]/a[1]");
    //линк для подписки на facebook
    private static final By FB_FOOTER_LINK = By.xpath("//td[contains(concat(' ', @class, ' '), ' col-lg-2 col-md-2 col-sm-3 col-xs-3 social-icons ')]/a[2]");
    //линк для подписки на rss
    private static final By RSS_FOOTER_LINK = By.xpath("//td[contains(concat(' ', @class, ' '), ' col-lg-2 col-md-2 col-sm-3 col-xs-3 social-icons ')]/a[3]");

    //кнопка с текстом "Знай"
    private static final By KNOW_BUTTON = By.xpath("//button[@id='know-btn']");
    //кнопка с текстом "Розумій"
    private static final By UNDERSTAND_BUTTON = By.xpath("//button[@id='understand-btn']");
    //кнопка с текстом "Дій"
    private static final By ACTION_BUTTON = By.xpath("//button[@id='act-btn']");
    //кнопки под инфоблоками (по 3 в каждом)
    private static final By UNDER_INFOBLOCKS_BUTTONS = By.xpath("//div[contains(concat(' ', @class, ' '), ' col-lg-12 col-md-12 col-sm-7 col-xs-7 ')]/button");
    //DropDownMenu под инфоблоком "Знай"
    private static final By CHOOSE_REPORT_DROPDOWNMENU_BUTTON = By.xpath("//button[@id='dropdownMenu1']");
    //первый пункт DropDownMenu под инфоблоком "Знай"
    private static final By CHOOSE_REPORT_DROPDOWNMENU_BUTTON_FIRST_ITEM = By.xpath("//ul[contains(concat(' ', @class, ' '), ' menu dropdown-menu ')]/li[1]");
    //пункты DropDownMenu под инфоблоком "Знай"
    private static final By CHOOSE_REPORT_DROPDOWNMENU_BUTTON_ITEMS = By.xpath("//ul[@id='stat-dropdown']/li");
    //кнопка "Детальніше" в блоке "Статистика"
    private static final By STATISTICS_MORE_BUTTON = By.xpath("//a[@id='statistics-more-a']/button");

    public HomePage(Browser browser) {
        super(browser);
    }

    public WebElement logo(Browser browser) {
        return browser.findElement(LOGO);
    }

    public WebElement aboutUsHeaderLink(Browser browser) {
        return browser.findElement(ABOUT_US_HEADER_LINK);
    }

    public WebElement contactsHeaderLink(Browser browser) {
        return browser.findElement(CONTACTS_HEADER_LINK);
    }

    public WebElement partnersHeaderLink(Browser browser) {
        return browser.findElement(PARTNERS_HEADER_LINK);
    }

    public WebElement eventsHeaderLink(Browser browser) {
        return browser.findElement(EVENTS_HEADER_LINK);
    }

    public WebElement publicationsHeaderLink(Browser browser) {
        return browser.findElement(PUBLICATIONS_HEADER_LINK);
    }

    public WebElement aboutUsFooterLink(Browser browser) {
        return browser.findElement(ABOUT_US_FOOTER_LINK);
    }

    public WebElement contactsFooterLink(Browser browser) {
        return browser.findElement(CONTACTS_FOOTER_LINK);
    }

    public WebElement partnersFooterLink(Browser browser) {
        return browser.findElement(PARTNERS_FOOTER_LINK);
    }

    public WebElement eventsFooterLink(Browser browser) {
        return browser.findElement(EVENTS_FOOTER_LINK);
    }

    public WebElement publicationsFooterLink(Browser browser) {
        return browser.findElement(PUBLICATIONS_FOOTER_LINK);
    }

    public WebElement changeToEngLink(Browser browser) {
        return browser.findElement(CHANGE_TO_ENG_LINK);
    }

    public WebElement changeToUkrLink(Browser browser) {
        return browser.findElement(CHANGE_TO_UKR_LINK);
    }

    public WebElement infoblockKnowTitle(Browser browser) {
        return browser.findElement(INFOBLOCK_KNOW_TITLE);
    }

    public WebElement infoblockUnderstandTitle(Browser browser) {
        return browser.findElement(INFOBLOCK_UNDERSTAND_TITLE);
    }

    public WebElement infoblockActionTitle(Browser browser) {
        return browser.findElement(INFOBLOCK_ACTION_TITLE);
    }

    public List<WebElement> shareThisFactLinks(Browser browser) {
        return browser.findElements(SHARE_THIS_FACT_LINKS);
    }

    public WebElement ytFooterLink(Browser browser) {
        return browser.findElement(YT_FOOTER_LINK);
    }

    public WebElement fbFooterLink(Browser browser) {
        return browser.findElement(FB_FOOTER_LINK);
    }

    public WebElement rssFooterLink(Browser browser) {
        return browser.findElement(RSS_FOOTER_LINK);
    }

    public WebElement knowButton(Browser browser) {
        return browser.findElement(KNOW_BUTTON);
    }

    public WebElement understandButton(Browser browser) {
        return browser.findElement(UNDERSTAND_BUTTON);
    }

    public WebElement actionButton(Browser browser) {
        return browser.findElement(ACTION_BUTTON);
    }

    public List<WebElement> underInfoblocksButtons(Browser browser) {
        return browser.findElements(UNDER_INFOBLOCKS_BUTTONS);
    }

    public WebElement chooseReportDropDownMenuButton(Browser browser) {
        return browser.findElement(CHOOSE_REPORT_DROPDOWNMENU_BUTTON);
    }

    public WebElement firstItemChooseReportDropDownMenuButton(Browser browser) {
        return browser.findElement(CHOOSE_REPORT_DROPDOWNMENU_BUTTON_FIRST_ITEM);
    }

    public List<WebElement> chooseReportDropDownMenuButtonItems(Browser browser) {
        return browser.findElements(CHOOSE_REPORT_DROPDOWNMENU_BUTTON_ITEMS);
    }

    public WebElement statisticsMoreButton(Browser browser) {
        return browser.findElement(STATISTICS_MORE_BUTTON);
    }

    public AboutUsPage openAboutUsPage() {
        logger.debug("Open About Us Page");
        return new AboutUsPage(browser);
    }

    public ContactsPage openContactsPage() {
        logger.debug("Open Contacts Page");
        return new ContactsPage(browser);
    }

    public PartnersPage openPartnersPage() {
        logger.debug("Open Partners Page");
        return new PartnersPage(browser);
    }

    public EventsPage openEventsPage() {
        logger.debug("Open Events Page");
        return new EventsPage(browser);
    }

    public PublicationsPage openPublicationsPage() {
        logger.debug("Open Publications Page");
        return new PublicationsPage(browser);
    }

    @Override
    public boolean isOpened() {
        logger.debug("Home page is opened");
        return logo(browser).isDisplayed();
    }
}
