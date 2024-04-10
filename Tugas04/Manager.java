package Tugas04;
public class Manager extends Pekerja{
    private String departemen;
    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public String getDepartemen(){
        return departemen;
    }
    public double getPendapatan(){
        return super.getPendapatan() + (0.10 * getGaji());
    }
    public String toString(){
        return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nTahun Masuk   : %s\nJumlah Anak   : %d\nGaji          : $%.1f\nDepartemen    : %s\n", getNama(), getNik(), getJenisKelamin(), getPendapatan(), getTahunMasuk(), getJumlahAnak(), getGaji(), getDepartemen());
    } 
}
