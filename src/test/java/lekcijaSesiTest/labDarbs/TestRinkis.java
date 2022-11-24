package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRinkis {

    @Test
    public void testRekinatLaukumuDecimals(){
        System.out.println("Hello test. tests, kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(4.5);
        Double expectedArea = 50.24;
        Double actualArea = mansRinkis.rekinatLaukumu();
        Assert.assertEquals(actualArea, expectedArea);

        calculateAreaAndAssert(4.5, 63.585);

    }

    @BeforeTest
    public void pirmsTesta(){
        System.out.println("Sī ir Before TEST ANOTĀCIJA");
    }

    @BeforeTest
    public void pecTesta(){
        System.out.println("Sī ir AFTER TEST ANOTĀCIJA");
    }
    @BeforeMethod
    public void sagatavosanas(){
        System.out.println("Sī metode tiek izpildīta pirms katra test");
    }

    @AfterMethod
    public void pecDarbibas(){
        System.out.println("šī metode izpildās pēc katra testa");
    }


    @Test
    public void testRekinatLaukumuVesels() {
        System.out.println("Hello test. tests, kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(4);
        Double expectedArea = 50.24;
        Double actualArea = mansRinkis.rekinatLaukumu();
        Assert.assertEquals(actualArea, expectedArea);
    }

    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
            System.out.println("Hello test. tests, kā rēķinās riņķa laukums");
            Rinkis mansRinkis = new Rinkis(4);
            Double expectedArea = sagaidamaisLaukums;
            Double actualArea = mansRinkis.rekinatLaukumu();
            Assert.assertEquals(actualArea, expectedArea);

    }


}
