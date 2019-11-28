package com.binance.test;

import com.binance.BinanceETHBTCHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Tradeling;

public class VerifyBuyETHFormTest {
    WebDriver driver;
    BinanceETHBTCHomePage binanceETHBTCHomePage;

    @BeforeMethod
    public void setUp() {
        Tradeling.getInstance().openBrowser();
        driver = Tradeling.getInstance().getDriver();
        Tradeling.getInstance().navigateToBinanceETHBTCHome();
        binanceETHBTCHomePage = new BinanceETHBTCHomePage();
    }

    @Test(priority = 1, groups = {"smoke", "reg"})
    public void verifyTotalValueCalculationWithoutDecimalForAmount() {
        double price;
        double sentAmount = 10;
        double amount;
        double total;
        binanceETHBTCHomePage.setETHBuyAmount(sentAmount);
        price = binanceETHBTCHomePage.getETHBuyPrice();
        amount = binanceETHBTCHomePage.getETHBuyAmount();
        total = binanceETHBTCHomePage.getETHBuyTotal();
        Assert.assertEquals(total, Math.round((price * amount)*100000000d)/100000000d);
    }

    @Test(priority = 2, groups = {"smoke", "reg"})
    public void verifyTotalValueCalculationWithDecimalForAmount() {
        double price;
        double sentAmount = 10.254;
        double amount;
        double total;
        binanceETHBTCHomePage.setETHBuyAmount(sentAmount);
        price = binanceETHBTCHomePage.getETHBuyPrice();
        amount = binanceETHBTCHomePage.getETHBuyAmount();
        total = binanceETHBTCHomePage.getETHBuyTotal();
        Assert.assertEquals(total, Math.round((price * amount)*100000000d)/100000000d);
    }

    @Test(priority = 3, groups = {"smoke", "reg"})
    public void verifyUnauthorizedSubmission() {
        double sentAmount = 10.254;
        binanceETHBTCHomePage.setETHBuyAmount(sentAmount);
        //Verifies that the submit button is enabled.
        Assert.assertEquals(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled(),true);
        //Verifies that the submit button is not displayed.
        Assert.assertEquals(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(),false);
        //Invoking the submit function to see whether any form submission has happened
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        //Assumption: If submission has happened, url need to be changed. Verifying that the url has not be changed
        //after submission
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.binance.com/en/trade/ETH_BTC");
    }

    @AfterMethod
    public void tearDown() {
        Tradeling.getInstance().closeBrowser();
    }
}
