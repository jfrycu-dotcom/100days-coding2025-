package rizaldi1;

import java.util.Scanner;


public class BantaiARRAY {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
            
        }
        for (int i = 1; i <= angka; i++) {
            if (i%2==0) {
                System.out.print("angka genap pertama: "+i+"\n");
                break;
            }
        }
        for (int i = angka; i >= 1; i--) {
            if (i%2==0) {
                System.out.print("angka genap terakhir: "+i+"\n");
                break;
            }
        }
    }
}
