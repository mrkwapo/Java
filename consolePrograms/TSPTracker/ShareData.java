package com.Dracodess;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class ShareData {
    //Setting up and instantiating Chrome WebDriver to run in headless mode
    private ChromeOptions options = new ChromeOptions().addArguments("--headless");
    private WebDriver driver = new ChromeDriver(options);
    private String startDate;

    //Using scanner to read user input
    private Scanner scanner = new Scanner(System.in);

    //Using Selenium's Wait Class to handle timing
    private WebDriverWait wait = new WebDriverWait(driver, 20000);

    public void navigateToPage(){
        //Using Web Driver to Navigate to the TSP Page
        driver.get("https://www.tsp.gov/InvestmentFunds/FundPerformance/index.html");
    }
    public List<WebElement> getShareData(){
        //Selecting Table Data
        List<WebElement> data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tspStandard"))).findElements(By.tagName("td"));
        return data;
    }

    //To handle date range, this method uses the isDateValid method to obtain a valid start date from the user
    private String getStartDate() throws ParseException {
        startDate = Console.readDate("Start Date: ");
        return startDate;
    }

    //To handle date range, this method uses the isDateValid method to obtain a valid end date from the user
    private String getEndDate() throws ParseException {
        String end;
        DateFormat df = new SimpleDateFormat(Console.DATE_FORMAT);
        var start = df.parse(startDate);
        
        //Validates the end date is after or equal to the start date
        while (true) {
            String endDate = Console.readDate("End Date: ");
            if (start.before(df.parse(endDate)) || start.equals(df.parse(endDate))) {
                end = endDate;
                break;
            }
            System.out.println("End Date cannot be before Start Date");
        }
            return end;
    }

    //This method handles, entering the date range and clicking the button to retrieve data of the selected date range
    public void inputDateRange() throws ParseException {
        var startDateInputBox =  wait.until(ExpectedCnditions.visibilityOfElementLocated(By.id("startdate")));
        var endDateInputBox =  wait.until(ExpectedCondons.visibilityOfElementLocated(By.id("enddate")));

        startDateInputBox.sendKeys(Keys.CONTROL + Keys.chord("a"), getStartDate());
        endDateInputBox.sendKeys(Keys.CONTROL + Keys.chord("a"), getEndDate());

        var retrieveSharesBtn = driver.findElement(By.id("retrieve"));
        retrieveSharesBtn.sendKeys(Keys.RETURN);
    }
}
