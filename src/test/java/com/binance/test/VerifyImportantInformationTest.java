package com.binance.test;

import com.binance.BinanceETHBTCHomePage;
import com.binance.BinanceHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Tradeling;

public class VerifyImportantInformationTest {
    WebDriver driver;
    BinanceHomePage binanceHomePage;
    BinanceETHBTCHomePage binanceETHBTCHomePage;

    @BeforeMethod
    public void setUp() {
        Tradeling.getInstance().openBrowser();
        driver = Tradeling.getInstance().getDriver();
        Tradeling.getInstance().navigateToBinanceHome();
        binanceHomePage = new BinanceHomePage();
        binanceETHBTCHomePage = binanceHomePage.clickMarketMenu().clickETHBTCLink();
    }

    @Test (priority = 1, groups = {"smoke","reg"})
    public void verifyImportantElementsAvailability() throws Exception {
        Assert.assertEquals(binanceETHBTCHomePage.isCryptocurrencyPairNamesAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTardingOrderBookAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTradingLastPriceAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTrading24HChangeAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTrading24HHighAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTrading24HLowAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTrading24HVolumeAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isTradingChartAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isExchangeLimitTabAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isExchangeMarketTabAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isExchangeStopLimitDropdownValueAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyETHLabelAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellETHLabelAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyPriceInputAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyAmountInputAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyAmountPct25Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyAmountPct50Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyAmountPct75Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyAmountPct100Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isBuyTotalInputAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellPriceInputAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellAmountInputAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellAmountPct25Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellAmountPct50Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellAmountPct75Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isSellAmountPct100Available(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isMyOpenOrdersGridAvailable(), true);
        Assert.assertEquals(binanceETHBTCHomePage.isMy24HOpenOrderHistoryGridAvailable(), true);
    }

    @AfterMethod
    public void tearDown() {
        Tradeling.getInstance().closeBrowser();
    }
}
