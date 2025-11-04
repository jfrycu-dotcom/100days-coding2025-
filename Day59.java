package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka\t: ");
        int angka = in.nextInt();
        System.out.print("Angka genap\t: ");
        for (int i = 0; i <= angka; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nAngka ganjil\t: ");
        for (int i = 0; i <= angka; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
