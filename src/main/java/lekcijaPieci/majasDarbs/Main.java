package lekcijaPieci.majasDarbs;

public class Main {
    public static void main(String[] args) {
        Cilindrs forma = new Cilindrs();
        forma.H = 10;
        forma.R =6;
        System.out.println(forma.R);
        System.out.println(forma.H);


        forma.setR(12);
        forma.setH(14);


        System.out.println(forma.cilindraLaukums());
        System.out.println(forma.cilindraTilpums());

        System.out.println("Cilindra radiuss ir: " + forma.getR());
        System.out.println("Cilindra augstums ir: " + forma.getH());

        Cilindrs forma2= new Cilindrs(14, 8);
        System.out.println(forma2.cilindraLaukums());
        System.out.println(forma2.cilindraTilpums());





    }


}
