package Tugas01;
public class Buku {
    private String judul;
    private String penulis;
    private int tahun;
    private int jumlah;
    private String penerbit;

    public Buku(){
    }
    public Buku(String judul, String penulis, int tahun, int jumlah, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.jumlah = jumlah;
        this.penerbit = penerbit;
    }
    public void displayInfo(){
        System.out.println("1. Judul Buku       : " +judul);
        System.out.println("2. Penulis          : " + penulis);
        System.out.println("3. Tahun Terbit     : " + tahun);
        System.out.println("4. Jumlah Halaman   : " + jumlah);
        System.out.println("5. Nama Penerbit    : " + penerbit + "\n");
    }
    public void kategori(Buku[] bukuArray){
        int i = 0;
        for (Buku buku : bukuArray) {
            i++;
            if (i <= bukuArray.length) 
                System.out.println("Buku ke-" + i);
            buku.displayInfo();
        }
    }
    public void teknologi(){
        Buku buku1 = new Buku("Clean Code: A Handbook of Agile Software Craftsmanship","Robert C. Martin", 2008, 464, "Prentice Hall");
        Buku buku2 = new Buku("The Pragmatic Programmer: Your Journey to Mastery","Dave Thomas dan Andy Hunt", 1999, 352, "Addison Wesley");
        Buku buku3 = new Buku("Design Patterns: Elements of Reusable Object-Oriented Software","Erich Gamma, Richard Helm, Ralph Johnson, dan John Vlissides", 1994, 416, "Addison Wesley");
        Buku buku4 = new Buku("Code Complete: A Practical Handbook of Software Construction", "Steve McConnell", 1993, 960, "Microsoft Press");
        Buku buku5 = new Buku("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 1999, 431, "Addison-Wesley");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
    public void filsafat(){
        Buku buku1 = new Buku("Sophie's World","Jostein Gaarder", 1991, 513, "Farrar, Straus and Giroux");
        Buku buku2 = new Buku("Being and Time (Sein und Zeit)", "Martin Heidegger", 2008, 592, "HarperCollins");
        Buku buku3 = new Buku("Beyond Good and Evil", "Friedrich Nietzsche", 2010, 240, "Oxford University Press");
        Buku buku4 = new Buku("Pandangan Puitis: Eksplorasi Filsafat dalam Puisi Klasik", "Prof. Dr. I Made Wirawan", 2019, 320, "Pustaka Filsafat Sejati");
        Buku buku5 = new Buku("Etika Hidup: Menemukan Makna Dalam Tindakan", "Dr. Fatimah Rahman", 2021, 240, "Kritis Publishing");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
    public void sejarah(){
        Buku buku1 = new Buku("Pulau Nusantara: Sejarah Maritim Indonesia", "Prof. Dr. Slamet Widodo", 2017, 400, "Sejarah Kita");
        Buku buku2 = new Buku("Perang Dunia II: Kilas Balik dan Dampaknya pada Bangsa", "Dr. I Gusti Ayu Komang", 2019, 320, "Sejarah Abadi");
        Buku buku3 = new Buku("Majapahit: Pusat Kemegahan Nusantara", "Prof. Dr. Satrio Prabowo", 2020, 280, "Pustaka Sejarah");
        Buku buku4 = new Buku("Revolusi Industri: Transformasi Masyarakat di Abad ke-19", "Dr. Siti Rahayu", 2018, 350, "Sejarah Modern");
        Buku buku5 = new Buku("Tragedi Kemanusiaan: Genosida Abad ke-20", "Prof. Dr. Soe Moe", 2021, 300, "Sejarah Manusia");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
    public void agama(){
        Buku buku1 = new Buku("Perjalanan Rohani: Menyelami Kehidupan Berdasarkan Ajaran Al-Quran", "Ustadzah Fatimah Abdullah", 2019, 250, "Pustaka Iman");
        Buku buku2 = new Buku("Kisah-Kisah Hikmah dari Injil: Pelajaran Moral dalam Kepercayaan Kristen", "Pastor Andreas Wijaya", 2020, 280, "Roh Kudus Publishing");
        Buku buku3 = new Buku("Budaya dan Iman: Pergulatan Spiritual dalam Kepercayaan Hindu", "Dr. I Gusti Ayu Putu", 2018, 320, "Dharma Pustaka");
        Buku buku4 = new Buku("Wisdom of the Buddha: Teachings for a Mindful Life", "Bhikkhu Dhammapala", 2017, 270, "Dharma Wisdom Publications");
        Buku buku5 = new Buku("Hikayat Surga: Kehidupan Sehari-hari Menurut Kitab Suci", "Pdt. Samuel Wijaya", 2019, 300, "Sejati Publishing");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
    public void psikologi(){
        Buku buku1 = new Buku("Menggali Dalam Diri: Membongkar Lapisan Psikologi Manusia", "Dr. Anisa Rahmawati, M.Psi.", 2021, 280, "Psikologi Insight");
        Buku buku2 = new Buku("Cahaya Terapi: Pengembangan Diri melalui Psikoterapi Kognitif", "Prof. Dr. Budi Susanto", 2019, 320, "Pustaka Psikologi");
        Buku buku3 = new Buku("Misteri Kepribadian: Analisis Psikologi Klinis", "Dr. Retno Wulandari, M.Psi.", 2020, 250, "Kreatif Mind Books");
        Buku buku4 = new Buku("Psikologi Anak: Membimbing Tumbuh Kembang Sehat", "Prof. Dr. Faisal Rahman", 2018, 300, "Inti Pendidikan");
        Buku buku5 = new Buku("Terapi Keluarga: Solusi Psikologis dalam Dinamika Hubungan Keluarga", "Dr. Ratna Wijaya, M.Psi.", 2022, 260, "PsikoHarmoni Publications");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
    public void politik(){
        Buku buku1 = new Buku("Dinamika Politik Kontemporer: Tantangan dan Transformasi", "Prof. Dr. Hasan Basri", 2020, 350, "Politika Pintar");
        Buku buku2 = new Buku("Politik Identitas: Membongkar Keseimbangan Kekuasaan Global", "Dr. Siti Rahma", 2019, 280, "Politik Insight");
        Buku buku3 = new Buku("Demokrasi dalam Ujian: Refleksi Kritis terhadap Sistem Politik Modern", "Prof. Dr. Agus Setiawan", 2021, 320, "Demokratia Press");
        Buku buku4 = new Buku("Politik Ekonomi: Antara Kesejahteraan dan Ketidaksetaraan", "Dr. Rini Kusuma", 2018, 300, "Politik Publishing");
        Buku buku5 = new Buku("Populisme dalam Era Digital: Kekuasaan dan Tantangan Politik Modern", "Dr. Aditya Pratama", 2022, 270, "Digital Democracy Books");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
    public void fiksi(){
        Buku buku1 = new Buku("Mimpi di Balik Kabu", "Rani Utami", 2019, 320, "Khatulistiwa Fiction");
        Buku buku2 = new Buku("Dunia Tenggelam", "Indra Novian", 2021, 280, "Cita Cita Books");
        Buku buku3 = new Buku("Langit yang Hilang", "Ahmad Rifai", 2020, 250, "Imaji Novel");
        Buku buku4 = new Buku("Bunga-Bunga Terakhir", "Siti Aisyah", 2018, 300, "Imaji Pustaka");
        Buku buku5 = new Buku("Jejak Waktu", "Dimas Arya", 2022, 270, "Fantasi Press");
        Buku[] bukuArray = {buku1, buku2, buku3, buku4, buku5};
        kategori(bukuArray);
    }
}
