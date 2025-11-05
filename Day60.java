import java.util.Arrays;
import java.util.Scanner;
public class BantaiARRAY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = in.nextInt();
        System.out.println("<==Sebelum reverse==>");
        System.out.print("Angka Genap: ");
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.print("\nAngka Ganjil: ");
        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                System.out.print(i+" ");
            }
        }System.out.println();
        System.out.println("<==Setelah reverse==>");
        System.out.print("Angka Ganjil: ");
        for (int i = n; i >= 1; i--) {
            if (i%2==0) {
                continue;
            }
                System.out.print(i+" ");
        }
        System.out.print("\nAngka Genap: ");
        for (int i = n; i >= 1; i--) {
            if (i%2!=0) {
                continue;
            }
                System.out.print(i+" ");
        }System.out.println();
    }
}
