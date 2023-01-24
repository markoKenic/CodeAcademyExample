package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsListPage extends BasePage {
    public ProductsListPage (WebDriver driver){
        super(driver);

    }

    By pageTitleBy = By.xpath(:"//span{@class="title"}");
    String pageTitle = "Products";

    public ProductsListPage verysucessfullLogin(){
        String actualPageTitle = readText(pageTitleBy);
        assertTextEquals(pageTitle, actualPageTitle);

        return this;

    }

    
}
