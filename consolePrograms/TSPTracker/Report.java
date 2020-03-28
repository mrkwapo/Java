package com.Dracodess;

import java.text.ParseException;

//This class' concern is to handle displaying a report of retrieved shares
public class Report {

   private static Scraper scraper = new Scraper();

    public Report(Scraper scraper) {
        this.scraper = scraper;
    }

    //This method displays share data of a specified date or date range
    public static void getSharePricesByDateRange() throws ParseException {
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
