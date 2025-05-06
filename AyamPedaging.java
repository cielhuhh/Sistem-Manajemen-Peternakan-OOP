/**
 * Class AyamPedaging yang mewarisi dari Ayam
 * Mengimplementasikan konsep inheritance level 2 (turunan kedua)
 */
public class AyamPedaging extends Ayam {
    private double berat;
    private String grade;

    public AyamPedaging(String nama, int umur, String jenisKelamin, double berat, String grade) {
        super(nama, umur, jenisKelamin, "Pedaging", false);
        this.berat = berat;
        this.grade = grade;
    }

    // Getter dan setter khusus AyamPedaging
    public double getBerat() {
        return berat;
    }

    public String getGrade() {
        return grade;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Grade: " + grade);
    }

    // Method khusus AyamPedaging
    public void hitungHarga(double hargaPerKg) {
        double totalHarga = berat * hargaPerKg;
        System.out.println("Harga " + getNama() + ": Rp" + totalHarga);
    }
}