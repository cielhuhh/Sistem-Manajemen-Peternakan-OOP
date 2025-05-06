public class Hewan {
    private String nama;
    private int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}
