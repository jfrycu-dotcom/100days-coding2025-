import java.util.Scanner;

public class BgJepDay12{  
    public static void main(String[] args) {
        Scanner ah = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = ah .nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = ah.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = ah.nextLine();
        System.out.print("Asal dari mana; ");
        String asal = ah.nextLine();
        System.out.print("Alumni dari mana: ");
        String alumni = ah.nextLine();
        System.out.println();
        System.out.println("Nama saya adalah "+nama);
        System.out.println("NIM saya "+nim);
        System.out.println("Saya kelas "+kelas);
        System.out.println("Saya berasal dari "+asal);
        System.out.println("Saya alumni dari "+alumni);
    }
    
}
