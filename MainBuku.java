package Tugas01;
import java.util.Scanner;
public class MainBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Buku daftarBuku = new Buku();
        System.out.println("========================================\nSelamat Datang di Perpustakaan Brawijaya\n========================================");
        System.out.println("Berikut adalah kategori buku yang tersedia\n1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n8. Keluar dari program");
        System.out.print("Silahkan masukkan nomor kategori untuk melihat informasi buku: ");
        int jawab = input.nextInt();
        if(jawab == 1){
            daftarBuku.teknologi();
        }
        else if (jawab == 2){
            daftarBuku.filsafat();
        }
        else if (jawab == 3){
            daftarBuku.sejarah();
        }
        else if (jawab == 4){
            daftarBuku.agama();
        }
        else if (jawab == 5){
            daftarBuku.psikologi();
        }
        else if (jawab == 6){
            daftarBuku.politik();
        }
        else if (jawab == 7){
            daftarBuku.fiksi();
        }
        else if (jawab == 8){
            System.out.println("Terimakasih telah menggunakan program ini :D");
            return;
        }
        else {
            System.out.println("Maaf, Nomor Kategori Tidak Tersedia");
        }
    } 
}
