package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

import static base.DriverManager.setWebDriver;

public class DriverFactory {
    public static WebDriver createWebdriverInstance(String browserName){
        WebDriver driver = null;
        if(browserName.equalsIgnoreCase("chrome"))
            if(System.getProperty("webdriver.chrome.driver")==null){
                File iDriver = new File(System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver",iDriver.getAbsolutePath());
                driver = new ChromeDriver();
            }
        if(browserName.equalsIgnoreCase("firefox"))
            if(System.getProperty("webdriver.gecko.driver")==null){
                File iDriver = new File(System.getProperty("user.dir")+"/src/main/java/drivers/geckodriver.exe");
                System.setProperty("webdriver.gecko.driver",iDriver.getAbsolutePath());
                driver = new FirefoxDriver();
            }
        return driver;


    }
}
