package com.gittigidiyor.pages;

import com.gittigidiyor.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebDriverHelper {
    private By accountButtonBy = By.className("gekhq4-3");
    private By loginButtonBy = By.cssSelector("[data-cy='header-login-button']");
    private By userNameBy = By.cssSelector("div[class='gekhq4-4 hwMdSM']>:nth-child(2)");
    private By searchBoxBy = By.className("sc-4995aq-0");
    private By findButtonBy = By.cssSelector(".qjixn8-0.sc-1bydi5r-0.hKfdXF");


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getHomePageTitle() {
        return getTitle();
    }

    public void touchLoginButton() {
        click(accountButtonBy, 1);
    }

    public LoginPage getLoginPage() {
        click(loginButtonBy, 5);
        return new LoginPage(webDriver);
    }

    public String getUserName() {
        return getText(userNameBy);
    }

    public SearchResultPage search(String keyword) {
        webDriver.findElement(searchBoxBy).sendKeys(keyword);
        webDriver.findElement(findButtonBy).click();
        return new SearchResultPage(webDriver);
    }


}
