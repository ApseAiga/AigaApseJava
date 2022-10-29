package lekcijaCetri.labDarbs;

public class MAinDivi {
    public static void main(String[] args) {

        Rinkis rinkisViens =  new Rinkis(10);
//        rinkisViens.r= 5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatRinkaLinijasGarumu());

        Rinkis rinkisDivi = new Rinkis(5);
//        rinkisDivi.r= 12;
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatRinkaLinijasGarumu());


    }

}
