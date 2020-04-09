package com.Dracodess;

public class Report {
    static Scraper scraper = new YahooScraper2020();

    public static void displayStockData() {
        var data = scraper.getData();
        System.out.println("________________________");
        System.out.println("Stock Report");
        System.out.println("________________________");
        for (String item : data) {
            System.out.println(item);
        }
    }
}
