package tests;

import base.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public  class BaseTest {

    @Before
    public void setUP() {
        DriverManager.createInstance("firefox");
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://inpost.pl");
        driver.manage().window().maximize();


    }

    @After
    public void thearDown() {
        DriverManager.getDriver().close();

    }
}

