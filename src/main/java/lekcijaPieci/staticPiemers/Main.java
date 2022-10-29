package lekcijaPieci.staticPiemers;

public class Main {
    public static void main(String[] args) {

        Cilveks persona1 = new Cilveks(" Peteris");
        Cilveks persona2 = new Cilveks("Anna");

        persona1.printName();
        System.out.println(Cilveks.darbiniekaNumurs);
        persona2.printName();
        System.out.println(Cilveks.darbiniekaNumurs);


    }
}
