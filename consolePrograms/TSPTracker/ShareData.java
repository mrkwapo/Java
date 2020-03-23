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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShareData {

    //Setting up and instantiating Chrome WebDriver to run in headless mode
    private ChromeOptions options = new ChromeOptions().addArguments("--headless");
    private WebDriver driver = new ChromeDriver(options);
    
    //Setting the date format
    private final static String DATE_FORMAT = "MM/dd/yyyy";

    //Using scanner to read user input
    private Scanner scanner = new Scanner(System.in);

    //Using Selenium's Wait Class to handle timing
    private WebDriverWait wait = new WebDriverWait(driver, 20000);

    private void navigateToPage(){
        //Using Web Driver to Navigate to the TSP Page
        driver.get("https://www.tsp.gov/InvestmentFunds/FundPerformance/index.html");
    }
    private List<WebElement> getShareData(){
        //Selecting Table Data
        List<WebElement> data = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tspStandard"))).findElements(By.tagName("td"));
        return data;
    }

    //To handle date range, this method uses the isDateValid method to obtain a valid start date from the user
    private String getStartDate(){
        String startDate;
        while (true) {
            System.out.println("Start Date: (format MM/dd/yyyy) ");
            startDate = scanner.next();
            if(isDateValid(startDate))
                break;
        }
        return startDate;
    }

    //To handle date range, this method uses the isDateValid method to obtain a valid end date from the user
    private String getEndDate(){
        String endDate;
        while(true) {
            System.out.println("End Date: (format MM/dd/yyyy) ");
            endDate = scanner.next();
            if(isDateValid(endDate))
                break;
        }
        return endDate;
    }

    //This method handles, entering the date range and clicking the button to retrieve data of the selected date range
    private void inputDateRange(){
        var startDateInputBox =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("startdate")));
        var endDateInputBox =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("enddate")));

        startDateInputBox.sendKeys(Keys.CONTROL + Keys.chord("a"), getStartDate());
        endDateInputBox.sendKeys(Keys.CONTROL + Keys.chord("a"), getEndDate());

        var retrieveSharesBtn = driver.findElement(By.id("retrieve"));
        retrieveSharesBtn.sendKeys(Keys.RETURN);
    }

    //This method displays share data when a user wants to enter a date range
    public List displaySharePricesByDateRange(){
        navigateToPage();
        inputDateRange();
        var prices = getShareData();
        List<String> dateRangeSharePrices = new ArrayList();
        for (var item : prices){
            dateRangeSharePrices.add(item.getText());
            System.out.println(item.getText());
        }
        return dateRangeSharePrices;
    }

    //This method displays today's most current share prices
    public List displayCurrentPricesOfToday(){
        navigateToPage();
        var prices = getShareData();
        List<String> currentSharePriceData = new ArrayList();

        for(var item = 0; item <= 10; item++){
            System.out.println(prices.get(item).getText());
            currentSharePriceData.add(prices.get(item).getText());
        }
        return currentSharePriceData;
    }

    //This method displays current share prices of the past 25 days
    public List displayPast25daysOfPrices(){
        navigateToPage();
        var prices = getShareData();
        List<String> past25SharePriceData = new ArrayList();

        for (var item : prices){
            past25SharePriceData.add(item.getText());
            System.out.println(item.getText());
        }
        return past25SharePriceData;
    }

    //This method validates user input for a valid date format
    private static boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}