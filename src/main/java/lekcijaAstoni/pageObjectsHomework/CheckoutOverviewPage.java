package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    WebDriver driver;

    private By pageTitle = By.id("checkout_summary_container");

    private By finishButton = By.id("finish");

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver= driver;
    }
    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }

    public WebElement getFinishButton(){
       return driver.findElement(finishButton);
    }

    }
