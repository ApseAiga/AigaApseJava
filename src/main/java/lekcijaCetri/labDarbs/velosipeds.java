package lekcijaCetri.labDarbs;

import java.util.Date;

public class velosipeds {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;
    Date izgatavosanasDatums;


    velosipeds(){
        System.out.println("Taisām jaunu velo!!!!!");
        izgatavosanasDatums = new Date();
        System.out.println("Izgatavosanas datums" + izgatavosanasDatums);

    }


    public void printAtrums(){
        System.out.println(atrums);
    }

    public void paatrinajums (){

        System.out.println(zimols + "Velo paatrinās" );
        atrums = atrums + 5;
    }

    public void bremzesana(){
        System.out.println("Velo bremze ");
        if (atrums>=5) {
            atrums = atrums - 5;
        } else
            System.out.println("Beidz bremzēt, tu jau stāvi");
    }

}
