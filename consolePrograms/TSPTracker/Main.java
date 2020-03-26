package com.Dracodess;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Kwapalapagus/Desktop/Chrome/chromedriver.exe");
        var shareData = new ShareData();
        ShareReport.displaySharePricesByDateRange(shareData);
    }
}
