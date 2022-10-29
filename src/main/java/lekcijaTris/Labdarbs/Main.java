package lekcijaTris.Labdarbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("######");
        System.out.println("Aiga Apse");
        System.out.println("Rīga");
        System.out.println("######");



        System.out.println("Sākas programma");
        printCardDivi("Aiga", "Kociņa", "Hengevelde", 38);
        printCardDivi("Arturs", "Putniņš", "Amsterdama", 38);
        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzas programma");

        int laukums = aprekinatTaisnsturaLaukumu(8,9);
        System.out.println("Taisnstūra laukums ir: " + laukums);


        //masivs
        int[] monthlyCosts = {100,40,23,44,55,200};
        String[] produktuSaraksts = {"piens", "maize", "olas"};
        System.out.println(produktuSaraksts[0]); //piens
        System.out.println(produktuSaraksts[1]); //maize
        System.out.println(produktuSaraksts[2]); //olas
        System.out.println(monthlyCosts[3]);

        produktuSaraksts[2]="Desa";
        System.out.println(produktuSaraksts[2]); //desa

        int[] menesiGada= new int[12];
        menesiGada[0]=1;


        String[] cars= {"Volvo","BMW","Nissan","MB"};
        System.out.println("Masiva garums ir:" + cars.length);
        cars[1]="Audi";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);


        String[]studentuSaraksts= new String[23];
        studentuSaraksts[0]= "Janis Berzins";
        studentuSaraksts [1]= "Juris Kreilis";
        //garums ir 23 vērtības, no kurām esam aizpildījuši 2!

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);
        System.out.println("kods turpinās");

        whileCikls();


    }

    public static void whileCikls(){
        int x=5;
        while (x>0){
            System.out.println("x nav nulle, x = " +x);
            x= x-1; //vai x--, kas ir tas pats, kas x-1
        }
        int i=10;
        while (i<50){
            System.out.println("i ir " + i);
            i=i+1; //vai x++, kas ir x=1
        }

        String[] cars= {"Volvo","BMW","Nissan","MB"};
        System.out.println("Kods sākās");
        int z=0;
        while (z<4){
            System.out.println(cars[z]);
            z=z+1;
        }
        System.out.println("Kods turpinās");

        int[]menesaTerini= {100, 40, 23, -44, 55, 200};
        System.out.println(menesaTerini[0]);
        System.out.println(menesaTerini[1]);
        System.out.println(menesaTerini[2]);
        System.out.println(menesaTerini[3]);
        System.out.println(menesaTerini[4]);
        System.out.println(menesaTerini[5]);

        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli ");
        int number = ievade.nextInt();
        int summa= 0;
        while (number > 0){
            summa= summa+number;
            System.out.println("Ievadi skaitli ");
            number= ievade.nextInt();
        }
        System.out.println("Summa ir :" + summa);
//
//        String[] kartis= {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
//        int m =0;
//        while (m< kartis.length){
//            System.out.println(kartis[m]);
//            m++;
//        }
//
//        //do while
//        int q=1;
//        do{
//            System.out.println("TEST TEST TEST");
//            q++;
//        }while (q<10);
//
//        Scanner scanner=new Scanner(System.in);
//        String parole="SuperSecretPassword123";
//        String ievaditaParole;
//        do{
//            System.out.println("Ievadi paroli ");
//            ievaditaParole= scanner.next();
//            System.out.println("Pārbaudām paroli");
//        } while (!ievaditaParole.equals(parole));
//        System.out.println("Pareiza parole");
        
        //for cikls

        String[] kartis2= {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }

        //for each iterēt cauri masīvam

        long []telefonaNumuri={14515,5487956, 222225, 656599933, 333778};
        for (long masivaTelefons:telefonaNumuri) {
            System.out.println(masivaTelefons);
        }
        String[] kartis3= {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        for (String vienaKarts:kartis3) {
            System.out.println(vienaKarts);
            
        }





    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums){
        return platums * garums;
    }

    public static void printNewLine (){
        System.out.println("\n");
    }

    public static void printCard(){
        System.out.println("@@@@@@");
        System.out.println("Aiga Apse");
        System.out.println("Rīga");
        System.out.println("$$$$$");
        printNewLine();
    }
    public static void printCardDivi(String vards, String uzvards, String pilseta, int vecums){
        System.out.println("@@@@@@");
        System.out.println(vards+ " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums: "+ vecums);
        System.out.println("$$$$$");
    }


}











