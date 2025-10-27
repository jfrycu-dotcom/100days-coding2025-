import java.util.Scanner;
public class NewClass14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        
        String anu = (angka%2==0)? "Genap": "Ganjil";
        System.out.println("Angka "+angka+" adalah bilangan "+anu);
    }
}
