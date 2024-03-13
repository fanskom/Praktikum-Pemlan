package Tugas02;
import java.util.Scanner;
public class MainPerpus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpus daftarBuku= new Perpus();
        System.out.println("========================================\nSelamat Datang di Perpustakaan Brawijaya\n========================================");
        System.out.println("Berikut adalah kategori buku yang tersedia\n1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi");
        System.out.print("Silahkan masukkan nomor kategori untuk melihat informasi buku: ");
        int jawab = input.nextInt();
        Perpus[] bukuArray = new Perpus[5];
        do {
            if (jawab == 1){
                Perpus buku1 = new Perpus("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin", 2008, 464, "Prentice Hall", "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Asperiores, ullam.");
                Perpus buku2 = new Perpus("The Pragmatic Programmer: Your Journey to Mastery","Dave Thomas dan Andy Hunt", 2008, 352, "Addison Wesley", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit mollitia veniam ad rerum.");
                Perpus buku3 = new Perpus("Design Patterns: Elements of Reusable Object-Oriented Software","Erich Gamma, Richard Helm, Ralph Johnson, dan John Vlissides", 1994, 416, "Addison Wesley","Lorem ipsum dolor sit amet consectetur, adipisicing elit. Maxime fuga sed ad debitis mollitia iusto, laborum sunt sapiente delectus itaque?");
                Perpus buku4 = new Perpus("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell", 1993, 352, "Microsoft Press","Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aperiam, unde repellat quae autem perferendis minus voluptatum?");
                Perpus buku5 = new Perpus("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 1999, 431, "Addison-Wesley", "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Beatae nemo ad dolore quis, iste at ducimus qui sapiente.");
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else if (jawab == 2){
                Perpus buku1 = new Perpus("Sophie's World","Jostein Gaarder", 1991, 513, "Farrar, Straus and Giroux", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Tenetur neque recusandae, incidunt iusto alias fugit!");
                Perpus buku2 = new Perpus("Being and Time (Sein und Zeit)", "Martin Heidegger", 1991, 592, "HarperCollins", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Iure, ipsum laboriosam!");
                Perpus buku3 = new Perpus("Beyond Good and Evil", "Friedrich Nietzsche", 2010, 240, "Oxford University Press", "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Possimus consectetur consequuntur, ullam rerum tempore soluta ipsum.");
                Perpus buku4 = new Perpus("Pandangan Puitis: Eksplorasi Filsafat dalam Puisi Klasik", "Prof. Dr. I Made Wirawan", 2019, 320, "Pustaka Filsafat Sejati", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus, culpa.");
                Perpus buku5 = new Perpus("Etika Hidup: Menemukan Makna Dalam Tindakan", "Dr. Fatimah Rahman", 2010, 240, "Kritis Publishing", "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Perspiciatis, eos.");
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else if (jawab == 3){;
                Perpus buku1 = new Perpus("Pulau Nusantara: Sejarah Maritim Indonesia", "Prof. Dr. Slamet Widodo", 2017, 400, "Sejarah Kita", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nesciunt, voluptatibus.");
                Perpus buku2 = new Perpus("Perang Dunia II: Kilas Balik dan Dampaknya pada Bangsa", "Dr. I Gusti Ayu Komang", 2019, 320, "Sejarah Abadi", "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ullam sit veniam illum!");
                Perpus buku3 = new Perpus("Majapahit: Pusat Kemegahan Nusantara", "Prof. Dr. Satrio Prabowo", 2020, 280, "Pustaka Sejarah", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Culpa, eligendi!");
                Perpus buku4 = new Perpus("Revolusi Industri: Transformasi Masyarakat di Abad ke-19", "Dr. Siti Rahayu", 2018, 350, "Sejarah Modern", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti laudantium nostrum cumque magnam asperiores rem? Laudantium.");
                Perpus buku5 = buku1.copy(buku1);
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else if (jawab == 4){
                Perpus buku1 = new Perpus("Perjalanan Rohani: Menyelami Kehidupan Berdasarkan Ajaran Al-Quran", "Ustadzah Fatimah Abdullah", 2019, 250, "Pustaka Iman", "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Dolorem, odit?");
                Perpus buku2 = new Perpus("Kisah-Kisah Hikmah dari Injil: Pelajaran Moral dalam Kepercayaan Kristen", "Pastor Andreas Wijaya", 2020, 280, "Roh Kudus Publishing", "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Quas, earum necessitatibus?");
                Perpus buku3 = new Perpus("Budaya dan Iman: Pergulatan Spiritual dalam Kepercayaan Hindu", "Dr. I Gusti Ayu Putu", 2018, 320, "Dharma Pustaka", "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Dolore, neque incidunt.");
                Perpus buku4 = new Perpus("Wisdom of the Buddha: Teachings for a Mindful Life", "Bhikkhu Dhammapala", 2017, 270, "Dharma Wisdom Publications", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam, dolores.");
                Perpus buku5 = new Perpus("Hikayat Surga: Kehidupan Sehari-hari Menurut Kitab Suci", "Pdt. Samuel Wijaya", 2017, 300, "Sejati Publishing", "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Cupiditate pariatur doloremque quo.");
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else if (jawab == 5){
                Perpus buku1 = new Perpus("Menggali Dalam Diri: Membongkar Lapisan Psikologi Manusia", "Dr. Anisa Rahmawati, M.Psi.", 2021, 280, "Psikologi Insight", "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Repellat saepe ullam praesentium doloremque magni maiores est?");
                Perpus buku2 = new Perpus("Cahaya Terapi: Pengembangan Diri melalui Psikoterapi Kognitif", "Prof. Dr. Budi Susanto", 2019, 320, "Pustaka Psikologi", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquid, officia?");
                Perpus buku3 = new Perpus("Misteri Kepribadian: Analisis Psikologi Klinis", "Dr. Retno Wulandari, M.Psi.", 2020, 250, "Kreatif Mind Books", "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Voluptatum pariatur sunt architecto.");
                Perpus buku4 = new Perpus("Psikologi Anak: Membimbing Tumbuh Kembang Sehat", "Prof. Dr. Faisal Rahman", 2018, 300, "Inti Pendidikan", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Iure, eum?");
                Perpus buku5 = new Perpus("Terapi Keluarga: Solusi Psikologis dalam Dinamika Hubungan Keluarga", "Dr. Ratna Wijaya, M.Psi.", 2022, 300, "PsikoHarmoni Publications", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nesciunt, quia?");
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else if (jawab == 6){
                Perpus buku1 = new Perpus("Dinamika Politik Kontemporer: Tantangan dan Transformasi", "Prof. Dr. Hasan Basri", 2020, 350, "Politika Pintar", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Consectetur, natus?");
                Perpus buku2 = new Perpus("Politik Identitas: Membongkar Keseimbangan Kekuasaan Global", "Dr. Siti Rahma", 2019, 280, "Politik Insight", "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Fugiat magni non cum?");
                Perpus buku3 = new Perpus("Demokrasi dalam Ujian: Refleksi Kritis terhadap Sistem Politik Modern", "Prof. Dr. Agus Setiawan", 2021, 320, "Demokratia Press", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Aut veritatis nobis delectus facere.");
                Perpus buku4 = new Perpus("Politik Ekonomi: Antara Kesejahteraan dan Ketidaksetaraan", "Dr. Rini Kusuma", 2018, 300, "Politik Publishing", "Lorem ipsum dolor sit amet consectetur, adipisicing elit. Soluta magni officiis perspiciatis veniam sequi quisquam veritatis, dolorem facere.");
                Perpus buku5 = new Perpus("Populisme dalam Era Digital: Kekuasaan dan Tantangan Politik Modern", "Dr. Aditya Pratama", 2022, 270, "Digital Democracy Books", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Exercitationem, eaque.");
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else if (jawab == 7){
                Perpus buku1 = new Perpus("Mimpi di Balik Kabu", "Rani Utami", 2019, 320, "Khatulistiwa Fiction", "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Est, minus non?");
                Perpus buku2 = new Perpus("Dunia Tenggelam", "Indra Novian", 2021, 280, "Cita Cita Books", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Eos esse a debitis nemo?");
                Perpus buku3 = new Perpus("Langit yang Hilang", "Ahmad Rifai", 2020, 280, "Imaji Novel", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quae deserunt numquam laudantium, aut perspiciatis quibusdam.");
                Perpus buku4 = buku2.copy(buku2);
                Perpus buku5 = new Perpus("Jejak Waktu", "Dimas Arya", 2022, 270, "Fantasi Press", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Illo, enim nesciunt?");
                bukuArray[0] = buku1; bukuArray[1]= buku2; bukuArray[2]= buku3; bukuArray[3]= buku4; bukuArray[4]= buku5;
                daftarBuku.kategori(bukuArray);
                break;
            }
            else {
                System.out.println("Maaf, nomor kategori tidak tersedia\n");
                do {
                    System.out.print("Silahkan masukkan nomor kategori dengan benar: ");
                    jawab = input.nextInt();
                } while (jawab < 1 || jawab > 7);
            }
        } while (jawab >= 1 && jawab <= 7);
        System.out.print("Apakah Anda ingin membandingkan tingkat kesamaan buku (y/t)? ");
        input.nextLine();
        String banding = input.nextLine();
        if (banding.equalsIgnoreCase("y")){
            System.out.print("Pilih nomor buku pertama untuk dibandingkan (1-5): ");
            int pilih1 = input.nextInt();
            System.out.print("Pilih nomor buku kedua untuk dibandingkan (1-5): ");
            int pilih2 = input.nextInt();
            if (pilih1 >= 0 && pilih1 <= bukuArray.length && pilih2 >=0 && pilih2 <= bukuArray.length){
                System.out.println("\nTingkat kesamaan buku ke-" + pilih1 + " dan buku ke-" + pilih2 + " adalah " + bukuArray[pilih1 - 1].tingkatKesamaan(bukuArray[pilih2 - 1]) + "%");
            }
            else {
                System.out.println("\nMaaf, nomor buku tidak tersedia");
            }
        }
        System.out.println("=========================================\nTerimakasih sudah menggunakan program ini\n=========================================");      
    }
}


