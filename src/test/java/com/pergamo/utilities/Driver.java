package com.pergamo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private Driver() {
    }

    public static WebDriver driver;

    public static WebDriver get() {
        String browser = ConfigurationReader.get("browser");
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome": // Chrome - CHROME - cHROME
                    // WebDriverManager.chromedriver().setup(); // use only selenium-java => before version 4.6... after delete this line
                    driver = new ChromeDriver();  // polly
                    break;
                case "chrome-headless":
                    //WebDriverManager.chromedriver().setup();
                    //  driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
                    driver = new ChromeDriver(options);
                    break;
                case "firefox":
                    // WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    // WebDriverManager.firefoxdriver().setup();
                    //  driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--headless");
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    // WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    //WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support Safari");
                    //WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }

        }
        return driver;
    }
    public  static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}