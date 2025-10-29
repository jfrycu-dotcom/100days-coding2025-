import java.util.Scanner;

public class JumlahAngkaPositif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int total = 0;
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        while (angka >= 0) {
            total += angka;
            System.out.print("Masukkan angka: ");
            angka = in.nextInt();
        }

        System.out.println("\nTotal angka positif: " + total);
    }
}
