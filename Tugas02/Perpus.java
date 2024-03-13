package Tugas02;
public class Perpus {
    private String judul;
    private String penulis;
    private int tahun;
    private int jumlah;
    private String penerbit;
    private String sinopsis;
    public Perpus(){
    }
    public Perpus(String judul, String penulis, int tahun, int jumlah, String penerbit, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.jumlah = jumlah;
        this.penerbit = penerbit;
        this.sinopsis = sinopsis;
    }
    public void displayInfo(){
        System.out.println("1. Judul Buku           : " + judul);
        System.out.println("2. Penulis              : " + penulis);
        System.out.println("3. Tahun Terbit         : " + tahun);
        System.out.println("4. Jumlah Halaman       : " + jumlah);
        System.out.println("5. Nama Penerbit        : " + penerbit);
        System.out.println("6. Sinopsis             : " + sinopsis);
        System.out.println("7. Jumlah Kata Sinopsis : " + jumlahKata(sinopsis) + " Kata\n");
    }
    public int jumlahKata (String sinopsis){
        return sinopsis.split("\\s+").length;
    }
    public int tingkatKesamaan (Perpus bukuLain){
        int similarity = 0;
        if(bukuLain.judul.equalsIgnoreCase(this.judul)){
            similarity++;
        }
        if(bukuLain.penulis.equalsIgnoreCase(this.penulis)){
            similarity++;
        }
        if(bukuLain.tahun == this.tahun){
            similarity++;
        }
        if(bukuLain.jumlah == this.jumlah){
            similarity++;
        }
        if(bukuLain.penerbit.equalsIgnoreCase(this.penerbit)){
            similarity++;
        }
        if(bukuLain.sinopsis.equalsIgnoreCase(this.sinopsis)){
            similarity++;
        }
        return (int) (similarity / 6.0 * 100);
    }
    public Perpus copy (Perpus bukuLain){
        return new Perpus(bukuLain.judul, bukuLain.penulis, bukuLain.tahun, bukuLain.jumlah, bukuLain.penerbit, bukuLain.sinopsis);
    }
    public void kategori(Perpus[] bukuArray){
        int i = 0;
        for (Perpus buku : bukuArray) {
            i++;
            if (i <= bukuArray.length) 
                System.out.println("Buku ke-" + i);
            buku.displayInfo();
        }
    }
}
