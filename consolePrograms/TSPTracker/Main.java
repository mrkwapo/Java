package com.Dracodess;
public class Main {
    public static void main(String[] args) {
        var sharePrices = new ShareData();
        sharePrices.displayCurrentPricesOfToday();
        sharePrices.displayPast25daysOfPrices();
    }
}
