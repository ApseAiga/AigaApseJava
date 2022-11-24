package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSuccessPage {
    WebDriver driver;

    private By backHomeButton = By.id("back-to-products");


   private By pageTitle = By.className("checkout_summary_container");



    public WebElement getBackHomeButton (){
      return driver.findElement(backHomeButton);
    }


    public  CheckoutSuccessPage (WebDriver driver){
      this.driver= driver;
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }


}
