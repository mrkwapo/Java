package com.Dracodess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Strings.isNullOrEmpty;

public class YahooScraper2020 implements Scraper {

    private String PATH = System.setProperty("webdriver.chrome.driver", "C:/Users/Kwapalapagus/Desktop/Chrome/chromedriver.exe");
    private WebDriver driver = new ChromeDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 20000);


    @Override
    public void login() {
        driver.get("https://login.yahoo.com/config/login?.intl=us&.lang=en-US&.src=finance&.done=https%3A%2F%2Ffinance.yahoo.com%2F");


        WebElement userNameInputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));

        userNameInputBox.sendKeys("mrkwapo@yahoo.com");

        WebElement usernameNextButton = driver.findElement(By.id("login-signin"));

        usernameNextButton.sendKeys(Keys.RETURN);

        WebElement passwordInputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));

        passwordInputBox.sendKeys("Careerdevs1!");

        WebElement passwordNextButton = driver.findElement(By.id("login-signin"));
        passwordNextButton.sendKeys(Keys.RETURN);

        WebElement watchlistLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("My Watchlist")));

        watchlistLink.sendKeys(Keys.RETURN);
    }

    @Override
    public List<String> ParseData() {
        login();
        List<WebElement> data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pf-detail-table"))).findElements(By.tagName("td"));

        List<String> parsedData = new ArrayList<>();

        for (WebElement item : data)
            if (!isNullOrEmpty(item.getText()) && (!item.getText().equals("Trade")) && (!item.getText().equals("-"))) {
                parsedData.add(item.getText());

            }
        return parsedData;
    }

    @Override
    public List<String> getData() {
        return ParseData();
    }


}
