package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        //goto login page
        if (!isLoginFormPresent()) {


            //if user logged in, click logout,goto login
            if (userLoggedIn()) {
                logOut();
            }
            clickLoginTabOnHeader();
        }
    }


    @Test
    public void loginRegisteredUserPositiveTest() {
        //goto login page
        //fill login form
        fillLoginForm(new User().setFirstName("basilij").setSecondName("tEklmn").setEmail("sukr@web.de").setPassword("dglmZ0425"));
        // submit login
        submitForm();
        //Assert userLoggedIn
        Assert.assertTrue(userLoggedIn());
        String email = wd.findElement(By.cssSelector("[href=\'/account\']")).getText();
        System.out.println(email);
        Assert.assertEquals(email, "sukr@web.de");
    }

    public void fillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

}
