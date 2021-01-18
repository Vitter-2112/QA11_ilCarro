package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenHomePageTest  extends TestBase{

    @Test
    public void homePageTest() {
        System.out.println("site is opened");

        System.out.println("FindCarFormPresent : " + app.getCar().isCarFormPresent());
        app.getCar().isCarFormPresent2(By.cssSelector(".Main_mainpage__find_your_car__AHLkw form"));
    }


}
