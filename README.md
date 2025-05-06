# Sistem Manajemen Peternakan 🐄🐔

**Nama:** Bryan Alberta Hildan Pradana  
**Kelas:** 4ITA1  
**NIM:** 223140148  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

## 📌 Deskripsi

Program ini dibuat untuk memenuhi tugas Ujian Tengah Semester (UTS) mata kuliah **Pemrograman Berorientasi Objek**. Studi kasus yang digunakan adalah *Sistem Manajemen Peternakan*, dengan penerapan prinsip-prinsip OOP seperti:

- ✅ Class & Object  
- ✅ Encapsulation  
- ✅ Inheritance (hingga 2 tingkat)  
- ✅ Polymorphism (method overriding)  
- ✅ Array untuk menyimpan objek

---

## 🧱 Struktur Kelas

Hewan (superclass)
├── Sapi
│ └── SapiPerah
└── Ayam
└── AyamPetelur

## Fitur Program
- Menyimpan data hewan ternak seperti sapi perah dan ayam petelur.
- Menampilkan informasi hewan beserta suara khasnya.
- Menggunakan pewarisan hingga dua tingkat.
- Menunjukkan konsep polymorphism saat iterasi array objek.

## Cara Menjalankan Program
1. Pastikan semua file `.java` sudah disimpan dalam satu folder:
   - `Hewan.java`
   - `Sapi.java`
   - `SapiPerah.java`
   - `Ayam.java`
   - `AyamPetelur.java`
   - `Peternakan.java`

2. Kompilasi semua file:
   ```bash
   javac *.java
   
**Contoh Output**

Sapi A menguak.
Sapi Perah: Sapi A, Umur: 4 tahun, Berat: 350.5 kg, Produksi Susu: 12.0 liter

Sapi B menguak.
Sapi Perah: Sapi B, Umur: 5 tahun, Berat: 400.0 kg, Produksi Susu: 15.5 liter

Ayam A berkokok.
Ayam Petelur: Ayam A, Umur: 1 bulan, Jenis: Lokal, Produksi Telur: 6 butir/hari

Ayam B berkokok.
Ayam Petelur: Ayam B, Umur: 2 bulan, Jenis: Ras, Produksi Telur: 8 butir/hari
