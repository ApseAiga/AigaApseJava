package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {

        House majaViens = new House();
        majaViens.adrese = "Saules iela 252";
        majaViens.durvuSkaits = 6;
        majaViens.griestuAugstums=2.5;
        majaViens.kadastralaVertiba= 12000;
        majaViens.loguSkaits= 10;
        majaViens.stavuDaudzums= 2;
        majaViens.vaiPrivatipasums= true;
        majaViens.printHouse();

        House majaDivi = new House(2, 5, 5, "Kalna 10", 2.5,1200, true);
        majaDivi.adrese = "Kalna iela 10";
        majaDivi.durvuSkaits = 8;
        majaDivi.griestuAugstums=3.5;
        majaDivi.kadastralaVertiba= 16000;
        majaDivi.loguSkaits= 17;
        majaDivi.stavuDaudzums= 3;
        majaDivi.vaiPrivatipasums= true;
      majaDivi.printHouse();

        System.out.println(majaViens.adrese);
        System.out.println(majaDivi.adrese);

        House[] majas = {majaViens,majaDivi};
        for (House maja: majas ) {
            maja.printHouse();


        }


        velosipeds mansVelo = new velosipeds();
        System.out.println(mansVelo.atrums);
        mansVelo.printAtrums();

        velosipeds ritenBraucejsViens = new velosipeds();
        velosipeds ritenBraucejsDdivi= new velosipeds();


        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDdivi.atrums = 50;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDdivi.printAtrums();

        velosipeds ritenBraucejsTris= new velosipeds();
        ritenBraucejsTris.zimols = "ZZK";
        System.out.println(ritenBraucejsTris.zimols);
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();

        ritenBraucejsTris.printAtrums();
        System.out.println("Priekšā izskrien kaķis");
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.printAtrums();

        Auto mansAuto = new Auto();
        mansAuto.masa= 5233;
        mansAuto.krasa= "sarkana";
        mansAuto.nosaukums= "MB";
        mansAuto.durvjuSkaits= 5;
        mansAuto.apdrosinasana = true;
        mansAuto.izlaidumaGads= 1999;
        mansAuto.printAuto();








    }
}
