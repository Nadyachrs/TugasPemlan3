package pemlan_3;

// Nama: NADYA CHARRISA GABRIELA
// NIM: 235150400111009
// Kelas: SI-A

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SELAMAT DATANG");
        System.out.println("================");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        mahasiswa mahasiswa = new mahasiswa(nim, nama);

        while (true) {
            System.out.print("Masukkan kode mata kuliah (atau ketik 'selesai' untuk keluar): ");
            String kodeMK = scanner.nextLine();
            if (kodeMK.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan nama mata kuliah: ");
            String namaMK = scanner.nextLine();
            System.out.print("Masukkan nilai angka: ");
            double nilaiAngka = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline
            matkul mk = new matkul(kodeMK, namaMK, nilaiAngka);
            mahasiswa.tambahMataKuliah(mk);
        }

        System.out.println();

        System.out.println("------------------------------------------------------------------------------------");
        // Cetak KHS mahasiswa
        mahasiswa.cetakKHS();
        System.out.println("------------------------------------------------------------------------------------");

    }
}
    

