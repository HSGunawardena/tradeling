package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class Tradeling {
    private WebDriver driver;
    private static Tradeling myObj;
    // public static WebDriver driver;
    utils.PropertyFileReader property = new PropertyFileReader();

    public static Tradeling getInstance() {
        if (myObj == null) {
            myObj = new Tradeling();
            return myObj;
        } else {
            return myObj;
        }
    }

    //get the selenium driver
    public WebDriver getDriver() {
        return driver;
    }


    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverFilePath());
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void navigateToUrl() {
        String url = property.getProperty("config", "url");
        driver.get(url);
    }


    public void closeBrowser() {
        driver.quit();
    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = new WebDriverWait(Tradeling.getInstance().getDriver(), timeout).until
                (ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

    public void takeSnapOfElement(WebElement webElement, String name){
        try {
            Screenshot screenshot = new AShot()
                    .takeScreenshot(driver, webElement);
            ImageIO.write(screenshot.getImage(), "PNG",
                    new File("C:\\Users\\sprii\\Pictures\\tradeling_ss\\" + name + ".png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeFullSnap(String name){
        try {
            Screenshot screenshot = new AShot()
                    .shootingStrategy(ShootingStrategies.viewportPasting(100))
                    .takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "PNG",
                    new File("C:\\GITTest\\" + name + ".png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getChromeDriverFilePath() {
        String chromeDriver = property.getProperty("config", "chrome.driver.path");
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(chromeDriver).getFile());
        return file.getAbsolutePath();
    }

}
