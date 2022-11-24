package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver parluks;

    private By pageTitle = By.cssSelector("span.title");
    private By cartButton = By.id("shopping_cart_container");

    private By addToCartButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By removeButton = By.id("remove-sauce-labs-bolt-t-shirt");

    private By tShirt = By.className("inventory_item_name");



    public ProductsPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    public ProductsPage() {

    }

    public WebElement getCartButton(){
        return parluks.findElement(cartButton);
    }
    public WebElement getTShirt(){
        return parluks.findElement(tShirt);
    }

    public WebElement getAddToCartButton(){
        return parluks.findElement(addToCartButton);
    }
    public WebElement getRemoveButton(){
        return parluks.findElement(removeButton);
    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }


}
