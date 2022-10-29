package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat ();
        Dog reksis = new Dog();
        Cow govs = new Cow();
        Fish zivs = new Fish();

        muris.age= 3;
        muris.canClimbTrees= true;

        reksis.canClimbTrees= false;

        muris.breathe();
        reksis.breathe();
        zivs.breathe();


        muris.makeSoud();
        reksis.makeSoud();
        govs.makeSoud();

        muris.eat();
        reksis.eat();

        muris.sharpenClaws();
        reksis.growl();

        muris.printClimbing();

        House house = new House(1,2,3,"Brivibas",
                2.5,100000L,true);

        house.printHouse();
        house.setKadastralaVertiba(30000L);
        house.printHouse();
        house.setAdrese("Tallinas iela");
        house.printHouse();

        //getter
        System.out.println("Majas adrese ir:" + house.getAdrese());

        Calculator kalkulators = new Calculator();
        System.out.println(kalkulators.add(5,10));
        System.out.println(kalkulators.add(5.3, 10.4));
        System.out.println(kalkulators.add(2.3, 5.1, 3.4));





    }
}
