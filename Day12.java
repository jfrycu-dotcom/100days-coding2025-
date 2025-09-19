import java.util.Scanner;
public class Ai_soalJeff {
    public static void main(String[] args) {

//DAY 12 BROK
        
        //Scanner digunakan, supaya bisaki kasi masuk kayak 
        //teks atau angka di outputnya
        Scanner in = new Scanner(System.in);
        //String digunakan untuk teks aja
        System.out.print("Masukkan nama  : "); 
        String nama = in.nextLine();
        //byte digunakan untuk angka, tapi angka yang ditampungnya hanya sedikit
        System.out.print("Masukkan umur  : ");
        int umur = in.nextInt();
        System.out.print("Masukkan Tinggi: ");
        double tinggi = in.nextDouble();
        System.out.println();
        System.out.printf("Nama saya \t= %s \nUmur saya \t= %d tahun\nTinggi saya\t= %.1f cm\n",nama,umur,tinggi);
    
        
        
    }
    
}
