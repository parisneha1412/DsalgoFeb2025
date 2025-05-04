package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

public static void initializeBrowser(String browserName) {
    WebDriver driver = null;

    switch (browserName.toLowerCase()) {
        case "chrome":

            driver = new ChromeDriver();
            break;
        case "firefox":

            driver = new FirefoxDriver();
            break;
        case "edge":

            driver = new EdgeDriver();
            break;
        case "safari":
            driver = new SafariDriver(); 
            break;
        default:
            throw new IllegalArgumentException("Invalid browser: " + browserName);
    }

    driver.manage().window().maximize();
    driverThreadLocal.set(driver);
}

public static WebDriver getDriver() {
    return driverThreadLocal.get();
}

public static void quitDriver() {
    if (driverThreadLocal.get() != null) {
        driverThreadLocal.get().quit();
        driverThreadLocal.remove();
    }
}
}
