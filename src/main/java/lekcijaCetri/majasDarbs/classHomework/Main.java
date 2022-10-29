package lekcijaCetri.majasDarbs.classHomework;

public class Main {

    public static void main(String[] args) {

        Trissturis figura = new Trissturis();
        figura.a = 17;
        figura.b = 39;
        figura.c = 44;
        figura.pp= 0;
        figura.vaiVienadmalu= false;
        figura.vaiVienadsanu = false;
        figura.S=0;
//
//        Trissturis figura2 = new Trissturis(24, 29, 38, false, false);
//        System.out.println(figura2.pusPerimetrs());
//        System.out.println(figura2.trissturaLaukums());


        System.out.println(figura.printTrissturi());

        System.out.println("Pusperimetrs");
        System.out.println(figura.pusPerimetrs());

        System.out.println("Trisstūra laukums ir:");
        System.out.println(figura.trissturaLaukums());














    }
}
