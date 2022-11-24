package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver parluks;
    private By usernameImputField = By.id("user-name");
    private By passwordImputField = By.id("password");

    private By loginButton = By.id("login-button");
    private By errorTextFild = By.cssSelector("div.error-message-container h3");

    public void login(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }


    public String getErrorText(){
        return parluks.findElement(errorTextFild).getText();
    }

    public WebElement getLoginButton(){
        return parluks.findElement(loginButton);
    }
    public WebElement getUsernameField(){
        return parluks.findElement(usernameImputField);
    }

    public WebElement getPasswordField(){
        return parluks.findElement(passwordImputField);
    }



    public LoginPage(WebDriver parluks) {
        this.parluks = parluks;
    }




}
