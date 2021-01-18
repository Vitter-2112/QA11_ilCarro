package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
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

    public boolean isCarFormPresent2(By by) {
        try {
            wd.findElements(by);
            return true;
        } catch (NoSuchElementException ex) {
            System.out.println(" element not found");
            return false;
        }
    }

    public void type(By locator, String text) {
        if (text != null) {
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void submitForm() {
        click(By.cssSelector("[type='submit']"));
    }

    public void pause(int millis) throws InterruptedException {

        Thread.sleep(millis);
    }
}
