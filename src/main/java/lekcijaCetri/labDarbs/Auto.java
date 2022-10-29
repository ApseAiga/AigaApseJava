package lekcijaCetri.labDarbs;

public class Auto {
    String nosaukums;
    int izlaidumaGads;
    String krasa;
    double masa;
    int maxAtrums;
    int durvjuSkaits;
    boolean apdrosinasana;

    public void printAuto() {
        System.out.println( "krāsa: " + krasa + "masa: " +masa + " maksimālais ātrums: " + maxAtrums + "ir apdrošināts: " + apdrosinasana);
    }

    }



