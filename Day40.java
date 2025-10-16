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
            System.out.printf("Hasil penjumlahan: %.2f ",c);
        }else if (op.equals("-")) {
            c = a-b;
            System.out.printf("Hasil pengurangan: %.2f",c);
        }else if (op.equals("/")) {
            c = a/b;
            System.out.printf("Hasil pembagian: %.2f",c);
        }else if (op.equals("*")) {
            c = a*b;
            System.out.printf("Hasil perkalian: %.2f",c);
        }else if (op.equals("%")) {
            c = a%b;
            System.out.printf("Hasil modulus: %.2f",c);
        }else {
            System.out.println("TIDAK VALIDDD");
        }
        
    }
}
