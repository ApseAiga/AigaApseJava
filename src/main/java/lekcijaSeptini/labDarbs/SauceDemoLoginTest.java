package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {


    @Test
    public void testLoginEmptyUsernameAndPasword(){
       WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
       lietotajVardsIevadesLauks.sendKeys("pasakapasakapasaka");

       WebElement parolesIevadeslauks = parluks.findElement(By.id("password"));
       parolesIevadeslauks.sendKeys("lailailai");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, "Epic sadface: Username and password do not match any user in this service");

    }
    @Test
    public void testLoginWrongUsernameAndPassword() {
        testLogin("pasakapasakapasaka","lailailai", "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testLoginEmptyUsernameFiledAndPassword() {
        testLogin("","lailailai", "Epic sadface: Username is required");

    }

    @Test
    public void testLoginFiledUsernameEmptyAndPassword() {
        testLogin("pasakapasakapasaka","", "Epic sadface: Password is required");
    }


    @Test
    public void testLoginEmptyUsernameAndPassword() {
        testLogin("","", "Epic sadface: Username is required");
    }




    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys(username);

        WebElement parolesIevadeslauks = parluks.findElement(By.id("password"));
        parolesIevadeslauks.sendKeys(password);

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);
    }


}
