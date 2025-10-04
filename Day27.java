package jefff;

import java.util.Scanner;

public class Jefff {
    public static void main(String[] args) {
        
//Soal evaluasi
        Scanner in = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = in.nextLine();
        System.out.print("Umur: ");
        int umur = in.nextInt();
        
        System.out.println("Halo, nama saya "+nama);
        System.out.print("Umur saya "+umur+" tahun");
        System.out.printf("\nDalam 5 tahun lagi umur saya adalah %d %s",(umur+5),"tahun \n");
        
        
    }
    
}
