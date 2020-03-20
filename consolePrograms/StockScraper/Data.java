package com.Dracodess;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import java.util.ArrayList;
        import java.util.List;

        import static com.google.common.base.Strings.isNullOrEmpty;

public class Data {
    private ArrayList<String> ParseData(WebDriver driver) throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 20000);

        List<WebElement> data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pf-detail-table"))).findElements(By.tagName("td"));

        ArrayList<String> parsedData = new ArrayList<String>();

        for (WebElement item : data)
            if (!isNullOrEmpty(item.getText()) && (!item.getText().equals("Trade")) && (!item.getText().equals("-"))){
                parsedData.add(item.getText());
            }
        return parsedData;
    }

    public void displayStockData(WebDriver driver) throws InterruptedException {
        for (String item : ParseData(driver)) {
            System.out.println(item);
        }
    }

}
