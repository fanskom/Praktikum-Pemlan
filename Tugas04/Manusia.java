package Tugas04;
public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin(boolean jenisKelamnin) {
        this.jenisKelamin = jenisKelamnin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public String getNama() {
        return nama;
    }
    public String getJenisKelamin() {
        return jenisKelamin ? "Laki-laki" : "Perempuan";
    }
    public String getNik() {
        return nik;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public double getTunjangan() {
        if (menikah == true && jenisKelamin == false) {
            return 20;
        }
        else if(menikah == true && jenisKelamin == true) {
            return 25;
        }
        else {
            return 15;
        }
    }
    public double getPendapatan() {
        return getTunjangan();
    }
    public String toString(){
        return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\n", getNama(), getNik(), getJenisKelamin(), getPendapatan());
    }
}