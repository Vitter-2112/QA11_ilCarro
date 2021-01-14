package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
    //preconditions: user should be logged out
    //click on SignUp Button
    //fill registration form
    // click submit button
    //check login form displayed

    @BeforeMethod

    public void ensurePreconditions() {
        if (!isElementPresent(By.cssSelector("[href='/signup']"))) {
            click(By.xpath("//a[contains(.,'logOut')]"));
//sign up not present, click on logout button
            //xpath: //a[contains(.,'logOut')]

            // [href='/signup']
        }

    }
    @Test
    public void testSignUp(){
       // wd.findElement(By.cssSelector("[href='/signup']")).click();
        click(By.cssSelector("[href='/signup']"));
       // isElementPresent(By.cssSelector("form.signup__fields"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));

        type(By.cssSelector("#first_name"), "Immanuil");

        type(By.cssSelector("#second_name"), "Kant");

        type(By.cssSelector("#email"), "immanuil@gmail.com");

        type(By.cssSelector("#password"), "Mani12345");

        //wd.findElement(By.cssSelector("#check_policy")).click();
         click (By.cssSelector("#check_policy"));

         //click Submit Button
        click(By.cssSelector("[type='submit'"));
    }

}


