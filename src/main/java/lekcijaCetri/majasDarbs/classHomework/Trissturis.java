package lekcijaCetri.majasDarbs.classHomework;

public class Trissturis {

    int a;
    int b;
    int c;
    int pp;
    boolean vaiVienadmalu;
    boolean vaiVienadsanu;
    int S;



    public String printTrissturi() {
        return "Trissturis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", pp=" + pp +
                ", vaiVienadmalu=" + vaiVienadmalu +
                ", vaiVienadsanu=" + vaiVienadsanu +
                '}';
    }

    public int pusPerimetrs(){
        return pp = (a + b + c)/2;
    }

    public double trissturaLaukums() {
        return S = (int) Math.sqrt(pp*(pp-a)*(pp-b)*(pp-c));

    }
//
//    public Trissturis(int a, int b, int c, boolean vaiVienadmalu, boolean vaiVienadsanu) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        this.vaiVienadmalu = vaiVienadmalu;
//        this.vaiVienadsanu = vaiVienadsanu;
//    }
}
