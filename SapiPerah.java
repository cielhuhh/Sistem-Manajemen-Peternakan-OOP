// SapiPerah.java
public class SapiPerah extends Sapi {
    private double produksiSusu;

    public SapiPerah(String nama, int umur, double berat, double produksiSusu) {
        super(nama, umur, berat);
        this.produksiSusu = produksiSusu;
    }

    public double getProduksiSusu() { return produksiSusu; }

    public void tampilkanInfo() {
        System.out.println("Sapi Perah: " + getNama() + ", Umur: " + getUmur() + " tahun, Berat: " +
                           getBerat() + " kg, Produksi Susu: " + produksiSusu + " liter");
    }
}
