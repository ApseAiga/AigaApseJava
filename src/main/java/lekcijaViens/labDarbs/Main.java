package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
     //int - integer , satur veselu skaitli
        int vecums = 34;

        System.out.println("Mans vecums ir:" + vecums);
        int garums =  168;
        System.out.println("Mans garums ir:" + garums);
        int kurpjuIzmers = 39;
        System.out.println("Mans kurpju izmers ir:" + kurpjuIzmers);
        int darbaStazs = 17;
        System.out.println("Mans darba stazs ir:" + darbaStazs);
        String sunaVards = "Reksis";
        System.out.println("Suņa vards ir:" + sunaVards);
        String teksts = "Suņa vārds ir:";
        System.out.println(teksts + sunaVards);

        //Maksimālā integer vērtība
        int maxInt = 2147483647;
        int minIt = -2147483647;

        //pieņem veselu skaitli no -128 līz 127
        byte vecumsDivi = 99;

        short latvijasMazpilseta = 17000;
        long zivisOkeana = 2147483647L;

        float apavuIzmers = 44.5F;
        System.out.println("apavu izmers" + apavuIzmers);

        double grauduSvars = 150.3;
        System.out.println("Tika pārdoti " + grauduSvars + "kg graudu");

        //"Sodien ir sestdiena, lielveikals ir atverts
        boolean isOpen = true;
        boolean isClosed = false;
        System.out.println("vai veikals ir atvērts?:" + isOpen);

        boolean isFebruaris = false;
        boolean isLeapYear = true;

        boolean vaiIrPotets = true;
        if (vaiIrPotets==true)
            System.out.println("Reksis drīkst braukt uz ārzemēm");

        String sunaSkirne = "VAS";
        char valuta = '$';
        char dzimums = 'V';
        System.out.println(valuta +dzimums);

        int summa;
        summa = 5+5;
        System.out.println(summa);
        int a = 5;
        int b = 10;
        System.out.println(a+b);

        int x = 10;
        int y = -45;

        int rezultats = x+y;
        System.out.println(rezultats);

        rezultats = x-y;
        System.out.println(rezultats);

        rezultats = x * y;
        System.out.println(rezultats);

        rezultats = x / y;
        System.out.println(rezultats);

        rezultats = 11 % 2;
        System.out.println(rezultats);

        rezultats = 5*(3+7);
       System.out.println(rezultats);

       // uzdevums

       String autoNosaukums = "Mercedes";
        System.out.println(autoNosaukums);
        int vecumsTris = 25;
       System.out.println(vecumsTris);
        double svars = 197.5;
        System.out.println(svars);
        boolean VaiIrRetro = true;
        System.out.println("vai šis auto ir retro?:" + true);





















    }
}
