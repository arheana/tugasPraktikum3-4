import java.util.Scanner;

public class mainBattle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Permainan adu hero\n Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("====================================");
        System.out.print("Nama Hero 1   : ");
        String name1 = input.nextLine();
        System.out.print("Hitpoint      : ");
        double hitPoint1 = input.nextDouble();
        System.out.print("Attack        : "); 
        double attack1 = input.nextDouble(); 
        System.out.print("Defense       : " );
        double defense1 = input.nextDouble();
        Hero hero1 = new Hero(name1, hitPoint1, attack1, defense1);

        Hero hero2 = new Hero();
        System.out.println("====================================");
        System.out.print("Nama Hero 2   : ");
        String name2 = input.next();
        hero2.setName(name2);
        System.out.print("Hitpoint      : ");
        double hitPoint2 = input.nextDouble();
        hero2.setHitPoint(hitPoint2);
        System.out.print("Attack        : "); 
        double attack2 = input.nextDouble();
        hero2.setAttack(attack2);
        System.out.print("Defense       : " );
        double defense2 = input.nextDouble();
        hero2.setDefense(defense2);

        int i = 1;
        while (hero1.getHitPoint() > 0 && hero2.getHitPoint() > 0) {
            System.out.println("=====================================");
            System.out.println("Ronde ke-" + i++);
            hero1.fight(hero2);
            if (hero2.getHitPoint() > 0) {
                hero2.fight(hero1);
            }
        }
        
        if (hero1.getHitPoint()<=0) {
            akhir(hero2.getName());
        } 
        else {
            akhir(hero1.getName());
        }
    }
    public static void  akhir (String nama) {
            System.out.println(nama + " memenangkan pertandingan");
            System.out.println("Pertandingan telah selesai");
            System.out.println();
    }
        
}

