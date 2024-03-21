package pemlan_3;

// Nama: NADYA CHARRISA GABRIELA
// NIM: 235150400111009
// Kelas: SI-A

public class matkul {
    private String kodeMK;
    private String namaMK;
    private double nilaiAngka;

    public matkul(String kodeMK, String namaMK, double nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public char hitungNilaiHuruf() {
        if (nilaiAngka >= 80) {
            return 'A';
        } else if (nilaiAngka >= 60) {
            return 'B';
        } else if (nilaiAngka >= 50) {
            return 'C';
        } else if (nilaiAngka >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
    

