package subClass;

import java.util.*;
import abstracts.Pegawai;
import interfaces.Bonus;

public class Programmer extends Pegawai implements Bonus {
    private final List<String> bahasaPemrograman;

    public Programmer(String nama, double gaji, List<String> bahasaPemrograman) {
        super(nama, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
        System.out.println("Bidang: Programmer");
        System.out.println("Bahasa Pemrograman: " + bahasaPemrograman);
        System.out.println("Bonus Tahunan: " + hitungBonus());
        System.out.println();
    }

    @Override
    public double hitungBonus() {
        return gaji * 0.10;
    }
}
