package com.Dracodess;

import org.openqa.selenium.NoSuchSessionException;

public class Main {

    public static void main(String[] args) throws NoSuchSessionException {
        var sharePrices = new SharePrices();
        sharePrices.getCurrentPricesOfToday();
        sharePrices.getPast25daysOfPrices();
    }
}
