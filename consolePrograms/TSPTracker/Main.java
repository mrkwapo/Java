package com.Dracodess;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/YourPathTo/chromedriver.exe");
        var sharePrices = new ShareData();
        sharePrices.displayCurrentPricesOfToday();
        sharePrices.displayPast25daysOfPrices();
        sharePrices.displaySharePricesByDateRange();
    }
}
