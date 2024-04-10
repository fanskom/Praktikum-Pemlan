package Tugas04;
import java.time.LocalDate;
public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public double getBonus(){
        int tahun = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahun >= 0 && tahun <= 5){
            return 0.05 * gaji;
        }
        else if (tahun > 5 && tahun <= 10){
            return 0.10 * gaji;
        }
        else if (tahun > 10){
            return 0.15 * gaji;
        }
        else {
            return 0;
        }
    }
    public double getPendapatan(){
        return super.getPendapatan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
    }
    public String toString(){
        return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nTahun Masuk   : %s\nJumlah Anak   : %d\nGaji          : $%.1f\n", getNama(), getNik(), getJenisKelamin(), getPendapatan(), getTahunMasuk(), getJumlahAnak(), getGaji());
    }
}
