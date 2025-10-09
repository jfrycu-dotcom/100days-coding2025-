package jeff_brokk;

import java.util.Scanner;

public class Jeff_brokk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Masukkan angka pertama: ");
        int angka = in.nextInt();
        System.out.print(" Masukkan angka kedua : ");
        int angka2 = in.nextInt();

        if (angka > 10 || angka2 > 10) {
            System.out.println("ada angka yang lebih besar dari 10");
        }else if (angka<=10 || angka2 <= 10){
            System.out.println("semua dibawah atau sama dengan 10");}

    }
}
