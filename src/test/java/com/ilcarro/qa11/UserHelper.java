package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
                super(wd);
    }

    public void logOut() {
        click(By.xpath("//a[contains(.,'logOut')]"));
    }

    public boolean userLoggedIn() {
        return isElementPresent(By.xpath("//a[contains(.,'logOut')]"));
    }

    public void fillLoginForm(User user) {
        type(By.name("email"), user.getEmail());
        type(By.name("password"), user.getPassword());
    }

    protected void login() {
        click(By.cssSelector("[href='/login']"));
        fillLoginForm(new User()
                .setEmail("sukr@web.de")
                .setPassword("dglmZ0425"));
        // submit login
        submitForm();
    }

    public void fillRegistrationForm(User user) {
        type(By.name("first_name"), user.getFirstName());
        type(By.name("second_name"), user.getSecondName());
        fillLoginForm(user);
    }
    public Boolean isLoginFormPresent() {
        return isElementPresent(By.cssSelector(".Login_login__right_block__1niYm"));
    }

    public void isRegistrationFormOpened() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".Login_login__right_block__1niYm")));
    }

    public void selectPolicyCheckbox() {
        click(By.cssSelector("#check_policy"));
    }

}
