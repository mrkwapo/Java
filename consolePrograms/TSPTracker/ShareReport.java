package com.Dracodess;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ShareReport {

    //This method displays share data of a specified date or date range
    public static void displaySharePricesByDateRange() throws ParseException {
        ShareData shareData = new ShareData();
        shareData.navigateToPage();
        shareData.inputDateRange();
        var prices = shareData.getShareData();

        System.out.println();
        System.out.println("______________________");
        System.out.println("SHARE PRICE REPORT:");
        System.out.println("______________________");
        for (var item : prices)
            System.out.println(item.getText());
    }
}
