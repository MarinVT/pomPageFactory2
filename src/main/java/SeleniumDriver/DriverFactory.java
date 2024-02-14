package SeleniumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.seleniumhq.jetty9.util.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
    }

    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webDriverThreadLocal.get() == null) {
            webDriverThreadLocal.set(createDriver());
        }

        return webDriverThreadLocal.get();
    }

    private static WebDriver createDriver()  {
         WebDriver driver = null;

         switch (getBrowserTypePropsFile()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().deleteAllCookies();
                 break;
                 case "firefox":
                     FirefoxOptions options = new FirefoxOptions();
                     options.setBinary("/usr/lib/firefox/firefox");
                     driver = new FirefoxDriver(options);
                     driver.manage().deleteAllCookies();
//                     WebDriverManager.firefoxdriver().setup();
//                     driver = new FirefoxDriver();
                 break;
             default:
                 System.out.println("browser : " + getBrowserTypePropsFile() + " is invalid");
         }


         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return  driver;
    }

    public static void cleanUpDriver() {
        webDriverThreadLocal.get().quit();
        webDriverThreadLocal.remove();
    }

    private static String getBrowserTypePropsFile() {
        String browserType = null;

        try {
            Properties properties = new Properties();
            if (System.getProperty("os.name").toLowerCase().contains("linux")) {
                FileInputStream file = new FileInputStream("src/main/java/properties/config.properties");
                properties.load(file);
            } else if (System.getProperty("os.name").toLowerCase().contains("window")) {
                FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "src/main/java/properties/config.properties");
                properties.load(file);
            }

            browserType = properties.getProperty("browserName").toLowerCase().trim();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return browserType;
    }

}
