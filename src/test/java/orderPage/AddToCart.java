package orderPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    @FindBy(xpath = "//button//span[text()='Add to Cart']")
    WebElement addToCartButton;

    public AddToCart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void AddToCartPage(WebDriver driver) throws InterruptedException {
        addToCartButton.click();
        Thread.sleep(500);
        driver.switchTo().alert().dismiss();
        Thread.sleep(500);


    }
}
