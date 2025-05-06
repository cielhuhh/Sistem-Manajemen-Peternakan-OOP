/**
 * Class Ayam yang mewarisi dari Hewan
 * Mengimplementasikan konsep inheritance (level 1)
 */
public class Ayam extends Hewan {
    private String jenisAyam;
    private boolean bisaTerbang;

    public Ayam(String nama, int umur, String jenisKelamin, String jenisAyam, boolean bisaTerbang) {
        super(nama, umur, "Ayam", jenisKelamin);
        this.jenisAyam = jenisAyam;
        this.bisaTerbang = bisaTerbang;
    }

    // Getter dan setter khusus Ayam
    public String getJenisAyam() {
        return jenisAyam;
    }

    public boolean isBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Ayam: " + jenisAyam);
        System.out.println("Bisa Terbang: " + (bisaTerbang ? "Ya" : "Tidak"));
    }

    // Method khusus Ayam
    public void berkokok() {
        System.out.println(getNama() + " berkokok: Kukuruyukkk!");
    }
}