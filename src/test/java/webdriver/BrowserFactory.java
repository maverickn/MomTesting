package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import utils.PropertyLoader;

import java.io.File;

public class BrowserFactory {
    public static Browser create(String name){
        Browser browser;
        if("firefox".equals(name)){
            browser = new Browser(new FirefoxDriver());
        }
        /*else if ("opera".equals(name)) {
            browser = new Browser(new OperaDriver());
        }*/
        else if ("chrome".equals(name)){
            String projectPath = PropertyLoader.loadProperty("project.path");
            String filePath = "/src/test/resources/chromedriver.exe";
            File file = new File(projectPath+filePath);
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            browser = new Browser(new ChromeDriver());
        } else browser = new Browser(new FirefoxDriver());
        return browser;
    }
}
