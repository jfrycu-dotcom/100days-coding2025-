import java.util.Scanner;
public class Ai_soalJeff {
    public static void main(String[] args) {
//DAY 12 BROK
        
        //Scanner digunakan, supaya bisaki kasi masuk kayak 
        //teks atau angka di outputnya
        Scanner in = new Scanner(System.in);
        //String digunakan untuk teks aja
        System.out.print("Masukkan nama: "); 
        String nama = in.nextLine();
        //byte digunakan untuk angka, tapi angka yang ditampungnya hanya sedikit
        System.out.print("Masukkan umur: ");
        byte umur = in.nextByte();
        System.out.print("Masukkan Tinggi: ");
        double tinggi = in.nextDouble();
        System.out.println();
        System.out.println("Nama saya adalah = "+nama);
        System.out.print("Umur saya adalah = "+umur+" tahun");
        System.out.printf("\nTinggi saya adalah = "+tinggi+" sentimeter\n");     
    }
    
}
