package com.Dracodess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yahooWatchlist {

    public void getWatchlist(WebDriver driver){
        
        driver.get("https://login.yahoo.com/config/login?.intl=us&.lang=en-US&.src=finance&.done=https%3A%2F%2Ffinance.yahoo.com%2F");        
        var wait = new WebDriverWait(driver, 20000);
        var userNameInputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        userNameInputBox.sendKeys("yourEmail@yahoo.com");
        var usernameNextButton = driver.findElement(By.id("login-signin"));
        usernameNextButton.sendKeys(Keys.RETURN);
        var passwordInputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
        passwordInputBox.sendKeys("yourPasswordHere");
        var passwordNextButton = driver.findElement(By.id("login-signin"));
        passwordNextButton.sendKeys(Keys.RETURN);
        var watchlistLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Watchlist")));
        watchlistLink.sendKeys(Keys.RETURN);
    }

}
