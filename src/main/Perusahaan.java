package main;

import abstracts.Pegawai;
import java.util.*;
import subClass.Designer;
import subClass.Programmer;

public class Perusahaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pegawai> daftarPegawai = new ArrayList<>();
        
        try {
            System.out.print("Masukkan nama Programmer: ");
            String namaProgrammer = scanner.nextLine();
            System.out.print("Masukkan gaji Programmer: ");
            double gajiProgrammer = Double.parseDouble(scanner.nextLine());
            daftarPegawai.add(new Programmer(namaProgrammer, gajiProgrammer, Arrays.asList("Java", "Python", "C++")));
        } catch (NumberFormatException e) {
            System.out.println("Error: Gaji harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Input Programmer selesai.");
        }

        try {
            System.out.print("Masukkan nama Designer: ");
            String namaDesigner = scanner.nextLine();
            System.out.print("Masukkan gaji Designer: ");
            double gajiDesigner = Double.parseDouble(scanner.nextLine());
            daftarPegawai.add(new Designer(namaDesigner, gajiDesigner, Arrays.asList("Photoshop", "Figma")));
        } catch (NumberFormatException e) {
            System.out.println("Error: Gaji harus berupa angka.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Input Designer selesai.");
        }
        
        System.out.println("\n=== Informasi Pegawai ===");
        for (Pegawai p : daftarPegawai) {
            p.tampilkanInfo();
        }

        scanner.close();
    }
}
