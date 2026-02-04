
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int angka = in.nextInt();
        System.out.println( angka%2==0 
        ? angka + " adalah bilangan genap"
        : angka + " adalah bilangan ganjil");
        
    }
}
