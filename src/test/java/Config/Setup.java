package Config;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.internal.thread.ThreadExecutionException;

import java.time.Duration;

public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void startBrowser() {

        // options.addArguments("--headless=new"); // Optional
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.get("https://www.daraz.com.bd/");
//        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://www.daraz.com.bd/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }
}
