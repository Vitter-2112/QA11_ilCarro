package com.ilcarro.qa11;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        //goto login page
        if (!app.getUser().isLoginFormPresent()) {


            //if user logged in, click logout,goto login
            if (app.getUser().userLoggedIn()) {
                app.getUser().logOut();
            }
            app.getHeader().clickLoginTabOnHeader();
        }
    }


    @Test
    public void loginRegisteredUserPositiveTest() {
        //goto login page
        //fill login form
        app.getUser().login();
        //Assert userLoggedIn
        Assert.assertTrue(app.getUser().userLoggedIn());
        String email = app.getHeader().getEmailTextFromHeader();
        System.out.println(email);
        Assert.assertEquals(email, "sukr@web.de");
    }

}
