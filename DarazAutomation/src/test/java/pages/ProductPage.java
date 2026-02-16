package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Free Shipping')]")
    WebElement freeShipping;

    public boolean checkFreeShipping(){
        return freeShipping.isDisplayed();
    }
}


