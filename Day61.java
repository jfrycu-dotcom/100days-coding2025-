package javaapplication24;
import java.util.Scanner;
public class soal03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();
        System.out.print("Masukkan nilai M: ");
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%m==0) {
                System.out.print(i+" ");
            }
        }
    }
}
