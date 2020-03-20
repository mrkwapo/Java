package com.Dracodess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Kwapalapagus/Desktop/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        yahooWatchlist yahoo = new yahooWatchlist();
        yahoo.login(driver);
        Data data = new Data();
        data.displayStockData(driver);
        driver.close();
    }
}
