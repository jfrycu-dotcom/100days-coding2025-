package javaapplication24;
import java.util.Scanner;
public class soal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int m = in.nextInt();
        System.out.print("Masukkan pangkat: ");
        int n = in.nextInt();
        int hasil= 1;
        System.out.print("\nHasil dari "+m+"^"+n+": ");
        for (int i = 1; i < n; i++) {
            hasil = m*=m;
        }System.out.print(hasil);
    }
}
