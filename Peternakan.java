public class Peternakan {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[4];

        daftarHewan[0] = new SapiPerah("Sapi A", 4, 350.5, 12.0);
        daftarHewan[1] = new SapiPerah("Sapi B", 5, 400.0, 15.5);
        daftarHewan[2] = new AyamPetelur("Ayam A", 1, "Lokal", 6);
        daftarHewan[3] = new AyamPetelur("Ayam B", 2, "Ras", 8);

        for (Hewan h : daftarHewan) {
            h.bersuara();

            if (h instanceof SapiPerah sapi) {
                sapi.tampilkanInfo();
            } else if (h instanceof AyamPetelur ayam) {
                ayam.tampilkanInfo();
            }

            System.out.println();
        }
    }
}
