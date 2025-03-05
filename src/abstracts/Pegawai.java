package abstracts;
public abstract class Pegawai {
    protected String nama;
    protected double gaji;

    public Pegawai(String nama, double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji tidak boleh negatif");
        }
        this.nama = nama;
        this.gaji = gaji;
    }

    public abstract void tampilkanInfo();
}
