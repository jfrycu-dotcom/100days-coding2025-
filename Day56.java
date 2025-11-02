import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int total = 0;
      int angka;
      do {
         System.out.print("Masukkan angka (0 berhentikan program): ");
         angka = in.nextInt();
         total+=angka;
      }while (angka!=0);
      System.out.println("Jumlah total imputan: "+total);

    }
}
