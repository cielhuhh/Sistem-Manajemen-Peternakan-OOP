import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class utama untuk manajemen peternakan
 * Menggunakan ArrayList untuk menyimpan koleksi hewan
 */
public class Peternakan {
    private ArrayList<Hewan> daftarHewan;
    private Scanner scanner;

    public Peternakan() {
        daftarHewan = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void tambahHewan(Hewan hewan) {
        daftarHewan.add(hewan);
        System.out.println("Hewan berhasil ditambahkan!");
    }

    public void tampilkanSemuaHewan() {
        System.out.println("\nDaftar Hewan di Peternakan:");
        for (Hewan hewan : daftarHewan) {
            hewan.displayInfo();
            System.out.println("--------------------");
        }
    }

    public void cariHewan(String nama) {
        boolean ditemukan = false;
        for (Hewan hewan : daftarHewan) {
            if (hewan.getNama().equalsIgnoreCase(nama)) {
                System.out.println("\nHewan ditemukan:");
                hewan.displayInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Hewan dengan nama '" + nama + "' tidak ditemukan.");
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\nSistem Manajemen Peternakan");
            System.out.println("1. Tambah Hewan");
            System.out.println("2. Tampilkan Semua Hewan");
            System.out.println("3. Cari Hewan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    tambahHewanMenu();
                    break;
                case 2:
                    tampilkanSemuaHewan();
                    break;
                case 3:
                    System.out.print("Masukkan nama hewan: ");
                    String nama = scanner.nextLine();
                    cariHewan(nama);
                    break;
                case 4:
                    System.out.println("Keluar dari sistem...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void tambahHewanMenu() {
        System.out.println("\nTambah Hewan Baru");
        System.out.println("1. Ayam");
        System.out.println("2. Ayam Pedaging");
        System.out.println("3. Sapi");
        System.out.println("4. Sapi Perah");
        System.out.print("Pilihan jenis hewan: ");
        
        int jenis = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("Nama hewan: ");
        String nama = scanner.nextLine();
        
        System.out.print("Umur (tahun): ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Jenis kelamin (Jantan/Betina): ");
        String jenisKelamin = scanner.nextLine();
        
        switch (jenis) {
            case 1: // Ayam
                System.out.print("Jenis ayam: ");
                String jenisAyam = scanner.nextLine();
                System.out.print("Bisa terbang (true/false): ");
                boolean bisaTerbang = scanner.nextBoolean();
                scanner.nextLine();
                
                Ayam ayam = new Ayam(nama, umur, jenisKelamin, jenisAyam, bisaTerbang);
                tambahHewan(ayam);
                break;
                
            case 2: // Ayam Pedaging
                System.out.print("Berat (kg): ");
                double berat = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Grade (A/B/C): ");
                String grade = scanner.nextLine();
                
                AyamPedaging ayamPedaging = new AyamPedaging(nama, umur, jenisKelamin, berat, grade);
                tambahHewan(ayamPedaging);
                break;
                
            case 3: // Sapi
                System.out.print("Jenis sapi: ");
                String jenisSapi = scanner.nextLine();
                System.out.print("Produksi susu (liter/hari): ");
                double produksiSusu = scanner.nextDouble();
                scanner.nextLine();
                
                Sapi sapi = new Sapi(nama, umur, jenisKelamin, jenisSapi, produksiSusu);
                tambahHewan(sapi);
                break;
                
            case 4: // Sapi Perah
                System.out.print("Produksi susu (liter/hari): ");
                double produksiSusuPerah = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Kualitas susu (Premium/Standar): ");
                String kualitasSusu = scanner.nextLine();
                System.out.print("Hari produktif per tahun: ");
                int hariProduktif = scanner.nextInt();
                scanner.nextLine();
                
                SapiPerah sapiPerah = new SapiPerah(nama, umur, jenisKelamin, produksiSusuPerah, kualitasSusu, hariProduktif);
                tambahHewan(sapiPerah);
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void main(String[] args) {
        Peternakan peternakan = new Peternakan();
        
        // Menambahkan beberapa contoh hewan
        peternakan.tambahHewan(new Ayam("Jago", 2, "Jantan", "Kampung", true));
        peternakan.tambahHewan(new AyamPedaging("Broiler", 1, "Betina", 3.5, "A"));
        peternakan.tambahHewan(new Sapi("Bobby", 4, "Jantan", "Limousin", 0));
        peternakan.tambahHewan(new SapiPerah("Lola", 5, "Betina", 15.5, "Premium", 300));
        
        // Menjalankan menu utama
        peternakan.menu();
    }
}