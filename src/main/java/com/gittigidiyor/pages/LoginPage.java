package com.gittigidiyor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HomePage {
    private By emailBy = By.id("L-UserNameField");
    private By passwordBy = By.id("L-PasswordField");
    private By loginEnterBy = By.id("gg-login-enter");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(String mail, String password) {
        sendKeys(emailBy, mail);
        sendKeys(passwordBy, password);
        click(loginEnterBy, 5);
        return new HomePage(webDriver);
    }
}
