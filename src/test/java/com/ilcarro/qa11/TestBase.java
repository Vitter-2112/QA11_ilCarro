package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {

     WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com/");

    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.quit();
    }

    public boolean isCarFormPresent() {
        return wd.findElements(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form")).size() > 0;
    }

    public boolean isCarFormPresent2(By by) {
        try {
            wd.findElements(by);
            return true;
        } catch (NoSuchElementException ex) {
            System.out.println(" element not found");
            return false;
        }
    }

    /*public boolean isCarFormPresent2() {
            try {
                wd.findElements(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
                return true;
            } catch (NoSuchElementException ex) {
                System.out.println("no such element");
                return false;
            }

            }*/
    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }
}
