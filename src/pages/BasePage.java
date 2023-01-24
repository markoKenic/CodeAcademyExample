package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
        public WebDriver driver;
        public WebDriverWait wait;
    


    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10) );

    }

    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void writeText(By elementBy , String text){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.finfElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
    
    public void click(By elementBy){
        wait.until(ExpectedConditions.elementToBeClicable(elementBy));
        driver.findElement(elementBy).click();
    }
    
}
