package Tugas03;
import java.util.Scanner;
public class MainHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero hero1 = new Hero();
        System.out.println("==================================\nSelamat datang dipertandingan hero\n==================================");
        System.out.println("Hero Battle\nPlayer 1 : Silakan masukkan hero Anda!\nMohon masukkan angka antara 1 hingga 500!\n=========================================");
        System.out.print("Nama Hero     : ");
        String namaHero1 = input.nextLine();
        Double healthPoint1, attackHero1, defenseHero1;
        do {
            System.out.print("Health Point  : ");
            healthPoint1 = input.nextDouble();
            System.out.print("Attack        : ");
            attackHero1 = input.nextDouble();
            System.out.print("Defense       : ");
            defenseHero1 = input.nextDouble();
            if (healthPoint1 < 1.0 || healthPoint1 > 500.0 || attackHero1 < 1.0 || attackHero1 > 500.0  || defenseHero1 < 1.0 || defenseHero1 > 500.0){
                System.out.println("Mohon masukkan angka antara 1 hingga 500!");
            }
        }while(healthPoint1 < 1.0 || healthPoint1 > 500.0 || attackHero1 < 1.0 || attackHero1 > 500.0  || defenseHero1 < 1.0 || defenseHero1 > 500.0);
        input.nextLine();
        hero1.setName(namaHero1);
        hero1.setHp(healthPoint1);
        hero1.setAttack(attackHero1);
        hero1.setDefense(defenseHero1);
        System.out.println();
        System.out.println("Hero Battle\nPlayer 2 : Silakan masukkan hero Anda!\nMohon masukkan angka antara 1 hingga 500!\n=========================================");
        System.out.print("Nama Hero     : ");
        String namaHero2 = input.nextLine();
        Double healthPoint2, attackHero2, defenseHero2;
        do {
            System.out.print("Health Point  : ");
            healthPoint2 = input.nextDouble();
            System.out.print("Attack        : ");
            attackHero2 = input.nextDouble();
            System.out.print("Defense       : ");
            defenseHero2 = input.nextDouble();
            if (healthPoint2 < 1.0 || healthPoint2 > 500.0 || attackHero2 < 1.0 || attackHero2 > 500.0 || defenseHero2 < 1.0 || defenseHero2 > 500.0){
                System.out.println("Mohon masukkan angka antara 1 hingga 500!");
            }
        }while(healthPoint2 < 1.0 || healthPoint2 > 500.0 || attackHero2 < 1.0 || attackHero2 > 500.0 || defenseHero2 < 1.0 || defenseHero2 > 500.0);
        Hero hero2 = new Hero(namaHero2, healthPoint2, attackHero2, defenseHero2);
        System.out.println("=========================================\n=========================================");
        boolean loop = true;
        int i = 0;
        while (loop){
            i++;
            System.out.println("Ronde " + i);
            System.out.println(hero1.getName() + " menyerang " + hero2.getName() +"\n");
            System.out.println(hero1.getName() + " menyerang sebesar " + hero1.getAttack() );
            System.out.println(hero2.getName() + " memiliki pertahanan sebesar " + hero2.getDefense());
            healthPoint2 = hero2.rumusHero(healthPoint2, attackHero1, defenseHero2);
            hero2.setHp(healthPoint2);
            if (healthPoint2 <= 0.0){
                hero2.setHp(0.0);
                System.out.println("Health " + hero2.getName() + " saat ini " + hero2.getHp() + "\n");
                loop = false;
            }
            else {
                System.out.println("Health " + hero2.getName() + " saat ini " + hero2.getHp() + "\n"); 
            }
            System.out.println(hero2.getName() + " menyerang " + hero1.getName() + "\n");
            System.out.println(hero2.getName() + " menyerang sebesar " + hero2.getAttack() );
            System.out.println(hero1.getName() + " memiliki pertahanan sebesar " + hero1.getDefense());
            healthPoint1 = hero1.rumusHero(healthPoint1, attackHero2, defenseHero1);
            hero1.setHp(healthPoint1);
            if (healthPoint1 <= 0.0){
                hero1.setHp(0.0);
                System.out.println("Health " + hero1.getName() + " saat ini " + hero1.getHp() + "\n");
                loop = false;
            }
            else {
                System.out.println("Health " + hero1.getName() + " saat ini " + hero1.getHp() + "\n");
                System.out.println("=========================================\n=========================================");
            }
            if (i >= 5 && hero1.getHp() != 0.0 && hero2.getHp() != 0.0){
                System.out.println("Pertandingan sudah mencapai batas ronde\n");
                break;
            }
        }
        System.out.println("Pertarungan telah selesai!");
        if(hero1.getHp() == 0.0 && hero2.getHp() != 0.0){
            System.out.println(hero1.getName() + " telah kalah!\n=========================================\n" + hero2.getName() + " adalah pemenangnya\n");

        }  
        else if (hero2.getHp() == 0.0 && hero1.getHp() != 0.0) {
            System.out.println(hero2.getName() + " telah kalah!\n=========================================\n" + hero1.getName() + " adalah pemenangnya\n");
        }
        else {
            System.out.println("Pertandingan Seri! Kedua hero sama kuat!");
        }
    }
}
