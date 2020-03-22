package com.Dracodess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class ShareData {
    //This method navigates to the TSP page, waits for data to be visible, then returns the data in a List
    private List<WebElement> accessData(){
        //Setting up and instantiating Chrome WebDriver
        System.setProperty("webdriver.chrome.driver","C:/Users/Kwapalapagus/Desktop/Chrome/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        //Using Web Driver to Navigate to the TSP Page
        driver.get("https://www.tsp.gov/InvestmentFunds/FundPerformance/index.html");

        //Using Selenium's Wait Class to handle timing
        WebDriverWait wait = new WebDriverWait(driver, 20000);

        //Selecting Table Data
        List<WebElement> data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tspStandard"))).findElements(By.tagName("td"));
        return data;
    }
    //This method displays today's most current share prices
    public List displayCurrentPricesOfToday(){
        ArrayList<String> currentSharePriceData = new ArrayList();
        var prices = accessData();

        for(var item = 0; item <= 10; item++){
            System.out.println(prices.get(item).getText());
            currentSharePriceData.add(prices.get(item).getText());
        }
        return currentSharePriceData;
    }

    //This method displays current share prices of the past 25 days
    public List displayPast25daysOfPrices(){
        ArrayList<String> past25SharePriceData = new ArrayList();
        var prices = accessData();

        for (var item : prices){
            past25SharePriceData.add(item.getText());
            System.out.println(item.getText());
        }
        return past25SharePriceData;
    }
}
