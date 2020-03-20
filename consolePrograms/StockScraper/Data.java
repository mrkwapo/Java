package com.Dracodess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.google.common.base.Strings.isNullOrEmpty;

public class Data {
    public void ParseData(WebDriver driver) throws InterruptedException
    {
        var wait = new WebDriverWait(driver, 20000);

        var data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pf-detail-table"))).findElements(By.tagName("td"));

        for (var item : data)
            if (!isNullOrEmpty(item.getText()) && (!item.getText().equals("Trade")) && (!item.getText().equals("-")))
                System.out.println(item.getText());
    }

}
