package Java8;

import java.util.Scanner;

public class DdpJava08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        if (!(a % 2 == 0)) {
            System.out.println("BILANGAN GANJIL");
        } else {
            System.out.println("Bilangan genap");
        }
    }
}
