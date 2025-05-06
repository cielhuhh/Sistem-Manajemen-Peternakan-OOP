// Sapi.java
public class Sapi extends Hewan {
    private double berat;

    public Sapi(String nama, int umur, double berat) {
        super(nama, umur);
        this.berat = berat;
    }

    public double getBerat() { return berat; }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " menguak.");
    }
}
