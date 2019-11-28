package com.binance;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PropertyFileReader;
import utils.Tradeling;

public class BinanceETHBTCHomePage {
    WebDriver driver = Tradeling.getInstance().getDriver();
    PropertyFileReader propertyFileReader = new PropertyFileReader();
    private String binanceCryptocrrencyPairNameElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "cryptocurrency.pair.name.element");
    private String binanceTradingOrderBookElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.order.book.element");
    private String binanceTradingLastPriceElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.last.price.display.element");
    private String binanceTrading24HChangeElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.24h.change.display.element");
    private String binanceTrading24HHighElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.24h.high.display.element");
    private String binanceTrading24HLowElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.24h.low.display.element");
    private String binanceTrading24HVolumeElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.24h.volume.display.element");
    private String binanceTradingChartElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "trading.chart.element");
    private String binanceOrderGridExchangeTabLimitElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.exchange.tab.limit.element");
    private String binanceOrderGridExchangeTabMarketElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.exchange.tab.market.element");
    private String binanceOrderGridExchangeTabStopLimitDropdownElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.exchange.tab.stop.limit.dorpdown.element");
    private String binanceOrderGridBuyETHLabelElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.eth.label.element");
    private String binanceOrderGridSellETHLabelElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.eth.label.element");
    private String binanceOrderGridBuyPriceInputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.price.input.element");
    private String binanceOrderGridBuyAmountInputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.amount.input.element");
    private String binanceOrderGridBuyTotalInputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.total.input.element");
    private String binanceOrderGridBuyAmountPct25InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.amount.percentage25.input.element");
    private String binanceOrderGridBuyAmountPct50InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.amount.percentage50.input.element");
    private String binanceOrderGridBuyAmountPct75InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.amount.percentage75.input.element");
    private String binanceOrderGridBuyAmountPct100InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.buy.amount.percentage100.input.element");
    private String binanceOrderGridSellPriceInputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.price.input.element");
    private String binanceOrderGridSellAmountInputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.amount.input.element");
    private String binanceOrderGridSellTotalInputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.total.input.element");
    private String binanceOrderGridSellAmountPct25InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.amount.percentage25.input.element");
    private String binanceOrderGridSellAmountPct50InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.amount.percentage50.input.element");
    private String binanceOrderGridSellAmountPct75InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.amount.percentage75.input.element");
    private String binanceOrderGridSellAmountPct100InputElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "order.grid.sell.amount.percentage100.input.element");
    private String binanceMyOpenOrdersGridElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "my.open.orders.grid.element");
    private String binanceMy24HOrderHistoryElement = propertyFileReader.getProperty("BinanceETHBTCHomePage",
            "my.24h.orders.history.grid.element");

    public boolean isCryptocurrencyPairNamesAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceCryptocrrencyPairNameElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isCryptocurrencyPairNamesAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isCryptocurrencyPairNamesAvailable_failed");
            return false;
        }
    }

    public boolean isTardingOrderBookAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTradingOrderBookElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTardingOrderBookAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTardingOrderBookAvailable_failed");
            return false;
        }
    }

    public boolean isTradingLastPriceAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTradingLastPriceElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTradingLastPriceAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTradingLastPriceAvailable_failed");
            return false;
        }
    }

    public boolean isTrading24HChangeAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTrading24HChangeElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTrading24HChangeAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTrading24HChangeAvailable_failed");
            return false;
        }
    }

    public boolean isTrading24HHighAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTrading24HHighElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTrading24HHighAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTrading24HHighAvailable_failed");
            return false;
        }
    }

    public boolean isTrading24HLowAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTrading24HLowElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTrading24HLowAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTrading24HLowAvailable_failed");
            return false;
        }
    }

    public boolean isTrading24HVolumeAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTrading24HVolumeElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTrading24HVolumeAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTrading24HVolumeAvailable_failed");
            return false;
        }
    }

    public boolean isTradingChartAvailable() throws Exception {
        WebElement webElement;
//        Tradeling.getInstance().waitForElement(By.xpath(binanceTradingChartElement),15);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);
        try {
            webElement = driver.findElement(By.xpath(binanceTradingChartElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isTradingChartAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isTradingChartAvailable_failed");
            return false;
        }
    }

    public boolean isExchangeLimitTabAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridExchangeTabLimitElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isExchangeLimitTabAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isExchangeLimitTabAvailable_failed");
            return false;
        }
    }

    public boolean isExchangeMarketTabAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridExchangeTabMarketElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isExchangeLimitTabAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isExchangeLimitTabAvailable_failed");
            return false;
        }
    }

    public boolean isExchangeStopLimitDropdownValueAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.xpath(binanceOrderGridExchangeTabStopLimitDropdownElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isStopLimitDropdownValueAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isStopLimitDropdownValueAvailable_failed");
            return false;
        }
    }

    public boolean isBuyETHLabelAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.xpath(binanceOrderGridBuyETHLabelElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyETHLabelAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyETHLabelAvailable_failed");
            return false;
        }
    }

    public boolean isSellETHLabelAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.xpath(binanceOrderGridSellETHLabelElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellETHLabelAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellETHLabelAvailable_failed");
            return false;
        }
    }

    public boolean isBuyPriceInputAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyPriceInputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyPriceInputAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyPriceInputAvailable_failed");
            return false;
        }
    }

    public boolean isBuyAmountInputAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyAmountInputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyAmountInputAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyAmountInputAvailable_failed");
            return false;
        }
    }

    public boolean isBuyTotalInputAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyTotalInputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyTotalInputAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyTotalInputAvailable_failed");
            return false;
        }
    }

    public boolean isBuyAmountPct25Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyAmountPct25InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyAmountPct25Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyAmountPct25Available_failed");
            return false;
        }
    }

    public boolean isBuyAmountPct50Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyAmountPct50InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyAmountPct50Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyAmountPct50Available_failed");
            return false;
        }
    }

    public boolean isBuyAmountPct75Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyAmountPct75InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyAmountPct75Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyAmountPct75Available_failed");
            return false;
        }
    }

    public boolean isBuyAmountPct100Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridBuyAmountPct100InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isBuyAmountPct100Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isBuyAmountPct100Available_failed");
            return false;
        }
    }

    public boolean isSellPriceInputAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellPriceInputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellPriceInputAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellPriceInputAvailable_failed");
            return false;
        }
    }

    public boolean isSellAmountInputAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellAmountInputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellAmountInputAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellAmountInputAvailable_failed");
            return false;
        }
    }

    public boolean isSellTotalInputAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellTotalInputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellTotalInputAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellTotalInputAvailable_failed");
            return false;
        }
    }

    public boolean isSellAmountPct25Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellAmountPct25InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellAmountPct25Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellAmountPct25Available_failed");
            return false;
        }
    }

    public boolean isSellAmountPct50Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellAmountPct50InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellAmountPct50Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellAmountPct50Available_failed");
            return false;
        }
    }

    public boolean isSellAmountPct75Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellAmountPct75InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellAmountPct75Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellAmountPct75Available_failed");
            return false;
        }
    }

    public boolean isSellAmountPct100Available() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.id(binanceOrderGridSellAmountPct100InputElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isSellAmountPct100Available");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isSellAmountPct100Available_failed");
            return false;
        }
    }

    public boolean isMyOpenOrdersGridAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.xpath(binanceMyOpenOrdersGridElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isMyOpenOrdersGridAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isMyOpenOrdersGridAvailable_failed");
            return false;
        }
    }

    public boolean isMy24HOpenOrderHistoryGridAvailable() throws Exception {
        WebElement webElement;
        Thread.sleep(2000);

        try {
            webElement = driver.findElement(By.xpath(binanceMy24HOrderHistoryElement));
            Tradeling.getInstance().takeSnapOfElement(webElement, "isMy24HOpenOrderHistoryGridAvailable");
            return true;
        } catch (NoSuchElementException e) {
            Tradeling.getInstance().takeFullSnap("isMy24HOpenOrderHistoryGridAvailable_failed");
            return false;
        }
    }

    public BinanceETHBTCHomePage setETHBuyPrice(double price) {
        Tradeling.getInstance().waitForElement(By.id(binanceOrderGridBuyPriceInputElement), 10);
        String stringPrice = String.valueOf(price);
        driver.findElement(By.id(binanceOrderGridBuyPriceInputElement)).sendKeys(stringPrice);
        return this;
    }

    public double getETHBuyPrice() {
        Tradeling.getInstance().waitForElement(By.id(binanceOrderGridBuyPriceInputElement), 10);
        String price = driver.findElement(By.id(binanceOrderGridBuyPriceInputElement)).getAttribute("value");
        double floatPrice = Double.parseDouble(price);
        return floatPrice;
    }

    public BinanceETHBTCHomePage setETHBuyAmount(double amount) {
        Tradeling.getInstance().waitForElement(By.id(binanceOrderGridBuyAmountInputElement), 10);
        String stringAmount = String.valueOf(amount);
        driver.findElement(By.id(binanceOrderGridBuyAmountInputElement)).sendKeys(stringAmount);
        return this;
    }

    public void submitForm() {
        Tradeling.getInstance().waitForElement(By.id(binanceOrderGridBuyAmountInputElement), 10);
        driver.findElement(By.id(binanceOrderGridBuyAmountInputElement)).submit();
    }

    public double getETHBuyAmount() {
        Tradeling.getInstance().waitForElement(By.id(binanceOrderGridBuyAmountInputElement), 10);
        String amount = driver.findElement(By.id(binanceOrderGridBuyAmountInputElement)).getAttribute("value");
        double doubleAmount = Double.parseDouble(amount);
        return doubleAmount;
    }

    public double getETHBuyTotal() {
        Tradeling.getInstance().waitForElement(By.id(binanceOrderGridBuyTotalInputElement), 10);
        String totalValue = driver.findElement(By.id(binanceOrderGridBuyTotalInputElement)).getAttribute("value");
        double doubleTotal = Double.parseDouble(totalValue);
        return doubleTotal;
    }

}
