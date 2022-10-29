package lekcijaTris.Majasdarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        mansPirmaisUzdevums();
        MansOtraisUzdevums();
        mansTresaisUzdevums();






    }

    public static void mansPirmaisUzdevums(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli ");
        int number = scanner.nextInt();
        int summa = 0;
        while (summa < 100){
            System.out.println("Summa ir: "+ summa);
            summa = summa + number;
            System.out.println(" Ievadi skaitli ");
            number= scanner.nextInt();


        }
            System.out.println("Gatavs");

    }

    public static void MansOtraisUzdevums (){
        //2.uzdevums


        String[] zooZveri={"Lācis", "Žirafe", "Begemots","Surikats","Flamingo", "Lauva", "Pērtiķis"};
        int a= 0;
        while (a<4){
            System.out.println(zooZveri[a]);
            a=a+1;
        }
        for (String zveri:zooZveri) {
            System.out.println(zveri);

        }
        String[] zooZveri2={"Lācis", "Žirafe", "Begemots","Surikats","Flamingo", "Lauva", "Pērtiķis"};
        int k = 5;
        do {
            System.out.println(zooZveri2[k]);
            k--;
        }while (k >= 1);

        int[] konsultacijuSkaits={25, 58, 95, 87,63,54,21,77,99, 124, 41,32, 36, 995, 54, 10};
        int v= 2;
        while (v<8){
            System.out.println(konsultacijuSkaits[v]);
            v++;
        }
        System.out.println("#######");
        int[] konsultacijuSkaits2={25, 58, 95, 87,63,54,21,77,99, 124, 41,32, 36, 995, 54, 10};
        int n = 3;
        do{
            System.out.println(konsultacijuSkaits2[n]);
            n= n + 2;
        } while (n <= 14);

        System.out.println("$$$$$$$$$$$");
        int[] konsultacijuSkaits3 ={25, 58, 95, 87,63,54,21,77,99, 124, 41,32, 36, 995, 54, 10};
        for (int i = 0; i < konsultacijuSkaits3.length; i=i+4) {
            System.out.println(konsultacijuSkaits3[i]);
        }
        System.out.println("$$$$$$$$$$$");
        for (int cipari:konsultacijuSkaits3) {
            System.out.println (cipari);
        }
        System.out.println("@@@@@@@@@@@@@@@@@");

        int s=5;
        while (s>0 && s<25){
            System.out.println("X vērtība ir:" + s);
            s=s+3;
        }

        int t=2;
        do {
            System.out.println("IR smuks 2");
            t++;
        } while (t<=15);

        char[] vaards= {'A','i','g','a'};
        int i = 1;
        for (char burts :vaards) {
            System.out.println(burts);
            i++;
        }



    }
    public static void mansTresaisUzdevums(){
        int x=0;
        while (x <= 100){
            System.out.print(x);
            x=x+2;


        }


    }

//    public static void mansCeturtaisUzdevums(){
//        int[] faktoralais={}
//
//    }


}
