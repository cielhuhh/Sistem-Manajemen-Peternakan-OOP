// Program UTS - Sistem Manajemen Peternakan
// Konsep: OOP Java - Class & Object, Encapsulation, Inheritance, Array

class Hewan {
    // 🔐 Encapsulation: atribut private
    private String nama;
    private int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // 🧬 Polymorphism: method bisa di-override
    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// 🐄 Turunan 1 dari Hewan
class Sapi extends Hewan {
    private double berat;

    public Sapi(String nama, int umur, double berat) {
        super(nama, umur);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " menguak.");
    }
}

// 🐄🐄 Turunan 2 (Cucu) dari Sapi
class SapiPerah extends Sapi {
    private double produksiSusu; // liter per hari

    public SapiPerah(String nama, int umur, double berat, double produksiSusu) {
        super(nama, umur, berat);
        this.produksiSusu = produksiSusu;
    }

    public double getProduksiSusu() {
        return produksiSusu;
    }

    public void tampilkanInfo() {
        System.out.println("Sapi Perah: " + getNama() + ", Umur: " + getUmur() + " tahun, Berat: " +
                           getBerat() + " kg, Produksi Susu: " + produksiSusu + " liter");
    }
}

// 🐔 Turunan 1 dari Hewan
class Ayam extends Hewan {
    private String jenis;

    public Ayam(String nama, int umur, String jenis) {
        super(nama, umur);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkokok.");
    }
}

// 🐔🐔 Turunan 2 (Cucu) dari Ayam
class AyamPetelur extends Ayam {
    private int produksiTelur; // butir per hari

    public AyamPetelur(String nama, int umur, String jenis, int produksiTelur) {
        super(nama, umur, jenis);
        this.produksiTelur = produksiTelur;
    }

    public int getProduksiTelur() {
        return produksiTelur;
    }

    public void tampilkanInfo() {
        System.out.println("Ayam Petelur: " + getNama() + ", Umur: " + getUmur() + " bulan, Jenis: " +
                           getJenis() + ", Produksi Telur: " + produksiTelur + " butir/hari");
    }
}

// 💻 Kelas Utama
public class Peternakan {
    public static void main(String[] args) {
        // 📦 Membuat array hewan (polymorphism)
        Hewan[] daftarHewan = new Hewan[4];

        daftarHewan[0] = new SapiPerah("Sapi A", 4, 350.5, 12.0);
        daftarHewan[1] = new SapiPerah("Sapi B", 5, 400.0, 15.5);
        daftarHewan[2] = new AyamPetelur("Ayam A", 1, "Lokal", 6);
        daftarHewan[3] = new AyamPetelur("Ayam B", 2, "Ras", 8);

        // 🖨️ Menampilkan suara & data masing-masing hewan
        for (Hewan h : daftarHewan) {
            h.bersuara(); // Polymorphism

            // instance check + casting
            if (h instanceof SapiPerah sapi) {
                sapi.tampilkanInfo();
            } else if (h instanceof AyamPetelur ayam) {
                ayam.tampilkanInfo();
            }

            System.out.println();
        }
    }
}
