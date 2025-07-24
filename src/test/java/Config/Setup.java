package Config;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver;
    @BeforeTest
    public void startBrowser() {
        try {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.get("https://www.daraz.com.bd/");

            // Maximize only if window is still valid
            if (!driver.getWindowHandles().isEmpty()) {
                driver.manage().window().maximize();
            }

        } catch (NoSuchWindowException e) {
            System.out.println("Window already closed. Cannot maximize: " + e.getMessage());
        } catch (WebDriverException e) {
            System.out.println("WebDriver error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            try {
                driver.quit(); // Ensure driver is valid before quitting
            } catch (WebDriverException e) {
                System.out.println("Error while quitting driver: " + e.getMessage());
            }
        }
    }

}
