package orderPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginHeader;

    @FindBy(className = "iweb-input")
    List<WebElement> txtEnterUsername;

    @FindBy(className = "iweb-input")
    List<WebElement> txtEnterPassword;
    @FindBy(className = "iweb-button-mask")
    List<WebElement> loginButton;




    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void loginEntryPage() throws InterruptedException {
        loginHeader.click();
        Thread.sleep(500);
        txtEnterUsername.get(0).sendKeys("01787671357");
        Thread.sleep(500);
        txtEnterPassword.get(1).sendKeys("Abc@1234");
        Thread.sleep(500);
        loginButton.get(0).click();
        Thread.sleep(500);


    }





}
