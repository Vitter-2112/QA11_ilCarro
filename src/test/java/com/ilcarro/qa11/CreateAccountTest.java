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
        if (!app.getHeader().isSignUpTabPresentInHeader()) {
            app.getUser().logOut();
//sign up not present, click on logout button
// [href='/signup']
        }

    }

    @Test
    public void testSignUp() {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        app.getHeader().openRegistrationForm();
        // isElementPresent(By.cssSelector("form.signup__fields"));
        //Assert.assertTrue(app.isElementPresent(By.cssSelector("form.signup__fields")));
        app.getUser().isRegistrationFormOpened();
//fill registration form
        app.getUser().fillRegistrationForm(new User().setFirstName("basilyx").setSecondName("tEklsha").setEmail("bukr@web.de").setPassword("dglGZ0425"));

//wd.findElement(By.cssSelector("#check_policy")).click();
        app.getUser().selectPolicyCheckbox();

        //click Submit Button
        app.getUser().submitForm();
        //check login form displayed
       Assert.assertTrue(app.getUser().isLoginFormPresent());

    }

    @Test
    public void testSignUpWithoutPassword() {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        app.getHeader().openRegistrationForm();
        app.getUser().isRegistrationFormOpened();
        app.getUser().fillRegistrationForm(new User().setFirstName("basilyx").setSecondName("tEklsha").setEmail("bukr@web.de"));
        app.getUser().selectPolicyCheckbox();
        app.getUser().submitForm();
        Assert.assertTrue(app.getUser().isLoginFormPresent()); }

}

        // isElementPresent(By.cssSelector("form.signup__fields"));
      /*  Assert.assertTrue(app.isElementPresent(By.cssSelector("form.signup__fields")));
//fill registration form
        app.fillRegistrationForm(new User()
                .setFirstName("lasilij")
                .setSecondName("pEklmn")
                .setEmail("zukr@web.de"));*/

//wd.findElement(By.cssSelector("#check_policy")).click();


        //Thread.sleep(2000);

        //click Submit Button

        //check login form displayed
        //Assert.assertTrue(isLoginFormPresent());




