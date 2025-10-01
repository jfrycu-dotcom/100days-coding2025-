package latihan;

import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka1: ");
        int angka1 = in.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = in.nextInt();
        System.out.println();
        angka1++;
        angka2--;
        System.out.println("Nilai increment: "+angka1);
        System.out.println("Nilai decrement: "+angka2);
        
        
    }
 
}
