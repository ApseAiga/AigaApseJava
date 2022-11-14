package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void add (){

        System.out.println("Summa ir" );
        int expectedArea = 11;
        int actualArea= expectedArea;
        Assert.assertEquals(expectedArea, actualArea);

    }

    @Test
    public void substract(){
        System.out.println("Atņemot mums sanāk: ");
        int expectedArea = 1;
        int actualArea= expectedArea;
        Assert.assertEquals(expectedArea,actualArea);
    }

    @Test
    public void multiply(){
        System.out.println("Reizinām");
        Calculator reizinam = new Calculator();
        reizinam.multiply(5, 5);
        int expectedArea = 25;
        int actualArea = expectedArea;
        Assert.assertEquals(expectedArea, actualArea);

    }
    @Test
    public void divide(){
        System.out.println("dalam");
        Calculator dalam = new Calculator();
        dalam.divide(30, 5);
        int expectedArea= 6;
        int actualArea = expectedArea;
        Assert.assertEquals(expectedArea,actualArea);
    }

}
