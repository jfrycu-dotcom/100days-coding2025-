package Java8;

import java.util.Scanner;


public class DdpJava08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka A\t: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka B\t: ");
        int b = in.nextInt();
        boolean perbandingan = a >= b;
        boolean lagi = a<=b;
        System.out.println("apakah si A lebih besar dari B?? "+perbandingan);
        System.out.println("apakah si B lebih kicik dari B?? "+lagi);
    }
}
