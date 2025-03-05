package subClass;

import java.util.*;
import abstracts.Pegawai;
import interfaces.Bonus;

public class Designer extends Pegawai implements Bonus {
    private final List<String> softwareDesain;

    public Designer(String nama, double gaji, List<String> softwareDesain) {
        super(nama, gaji);
        this.softwareDesain = softwareDesain;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
        System.out.println("Bidang: Designer");
        System.out.println("Software Desain: " + softwareDesain);
        System.out.println("Bonus Tahunan: " + hitungBonus());
        System.out.println();
    }

    @Override
    public double hitungBonus() {
        return gaji * 0.08;
    }
}
