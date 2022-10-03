package lekcijaViens.majasDarbs;

public class FirstClass {
    public static void main(String[] args) {

        System.out.println("Nīderlande");
        int Skaits = 16819595 ;
        System.out.println("Iedzīvotāju skaits: " + Skaits);
        double platiba = 41.543;
        double udens= 18.41;
        System.out.println("Valsts platība ir: " +platiba + "km2, no tās "+ udens +"km2 ir ūdens");
        String galvaspilsēta= "Amsterdama";
        int skaitsAms= 860124;
        System.out.println("Valsts galvaspilsēta ir " + galvaspilsēta + " un tajā dzīvo " + skaitsAms + " iedzīvotāju.");
        String valoda= "nīderlandiešu";
        System.out.println("oficiālā valsts valoda ir " + valoda);
        // Nīderlande ir ES dalībvalsts
        boolean irEs = true;
        boolean navEs = false;
        System.out.println("Vai Nīderlande ir ES dalībvalsts?: "+ irEs);
        String nauda = "EUR";
        System.out.println("Nīderlandes naudas vienība ir: " +nauda);

        int a = 10;
        int b = 25;
        int c = 13;
        int d = 7;

        System.out.println(a+b);
        System.out.println(a+c+d);
        System.out.println(7+b);

        int g = 53;
        int k = 18;
        int rezultats = g + k;

        System.out.println("sakaitot iegūstam:" + rezultats);
        rezultats = b+g;
        System.out.println(rezultats);

        rezultats = c+k;
        System.out.println(rezultats);

//komentars

        rezultats = g - k;
        System.out.println("atņemšanas rezultāts ir:" + rezultats);
rezultats = k-d;
System.out.println(rezultats);
rezultats= c- a;
System.out.println(rezultats);

rezultats = g/k;
        System.out.println("dalīšanas rezultāts ir: "+ rezultats);
rezultats = b/d;
System.out.println(rezultats);

rezultats = g/d;
System.out.println(rezultats);

rezultats= a*d;
       System.out.println("reizinot sanāk:" + rezultats);
       rezultats= d*k;
        System.out.println(rezultats);
        rezultats= a*k;
        System.out.println(rezultats);

        System.out.println("No kopējo iedzīvotāju skaita, kas ir " +Skaits + ", galvaspilsēta " + galvaspilsēta + " sevī uzņēmusi " + skaitsAms + " iezīvotājus!");

        System.out.println("Vai Nīderlande ir ES dalībvalsts?: "+ irEs + ", kopš 1958.gada 1.javāra," + " savukārt valstī " + nauda + " lieto kopš 1999.gada 1.janvāra!");





    }
}
