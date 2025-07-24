package orderPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {

    @FindBy(xpath = "//input[@type='search' and @id='q']")
    WebElement searchBar;

    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void orderCreatePage() throws InterruptedException {
        searchBar.click();
        Thread.sleep(500);
        searchBar.sendKeys("Bluetooth headphone");
        Thread.sleep(500);
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(500);

    }
}
