package Tugas05;
public class MainProgram {
    public static void main(String[] args) {
        Kue[] kueArray ={
            new KuePesanan("Onde-onde", 1000, 10),
            new KueJadi("Klepon", 3000, 2),
            new KueJadi("Lemper", 5000, 1),
            new KuePesanan("Kue Coklat", 300, 250),
            new KueJadi("Lapis Legit", 10000, 5),
            new KuePesanan("Kue Lapis", 600, 20),
            new KuePesanan("Kue Kering", 300, 50), 
            new KueJadi("Dadar Gulung", 2000, 2),
            new KueJadi("Kue Kacang", 5000, 4),
            new KuePesanan("Kue Cubit", 5000, 10),
            new KuePesanan("Kue Bolu", 450, 300),
            new KuePesanan("Kue Pandan", 2500, 45),
            new KueJadi("Kue Mangkok", 3000, 3),
            new KuePesanan("Kue Keju", 450, 200),
            new KueJadi("Donut", 3000, 3),
            new KueJadi("Kue Tart", 2000, 1),
            new KuePesanan("Kue Pisang", 1500, 40),
            new KuePesanan("Kue Mathca", 2500, 30),
            new KueJadi("Cupcake", 5000, 5),
            new KueJadi("Brownies", 20000, 2)
        };
        System.out.println("========Daftar Kue========");
        for(int i = 0; i < kueArray.length; i++) {
            System.out.println(kueArray[i] + "\n");
        }
        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double totalBeratPesanan = 0;
        double totalJumlahJadi = 0;
        String jenisKue = " ";
        for (Kue kue : kueArray) {
            if(kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("=============REKAP TOTAL HARGA=============");
        System.out.printf("Total Harga Semua Kue       : Rp%,.2f\n\n",(totalHargaPesanan + totalHargaJadi));
        System.out.printf("Total Harga Kue Pesanan     : Rp%,.2f\n", totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan     : " + totalBeratPesanan + " Gram\n");
        System.out.printf("Total Harga Kue Jadi        : Rp%,.2f\n", totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi       : " + totalJumlahJadi + " Buah\n");
        double hargaTertinggi = 0;
        String namaKue = " ";
        for(Kue kue : kueArray) {
            if(kue.hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kue.hitungHarga();
                namaKue = kue.getNama();
                jenisKue = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.printf("Kue dengan Harga Tertinggi  : %s\nHarga Kue Tertinggi         : Rp%,.2f\n", namaKue, hargaTertinggi);
        System.out.println("Jenis Kue                   : " + jenisKue);
    }
}