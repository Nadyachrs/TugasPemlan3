package pemlan_3;

// Nama: NADYA CHARRISA GABRIELA
// NIM: 235150400111009
// Kelas: SI-A


import java.util.ArrayList;

public class mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<matkul> mataKuliah;

    public mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliah = new ArrayList<>();
    }

    public void tambahMataKuliah(matkul mk) {
        mataKuliah.add(mk);
    }

    public void cetakKHS() {
        System.out.println("                             KARTU HASIL STUDI (KHS)                                ");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Mata Kuliah:");
        for (matkul mk : mataKuliah) {
        System.out.printf(" | Kode MK: %-10s | Nama MK: %-20s | Nilai Huruf: %c | %n", mk.getKodeMK(), mk.getNamaMK(), mk.hitungNilaiHuruf());
    }
    }
}
    

