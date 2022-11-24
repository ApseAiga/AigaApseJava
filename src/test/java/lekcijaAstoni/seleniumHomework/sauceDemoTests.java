package lekcijaAstoni.seleniumHomework;

import lekcijaAstoni.pageObject.CartPage;
import lekcijaAstoni.pageObject.CheckOutPage;
import lekcijaAstoni.pageObject.LoginPage;
import lekcijaAstoni.pageObject.ProductsPage;
import lekcijaAstoni.pageObjectsHomework.CheckoutOverviewPage;
import lekcijaAstoni.pageObjectsHomework.CheckoutSuccessPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class sauceDemoTests extends BaseTest {

    @Test


            public void testShopping() throws InterruptedException {
        System.out.println("navigēt uz saiti http://www.saucedemo.com/");
        System.out.println("Ielogoties ar pareizi lietotajvardu un paroli");
        LoginPage loginPage = new LoginPage(parluks);
        ProductsPage produktuLapa = new ProductsPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");

        System.out.println("ievietot grozā produktu");
        produktuLapa.getAddToCartButton().click();
        Assert.assertEquals(produktuLapa.getRemoveButton().getText(),"REMOVE");
        produktuLapa.getCartButton().click();
        CartPage grozaLapa = new CartPage(parluks);
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "YOUR CART");

        System.out.println("Doties uz checkout");
        grozaLapa.getCheckOutButton().click();

        CheckOutPage checkoutLapa = new CheckOutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();

        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: First Name is required");

        checkoutLapa.inputFirstName("Aiga");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Last Name is required");
        checkoutLapa.inputLastName("Apse");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(), "Error: Postal Code is required");
        checkoutLapa.inputZipPostalCode("1235AC");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: OVERVIEW");

        CheckoutOverviewPage checkoutParskataLapa = new CheckoutOverviewPage(parluks);
        checkoutParskataLapa.getFinishButton().click();


        CheckoutSuccessPage checkoutIznakumaLapa = new CheckoutSuccessPage(parluks);

        checkoutIznakumaLapa.getBackHomeButton().click();
       Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");
        System.out.println("Mājās");



    }


    }


