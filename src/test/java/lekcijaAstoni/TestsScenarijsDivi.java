package lekcijaAstoni;

import lekcijaAstoni.pageObject.CartPage;
import lekcijaAstoni.pageObject.CheckOutPage;
import lekcijaAstoni.pageObject.LoginPage;
import lekcijaAstoni.pageObject.ProductsPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsScenarijsDivi extends BaseTest {
    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        System.out.println("navigēt uz saiti http://www.saucedemo.com/");
        System.out.println("Ielogoties ar pareizi lietotajvardu un paroli");
        LoginPage loginPage = new LoginPage(parluks);
        ProductsPage produktuLapa = new ProductsPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");

        System.out.println("3. Doties uz grozu");
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(),"YOUR CART");

        System.out.println("Doties uz checkout");
        grozaLapa.getCheckOutButton().click();

        System.out.println("5.Pārbaudīt, ka Firstname/Lastname/Zip code ir obligāts");
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






        Thread.sleep(5000);


    }
}
