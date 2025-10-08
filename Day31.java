package Java8;

import java.util.Scanner;


public class DdpJava08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = in.nextInt();
        
        boolean c = a>=b&&b<=a;
        boolean d = a<=b&&b>=a;
        System.out.println("apakah si a besar dari b dan si b lebih kecil dari a?? "+c);
        System.out.println("dan apakah si a kecil dari si b dan si b besar dari si a?? "+d);
    }
}
