package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;

public class DarazTest {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.daraz.pk/");
    }

    @Test
    public void testAutomation(){

        HomePage home = new HomePage(driver);
        home.searchProduct("electronics");

        SearchPage search = new SearchPage(driver);
        search.applyBrand();
        search.applyPrice("500", "5000");

        int count = search.getProductCount();
        Assert.assertTrue(count > 0);

        search.openFirstProduct();

        ProductPage product = new ProductPage(driver);
        Assert.assertTrue(product.checkFreeShipping());
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}


