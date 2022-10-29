package lekcijaPieci.majasDarbs;

public class Cilindrs {

    private int r;
    private int h;

    public int pi = 3;
    public int laukums;
    public int tilpums;



    public void setR(int r) {
        this.r = r;
    }

    public void setH(int h) {

        this.h = h;

    }

    public int getR() {
        return r;
    }

    public int getH() {
        return h;
    }

    public double cilindraLaukums(){
               return laukums = pi * r * r;

    }

      public  double cilindraTilpums(){
       return tilpums= laukums * h;
    }

    public Cilindrs(){};

    int H;
    int R;

    public Cilindrs(int h, int r) {

    }


}
