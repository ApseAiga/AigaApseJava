package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRinkis {

    @Test
    public void testRekinatLaukumuDecimals(){
        System.out.println("Hello test. tests, kā rēķinās riņķa laukums");
        Rinkis mansRinkis = new Rinkis(4.5);
        Double expectedArea = 63.585;
        Double actualArea = mansRinkis.rekinatLaukumu();
        Assert.assertEquals(actualArea, expectedArea);

        calculateAreaAndAssert(4.5, 63.585);

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
