package com.Dracodess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Kwapalapagus/Desktop/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        var yahoo = new yahooWatchlist();
        yahoo.getWatchlist(driver);

        var data = new Data();
        data.ParseData(driver);
        driver.close();
    }
}
