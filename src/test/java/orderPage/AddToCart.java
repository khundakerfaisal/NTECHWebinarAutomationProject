package orderPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddToCart {
    @FindBy(className = "add-to-cart-buy-now-btn")
    List<WebElement> addToCartButton;

    @FindBy(className = "cart-icon-daraz")
    List<WebElement> SelectCartButton;

    @FindBy(className = "next-dialog-body")
    List<WebElement> dialogueBox;

    @FindBy(className = "next-dialog-close")
    List<WebElement> closeButton;

    @FindBy(xpath = "//input[@type='checkbox']")
     WebElement SelectAllButton;

    public AddToCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void AddToCartPage(WebDriver driver) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)"); // Scroll down by 600 pixels
        Thread.sleep(500);
        addToCartButton.get(1).click();
        Thread.sleep(500);


//        List<WebElement> dialogueBox = driver.findElements(By.className("next-dialog-body"));
        dialogueBox.get(0).click();
        Thread.sleep(1000);


//        List<WebElement> closeButton = driver.findElements(By.className("next-icon"));
        closeButton.get(0).click();
        Thread.sleep(500);


        SelectCartButton.get(0).click();
        Thread.sleep(1000);

        SelectAllButton.click();
        Thread.sleep(500);
        System.out.println("Added cart successfully");



    }
}
