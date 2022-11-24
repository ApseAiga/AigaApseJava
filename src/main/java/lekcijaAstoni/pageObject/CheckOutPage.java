package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    WebDriver driver;
    private By pageTitle = By.className("title");
    private By cotinueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameImputFiel = By.id("first-name");

    private By lastNameImputField = By.id("last-name");

    private By zipPostalCodeImputField = By.id("postal-code");


    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void inputFirstName(String a){
        driver.findElement(firstNameImputFiel).sendKeys(a);
    }
    public void inputLastName(String b){
        driver.findElement(lastNameImputField).sendKeys(b);
    }
    public void inputZipPostalCode(String c){
        driver.findElement(zipPostalCodeImputField).sendKeys(c);
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }


    public void clickContinueButton(){
        driver.findElement(cotinueButton).click();
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }



}
