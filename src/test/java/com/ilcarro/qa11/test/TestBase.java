package com.ilcarro.qa11.test;

import com.ilcarro.qa11.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod
    public void setUp() {
        app.init();

    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();
        //logger.info
    }

}
