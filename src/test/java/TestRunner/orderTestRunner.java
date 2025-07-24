package TestRunner;

import Config.Setup;
import orderPage.AddToCart;
import orderPage.SearchPage;
import orderPage.SelectItem;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orderTestRunner extends Setup {

    @Test(priority = 1,description="Search product successfully")
    public void doOrderCreation() throws InterruptedException {
        SearchPage orderPage=new SearchPage(driver);
        orderPage.orderCreatePage();
        Thread.sleep(1000);
        String TextExpected=driver.findElement(By.xpath("//h1[text()='Bluetooth headphone']")).getText();
        String TextActual="Bluetooth headphone";
        Assert.assertTrue(TextActual.contains(TextExpected));
        Thread.sleep(1000);

    }
    @Test(priority = 2,description="Search product successfully")
    public void doProductSelect() throws InterruptedException {
        SelectItem selectItem=new SelectItem(driver);
        selectItem.SelectItemPage();
        Thread.sleep(1000);
        String TextExpected=driver.findElement(By.xpath("//h1[text()='Lenovo HE05X Bluetooth 5.0 Earphones Waterproof Wireless HIFI Sound Magnetic Neckband Headset Sports Headphones']")).getText();
        String TextActual="Lenovo HE05X Bluetooth 5.0 Earphones Waterproof Wireless HIFI Sound Magnetic Neckband Headset Sports Headphones";
        Assert.assertTrue(TextActual.contains(TextExpected));
        Thread.sleep(1000);

    }
    @Test(priority = 3,description="Search product successfully")
    public void doAddToCartSelect() throws InterruptedException {
        AddToCart addToCart=new AddToCart(driver);
        addToCart.AddToCartPage(driver);
        Thread.sleep(1000);
//        String TextExpected=driver.findElement(By.xpath("//h1[text()='Lenovo HE05X Bluetooth 5.0 Earphones Waterproof Wireless HIFI Sound Magnetic Neckband Headset Sports Headphones']")).getText();
//        String TextActual="Lenovo HE05X Bluetooth 5.0 Earphones Waterproof Wireless HIFI Sound Magnetic Neckband Headset Sports Headphones";
//        Assert.assertTrue(TextActual.contains(TextExpected));
//        Thread.sleep(1000);

    }
}
