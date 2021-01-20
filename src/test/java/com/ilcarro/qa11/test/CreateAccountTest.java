package com.ilcarro.qa11.test;

import com.ilcarro.qa11.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateAccountTest extends TestBase {
    //preconditions: user should be logged out
    //click on SignUp Button
    //fill registration form
    // click submit button
    //check login form displayed
   /* @DataProvider

    public Iterator<Object[]> validUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"fName", "sName", "fName@gmail.com", "Fname1234"});
        list.add(new Object[]{"fNa", "sNa", "fNa@gmail.com", "Fna331234"});
        list.add(new Object[]{"fN", "sN", "fNzzz@gmail.com", "Fzzzz1234"});
        return list.iterator();}*/

    @BeforeMethod

    public void ensurePreconditions() {
        if (!app.getHeader().isSignUpTabPresentInHeader()) {
            app.getUser().logOut();
//sign up not present, click on logout button
// [href='/signup']
        };

    }

    @Test (enabled=false)
    public void testSignUp() {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        app.getHeader().openRegistrationForm();
        // isElementPresent(By.cssSelector("form.signup__fields"));
        //Assert.assertTrue(app.isElementPresent(By.cssSelector("form.signup__fields")));
        app.getUser().isRegistrationFormOpened();
//fill registration form
        app.getUser()
                .fillRegistrationForm(new User()
                        .setFirstName("Viktor")
                        .setSecondName("koslowski")
                        .setEmail("kost@gmail.com")
                        .setPassword("avaZ12345"));

//wd.findElement(By.cssSelector("#check_policy")).click();
        app.getUser().selectPolicyCheckbox();

        //click Submit Button
        app.getUser().submitForm();
        //check login form displayed
        Assert.assertTrue(app.getUser().isLoginFormPresent());

    }

   /* @Test
            //(dataProvider = "validUser")
    public void testSignUpFromDataProvider(String fName, String sName, String email, String password) {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        app.getHeader().openRegistrationForm();
        // isElementPresent(By.cssSelector("form.signup__fields"));
        //Assert.assertTrue(app.isElementPresent(By.cssSelector("form.signup__fields")));
        app.getUser().isRegistrationFormOpened();
//fill registration form
        app.getUser().fillRegistrationForm(new User().setFirstName(fName).setSecondName(sName).setEmail(email).setPassword(password));

//wd.findElement(By.cssSelector("#check_policy")).click();
        app.getUser().selectPolicyCheckbox();

        //click Submit Button
        app.getUser().submitForm();
        //check login form displayed
        Assert.assertTrue(app.getUser().isLoginFormPresent());

    }*/

    @Test (enabled=false)
    public void testSignUpWithoutPassword() {
        // wd.findElement(By.cssSelector("[href='/signup']")).click();
        app.getHeader().openRegistrationForm();
        app.getUser().isRegistrationFormOpened();
        app.getUser().fillRegistrationForm(new User()
                .setFirstName("basidrf")
                .setSecondName("tgrEklsha")
                .setEmail("busdgf@web.de"));
        app.getUser().selectPolicyCheckbox();
        app.getUser().submitForm();
        Assert.assertTrue(app.getUser().isLoginFormPresent());
    }

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




