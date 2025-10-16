package main;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double a = in.nextDouble();
        in.nextLine();
        System.out.print("Masukkan operator(+,-,/,*,%): ");
        String op = in.nextLine();
        System.out.print("Masukkan angka kedua: ");
        double b = in.nextDouble();
        
        double c = 0;
        if(op.equals("+")){
            c = a+b;
            System.out.printf("Hasil penjumlahan: %.0f ",c);
        }else if (op.equals("-")) {
            c = a-b;
            System.out.printf("Hasil pengurangan: %.0f",c);
        }else if (op.equals("/")) {
            c = a/b;
            System.out.printf("Hasil pembagian: %.0f",c);
        }else if (op.equals("*")) {
            c = a*b;
            System.out.printf("Hasil perkalian: %.0f",c);
        }else if (op.equals("%")) {
            c = a%b;
            System.out.printf("Hasil modulus: %.0f",c);
        }
        
    }
}
