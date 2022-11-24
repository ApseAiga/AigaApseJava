package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;

    private By checkOutButton= By.id("checkout");

    private By pageTitle = By.className("title");

    private By cartContent= By.id("cart_contents_container");



    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }
    public WebElement getCartContent(){
        return driver.findElement(cartContent);
    }

    public WebElement getCheckOutButton(){
        return driver.findElement(checkOutButton);
    }






}
