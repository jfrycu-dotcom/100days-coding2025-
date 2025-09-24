package dari_senior;

import java.util.Scanner;
public class nonSc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama\t: ");
        int angka1 = in.nextInt();
        System.out.print("Masukkan angka kedua\t: ");
        int angka2 = in.nextInt();
        System.out.println();
        System.out.println("Hasil sisa bagi/modulus adalah: "+angka1%angka2);
    }
        
    
}
