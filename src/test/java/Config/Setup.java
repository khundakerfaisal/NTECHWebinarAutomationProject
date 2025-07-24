package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest
    public void startBrowser(){
        driver=new ChromeDriver();
        driver.get("https://www.daraz.com.bd/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

    }
//    @AfterTest
//    public void closeBrowser(){
//        driver.quit();
//
//    }
}
