import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====Menu Atap green====");
        System.out.println("1. Ekspreso ");
        System.out.println("2. Amerikani");
        System.out.println("3. Hutzelnut latte");
        System.out.println("4. Matcha latte");
        System.out.print("Masukkan pilihan(1-4): ");
        byte pesanan = in.nextByte();
        System.out.println("");
        int harga1, harga2, harga3, harga4;
        harga1 = 15000;
        harga2 = 20000;
        harga3 = 35000;
        harga4 = 22000;
        if(pesanan==1){
            System.out.println("Pesanan anda Ekspreso ");
            System.out.println("Harga pesanan anda: "+harga1);
        }else if(pesanan == 2){
            System.out.println("Pesanan anda Amerikani");
            System.out.println("Harga pesanan anda: "+harga2);
        }else if(pesanan == 3){
            System.out.println("Pesanan anda Hutzelnut latte");
            System.out.println("Harga pesanan anda: "+harga3);
        }else if(pesanan==4){
            System.out.println("Pesanan anda Matcha latte");
            System.out.println("Harga pesanan anda: "+harga4);
        }else{
            System.out.println("MOHON MAAF Pesanan anda tidak valid");
        }
    }
}
