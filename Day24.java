package belajarcoding;

import java.util.Scanner;

public class Aritmatika_jefff {
    public static void main(String[] args) {

        //DAY24 mencari luas lingkaran : phi*r*r
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan diameter : ");
        int d = in.nextInt();
        System.out.println();
        int r = d/2;
        double phi = 3.14;
        double luas = phi*r*r;
        System.out.println("diameternya adalah : "+d+" cm");
        System.out.println("Jari jarinya adalah :"+r+" cm");
        System.out.println("Jadi luas lingkaran adalah "+luas+" cm");
        
        
        
    }
    
}
