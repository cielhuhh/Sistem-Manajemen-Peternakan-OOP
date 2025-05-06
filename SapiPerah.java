/**
 * Class SapiPerah yang mewarisi dari Sapi
 * Mengimplementasikan konsep inheritance level 2 (turunan kedua)
 */
public class SapiPerah extends Sapi {
    private String kualitasSusu;
    private int hariProduktif;

    public SapiPerah(String nama, int umur, String jenisKelamin, double produksiSusu, String kualitasSusu, int hariProduktif) {
        super(nama, umur, jenisKelamin, "Perah", produksiSusu);
        this.kualitasSusu = kualitasSusu;
        this.hariProduktif = hariProduktif;
    }

    // Getter dan setter khusus SapiPerah
    public String getKualitasSusu() {
        return kualitasSusu;
    }

    public int getHariProduktif() {
        return hariProduktif;
    }

    public void setKualitasSusu(String kualitasSusu) {
        this.kualitasSusu = kualitasSusu;
    }

    public void setHariProduktif(int hariProduktif) {
        this.hariProduktif = hariProduktif;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kualitas Susu: " + kualitasSusu);
        System.out.println("Hari Produktif: " + hariProduktif + " hari/tahun");
    }

    // Method khusus SapiPerah
    public void hitungProduksiTahunan() {
        double totalProduksi = getProduksiSusu() * hariProduktif;
        System.out.println("Produksi susu tahunan " + getNama() + ": " + totalProduksi + " liter");
    }
}