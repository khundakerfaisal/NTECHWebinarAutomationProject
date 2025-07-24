package orderPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectItem {
    @FindBy(xpath = "//div[@data-qa-locator='product-item'][1]")
    WebElement selectItem;

    public SelectItem(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void SelectItemPage() throws InterruptedException {
        selectItem.click();
        Thread.sleep(500);

    }
}
