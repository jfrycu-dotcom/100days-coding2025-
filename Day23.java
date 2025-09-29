package belajarcoding;

import java.util.Scanner;

public class Aritmatika_jefff {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = in.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = in.nextInt();
        System.out.println();
        
        int luas = panjang*lebar;
        
        System.out.println("Panjangnya adalah : "+panjang+" cm");
        System.out.println("lebarnya adalah : "+lebar+" cm");
        System.out.println("Jadi luas persegi panjang adalah: "+luas+" cm");
    }
    
}
