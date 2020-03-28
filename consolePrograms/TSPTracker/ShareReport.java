package com.Dracodess;

import java.text.ParseException;

public class ShareReport {

    //This method displays share data of a specified date or date range
    public static void displaySharePricesByDateRange() throws ParseException {
        Scraper scraper = new Scraper();
        scraper.navigateToPage();
        scraper.inputDateRange();
        var prices = scraper.getShareData();

        System.out.println();
        System.out.println("______________________");
        System.out.println("SHARE PRICE REPORT:");
        System.out.println("______________________");
        for (var item : prices)
            System.out.println(item.getText());
    }
}
