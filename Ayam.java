public class Ayam extends Hewan {
    private String jenis;

    public Ayam(String nama, int umur, String jenis) {
        super(nama, umur);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkokok.");
    }
}
