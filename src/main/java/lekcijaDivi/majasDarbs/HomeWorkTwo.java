package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        int x = 7;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x>5 && x<=10);
        System.out.println(x >=5 || x<10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x*x > 10);


        int monthNumber = 5;
        switch (monthNumber) {
            case 1: System.out.println("Janvāris");
            break;
            case 2: System.out.println("Feruāris");
            break;
            case 3: System.out.println("Marts");
            break;
            case 4: System.out.println("Aprīlis");
            break;
            case 5: System.out.println("Maijs");
            break;
            case 6:System.out.println("Jūnijs");
            break;
            case 7:System.out.println("Jūlijs");
            break;
            case 8 :System.out.println("Augusts");
            break;
            case 9: System.out.println("Septembris");
            break;
            case 10:System.out.println("Oktobris");
            break;
            case 11:System.out.println("Novembris");
            break;
            case 12: System.out.println("Decembris");

        }

        int a = 15;
        int b = 18;
        int c= 25;
        if (c>b && c>a);
        System.out.println("Lielākais skaitlis ir " + c );

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ievadi skaitli d");
        int d = scanner.nextInt();
        System.out.println(" Ievadi skaitli e");
        int e = scanner.nextInt();
        System.out.println(" Ievadi skaitli f");
        int f = scanner.nextInt();
        if (d>e && d>f){
            System.out.println(" Lielākais skaitlis ir d " + d);
        }  if (e>d && e>f) {
            System.out.println(" Lielākais skaitlis ir e " + e);
        } if (f>d && f>e) {
            System.out.println(" Lielākais skaitlis ir f " + f);
        }

        //Luksofors
        String  luksoforaKrasa;
        System.out.println("Ievadi luksofora krāsu (zaļa, dzeltena vai sarkana) : ");
        scanner = new Scanner(System.in);
        luksoforaKrasa = scanner.nextLine();
        if (luksoforaKrasa.equals("zaļa")) {
            System.out.println(" Dodies!");
        } else if (luksoforaKrasa.equals("dzeltena")) {
            System.out.println(" Gaidi, skaties nākamo signālu! ");
        } else if (luksoforaKrasa.equals("sarkana")) {
            System.out.println(" Gaidi! ");
        } else  {
            System.out.println("Esi max uzmanīgs, ievēro neregulēta krustojuma noteikumus! ");
        }

        //5.uzdevums

        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        //6.uzdevums

        printBusinessCardTwoo("Līga", "Kalniņa", +37112345678L, 1965 );
        printBusinessCardTwoo("Juris", "Vītols", +37187654321L, 1930);





    }

    public static void printBusinessCard (){
        System.out.println ("#######");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Berziņš");
        System.out.println("Telefona numurs: +371 12345678");
        System.out.println("Dzimšanas gadds: 1990");
        System.out.println("########");
    }

    public static void printBusinessCardTwoo(String vards, String uzvards,long telefons ,int gads){
        System.out.println("#######");
        System.out.println("Vārds: " + vards);
        System.out.println("Uzvārds: " + uzvards);
        System.out.println("Telefona numurs: " + telefons);
        System.out.println("Dzimšanas gads: " + gads);
        System.out.println("@@@@@@@@@");


    }




}

