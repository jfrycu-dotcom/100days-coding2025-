
import java.util.Scanner;


public class NewClass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nomor undian undian(1-3): ");
        int pilihan = in.nextInt();
        
        switch(pilihan){
            case 1 :
                System.out.println("===Selamat anda mendapat motor===");
                break;
            case 2 : 
                System.out.println("===Selamat anda mendapat mobil===");
                break;
            case 3 :
                System.out.println("Selamat anda mendapat sakitnya aja padahal udah effort(ddp)");
                break;
            default : 
                System.out.println("===Hahaha kasian dapat ampasss===");
                break;
        }
    }
}
