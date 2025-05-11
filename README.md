# 🐄🐔 Sistem Manajemen Peternakan

**Nama:** Bryan Alberta Hildan Pradana  
**Kelas:** 4ITA1  
**NIM:** 223140148  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

## 📌 Deskripsi

Program ini dibuat untuk memenuhi tugas **Ujian Tengah Semester (UTS)** mata kuliah *Pemrograman Berorientasi Objek*. Studi kasus yang digunakan adalah *Sistem Manajemen Peternakan* dengan menerapkan prinsip-prinsip OOP berikut:

- ✅ Class & Object  
- ✅ Encapsulation  
- ✅ Inheritance (hingga 2 tingkat)  
- ✅ Polymorphism (method overriding)  
- ✅ ArrayList sebagai struktur data

---

## 🧱 Struktur Kelas

Hewan (superclass)

├── Sapi

│ └── SapiPerah

└── Ayam

└── AyamPedaging

## ⚙️ Fitur Program

- Menyimpan data hewan ternak (sapi perah dan ayam pedaging).
- Menampilkan informasi hewan dan suara khasnya.
- Pewarisan hingga 2 tingkat (turunan cucu).
- Penerapan polymorphism saat iterasi array objek.

## ▶️ Cara Menjalankan Program

1. Pastikan semua file `.java` berada dalam satu folder:
   - `Hewan.java`
   - `Sapi.java`
   - `SapiPerah.java`
   - `Ayam.java`
   - `AyamPedaging.java`
   - `Peternakan.java`

2. Buka terminal di folder tersebut, lalu jalankan:
   ```bash
   javac Peternakan.java
   java Peternakan

   # Sistem Manajemen Peternakan OOP

Program ini mengimplementasikan konsep OOP Java untuk sistem manajemen peternakan.

## 💡 Konsep OOP yang Digunakan:
1. **Class & Object**: 
   - Class: Hewan, Ayam, Sapi, Peternakan
   - Object: Instance dari class-class tersebut

2. **Encapsulation**:
   - Attribute seperti nama, umur dibuat private
   - Akses via getter/setter method

3. **Inheritance**:
   - Ayam dan Sapi mewarisi dari Hewan (level 1)
   - AyamPedaging dan AyamPetelur mewarisi dari Ayam (level 2)

4. **Array/Collection**:
   - Menggunakan ArrayList untuk menyimpan data hewan

## 🖥️ Output Program
Tambah Hewan :



![image](https://github.com/user-attachments/assets/c535b290-2bd6-4c65-b11f-45e8aa7749e3)

Menampilkan Semua Data Hewan :



![image](https://github.com/user-attachments/assets/e27e996c-de22-406c-b0be-4b0dbe504ac0)



Cari Hewan :

![image](https://github.com/user-attachments/assets/30f129e5-191e-4e86-bcf7-1fa06fd053b8)



Keluar :

![image](https://github.com/user-attachments/assets/237fca61-d905-46fc-9ac0-11e2f888a429)




