package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SearchPage extends BasePage {

    public SearchPage(org.openqa.selenium.WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Samsung')]")
    WebElement brandFilter;

    @FindBy(xpath = "//input[@placeholder='Min']")
    WebElement minPrice;

    @FindBy(xpath = "//input[@placeholder='Max']")
    WebElement maxPrice;

    @FindBy(xpath = "//button[contains(text(),'Apply')]")
    WebElement applyBtn;

    @FindBy(css = "div[data-qa-locator='product-item']")
    List<WebElement> products;

    public void applyBrand(){
        brandFilter.click();
    }

    public void applyPrice(String min, String max){
        minPrice.sendKeys(min);
        maxPrice.sendKeys(max);
        applyBtn.click();
    }

    public int getProductCount(){
        return products.size();
    }

    public void openFirstProduct(){
        products.get(0).click();
    }
}
