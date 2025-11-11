package javaapplication24;
import java.util.Scanner;
public class soal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();
        int total = 1;
        for (int i = n; i >= 1; i--) {
            System.out.print(i+" * ");
            total*=i;
        }System.out.println("\nHasil dari "+n+" faktorial adalah "+total);
    }
}
