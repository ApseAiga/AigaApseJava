package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LaboratorijasDarbsDivi {
    public static void main(String[] args) {
//

        //salīdzināšanas izteiksmes
        System.out.println();
          int x = 3;
        int y=2;
        //šeit bus true
        System.out.println(x > y);
        y = 3;
        //šeit bus false
        System.out.println(x > y);

        //mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x < y);

        //vienāds
        System.out.println(x == y);
        System.out.println(5 == 5);

        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals(y));

        //nav vienāds
        System.out.println(x != y);
        System.out.println(!luksaforaKrasa.equals("green"));

        //mazaks vienads
        x = 5;
        y = 5;
        int z = 8;
        System.out.println(x <= y);

        int vecums = 18;
        System.out.println("Vai cilvēks var balsot (kludains variants)? " + (vecums>18));
        System.out.println(" Vai cilveks var balsot? " + (vecums>=18));

        System.out.println(x < 6 && z >y);
        System.out.println(x < 6 || z >y);

        int age = 18;
        boolean hasVoted = false;

        System.out.println(" Paskaties cilvēka pasē");
        if (age>=18 && hasVoted==false){
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīkst balsot");

        }
        System.out.println(" Talākās darbības ");

//
//
//
//        //pārbbaudīt, va skaitlis ir negatīv,ja ir, izvadīt uz ekrāna- NEGATĪVS
        int skaitlis = -5;
        if (skaitlis <0 ) {
        }
        System.out.println("NEGATĪVS");
//
//
        String luksaforaKrasa2 = "green";
        if (luksaforaKrasa2.equals("green")) {
            System.out.println("Ej");
        } else {System.out.println("Stāvi");
                }

            System.out.println("Ievadīsim skaitli i");
            int i = 20;
            if (i==10) {
                System.out.println("Skaitlis ir 10");
            } else if(i==15){
                System.out.println("Skaitlis ir 15");
            }else if (i==20){
                System.out.println("Skaitlis ir 20");
            }else {
                System.out.println("Skaitlis neviens no vajadzīgajiem");
            }


            int monthNumber= 4;
            switch (monthNumber) {
                case 1: System.out.println("Janvāris");
                break;
                case 2:  System.out.println("Februāris");
                break;
                case 3:  System.out.println("Marts");
                break;
                case 4:  System.out.println("Aprīlis");
                break;
                default: System.out.println("Sāds mēnesis neeksistē");
            }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello lekcija Divi");



        System.out.println("Kā Tevi sauc?");
        String name = scanner.nextLine();
        System.out.println("Labdien, " + name + " Esi sveicināta manā programmā");


       System.out.println("Ievadi cilveka vecumu");
        vecums = scanner.nextInt();

        if (vecums>=18){
            System.out.println("Cilveks drikst balsot");

            System.out.println("Ievadi skaitli a");
            int a = scanner.nextInt();
            System.out.println("Ievadi skaitli b");
            int b = scanner.nextInt();
            int summa = a+b;
            System.out.println("Skaitļ " + a + " un Skaitļa " + b + " Summa ir " + summa );








        }



    }
}
