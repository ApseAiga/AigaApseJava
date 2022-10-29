package lekcijaPieci.labDarbs;

public class House {
    private int stavuDaudzums;
    private int loguSkaits;
   private int durvuSkaits;
    private String adrese;
   private double griestuAugstums;
    private long kadastralaVertiba;
   private boolean vaiPrivatipasums;

    public void setKadastralaVertiba(long kadastralaVertiba) {
        this.kadastralaVertiba = kadastralaVertiba;

    }

    public void setStavuDaudzums(int stavuDaudzums) {
        this.stavuDaudzums = stavuDaudzums;
    }

    public void setLoguSkaits(int loguSkaits) {
        this.loguSkaits = loguSkaits;
    }

    public void setDurvuSkaits(int durvuSkaits) {
        this.durvuSkaits = durvuSkaits;
    }

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }

    public void setGriestuAugstums(double griestuAugstums) {
        this.griestuAugstums = griestuAugstums;
    }

    public void setVaiPrivatipasums(boolean vaiPrivatipasums) {
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    public int getStavuDaudzums() {
        return stavuDaudzums;
    }

    public int getLoguSkaits() {
        return loguSkaits;
    }

    public int getDurvuSkaits() {
        return durvuSkaits;
    }

    public String getAdrese() {
        return adrese;
    }

    public double getGriestuAugstums() {
        return griestuAugstums;
    }

    public long getKadastralaVertiba() {
        return kadastralaVertiba;
    }

    public boolean isVaiPrivatipasums() {
        return vaiPrivatipasums;
    }

    public House(){

    }

    public House(int stavuDaudzums, int loguSkaits, int durvuSkaits, String adrese, double griestuAugstums, long kadastralaVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvuSkaits = durvuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadastralaVertiba = kadastralaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;

    }

    public void printHouse() {
        System.out.println("House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvuSkaits=" + durvuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}');
    }
}
