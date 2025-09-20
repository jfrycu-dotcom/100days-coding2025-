package itulah;

import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judul = in.nextLine();
        System.out.print("Masukkan hargs buku: ");
        double harga = in.nextDouble();
        System.out.print("Masukkkan jumlah eksemplar: ");
        byte jumlah = in.nextByte();
        boolean operator = true;
        System.out.println();
        System.out.println("Buku berjudul "+judul+" dengan kode rak B Rp."+harga);
        System.out.println("Jumlah eksemplar yang tersedia adalah "+jumlah);
        System.out.println("Apaka tersedia versi e-book? "+operator);
    }
    
}
