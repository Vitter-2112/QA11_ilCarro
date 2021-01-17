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
        if (!isSignUpTabPresentInHeader()) {
            logOut();
//sign up not present, click on logout button
            //xpath: //a[contains(.,'logOut')]

            // [href='/signup']
        }

    }

    @Test
    public void testSignUp() {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        click(By.cssSelector("[href='/signup']"));
        // isElementPresent(By.cssSelector("form.signup__fields"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
//fill registration form
        fillRegistrationForm(new User().setFirstName("basilij").setSecondName("tEklmn").setEmail("sukr@web.de").setPassword("dglmZ0425"));

//wd.findElement(By.cssSelector("#check_policy")).click();
        click(By.cssSelector("#check_policy"));

        //click Submit Button
        submitForm();
        //check login form displayed
        //Assert.assertTrue(isLoginFormPresent());
        Assert.assertTrue(isElementPresent(By.cssSelector(".Login_login__right_block__1niYm")));
    }

    @Test
    public void testSignUpWithoutPassword() {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        click(By.cssSelector("[href='/signup']"));
        // isElementPresent(By.cssSelector("form.signup__fields"));
        Assert.assertTrue(isElementPresent(By.cssSelector("form.signup__fields")));
//fill registration form
        fillRegistrationForm(new User()
                .setFirstName("lasilij")
                .setSecondName("pEklmn")
                .setEmail("zukr@web.de"));

//wd.findElement(By.cssSelector("#check_policy")).click();
        click(By.cssSelector("#check_policy"));

        //Thread.sleep(2000);

        //click Submit Button
        submitForm();
        //check login form displayed
        //Assert.assertTrue(isLoginFormPresent());
        Assert.assertTrue(isElementPresent(By.cssSelector(".Login_login__right_block__1niYm")));
    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

}


