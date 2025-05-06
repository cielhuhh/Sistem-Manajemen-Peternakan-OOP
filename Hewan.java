/**
 * Class dasar untuk representasi Hewan
 * Mengimplementasikan konsep encapsulation dengan private attributes dan public methods
 */
public class Hewan {
    // Encapsulation - attributes private
    private String nama;
    private int umur;
    private String jenis;
    private String jenisKelamin;

    // Constructor
    public Hewan(String nama, int umur, String jenis, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenis() {
        return jenis;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Method untuk menampilkan info hewan
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis: " + jenis);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}