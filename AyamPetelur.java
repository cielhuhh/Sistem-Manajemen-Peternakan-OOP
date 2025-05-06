public class AyamPetelur extends Ayam {
    private int produksiTelur;

    public AyamPetelur(String nama, int umur, String jenis, int produksiTelur) {
        super(nama, umur, jenis);
        this.produksiTelur = produksiTelur;
    }

    public int getProduksiTelur() { return produksiTelur; }

    public void tampilkanInfo() {
        System.out.println("Ayam Petelur: " + getNama() + ", Umur: " + getUmur() + " bulan, Jenis: " +
                           getJenis() + ", Produksi Telur: " + produksiTelur + " butir/hari");
    }
}
