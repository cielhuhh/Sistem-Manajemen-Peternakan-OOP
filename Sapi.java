/**
 * Class Sapi yang mewarisi dari Hewan
 * Mengimplementasikan konsep inheritance (level 1)
 */
public class Sapi extends Hewan {
    private String jenisSapi;
    private double produksiSusu; // liter per hari

    public Sapi(String nama, int umur, String jenisKelamin, String jenisSapi, double produksiSusu) {
        super(nama, umur, "Sapi", jenisKelamin);
        this.jenisSapi = jenisSapi;
        this.produksiSusu = produksiSusu;
    }

    // Getter dan setter khusus Sapi
    public String getJenisSapi() {
        return jenisSapi;
    }

    public double getProduksiSusu() {
        return produksiSusu;
    }

    public void setJenisSapi(String jenisSapi) {
        this.jenisSapi = jenisSapi;
    }

    public void setProduksiSusu(double produksiSusu) {
        this.produksiSusu = produksiSusu;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Sapi: " + jenisSapi);
        System.out.println("Produksi Susu: " + produksiSusu + " liter/hari");
    }

    // Method khusus Sapi
    public void bersuara() {
        System.out.println(getNama() + " bersuara: Moooo!");
    }
}