package menu_coffee_shop;

import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total gaji: ");
        int gaji = in.nextInt();
        System.out.print("Masukkan lama kerja: ");
        int lama = in.nextInt();
        System.out.print("Jumlah anak: ");
        int anak = in.nextInt();
        System.out.println();
        
        double bonus = 0.10;
        double tun1 = 0.05;
        double tun2 = 0.10;
        double pajak = 0.02;
        double potbon = gaji*bonus;
        double pottun1 = gaji*tun1;
        double pottun2 = gaji*tun2;
        double potpaj = gaji*pajak;
        
        System.out.println("Gaji pokok\t: Rp."+gaji);
        System.out.println("Lama kerja \t: "+lama+" tahun");
        double totgaj1 = 0;
        if (lama>=5 && anak==1 || anak==2){
            System.out.println("Dapat bonus 10% dan tunjangan 5%");
            totgaj1 = gaji+potbon+pottun1-potpaj;
        }else if (lama>=5 && anak>=3) {
            totgaj1 = gaji+potbon+pottun2-potpaj;
            System.out.println("Dapat bonus 10% dan tunjangan 10% serta potong pajak 2%");
        }else if (lama>=5) {
            totgaj1 = gaji+potbon;
            System.out.println("Dapat bonus 10%");
        }else if (anak==1 || anak==2) {
            totgaj1 = gaji+pottun1-potpaj;
            System.out.println("Dapat bunus 5%");
        }else if (anak>=3) {
            totgaj1 = gaji+pottun2-potpaj;
        }else{
            System.out.println("Tidak dapat bonus dan tunjangan");
        }
        System.out.println("Gaji bersih\t: "+totgaj1);
        
    }
}
