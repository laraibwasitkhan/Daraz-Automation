package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "q")
    WebElement searchBox;

    @FindBy(className = "search-box__button--1oH7")
    WebElement searchButton;

    public void searchProduct(String product){
        searchBox.sendKeys(product);
        searchButton.click();
    }
}




