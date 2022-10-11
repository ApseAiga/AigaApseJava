package lekcijaTris.Labdarbs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("######");
        System.out.println("Aiga Apse");
        System.out.println("Rīga");
        System.out.println("######");



        System.out.println("Sākas programma");
        printCardDivi("Aiga", "Apse", "Hengevelde", 38);
        printCardDivi("Arturs", "Puce", "Hengevelde", 36);
        printCard();
        printNewLine();
        printCard();
        System.out.println("Beidzas programma");


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
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);



        String[]studentuSaraksts= new String[23];
        studentuSaraksts[0]= "Janis Berzins";
        studentuSaraksts [1]= "Juris Kreilis";


        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);


        System.out.println("kods turpinās");

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











