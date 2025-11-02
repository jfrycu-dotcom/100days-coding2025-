import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        System.out.println("\n====TABEL PERKALIAN("+angka+")====\n");
        for (int i = 1; i <= angka; i++){
            for (int j = 1; j <= angka; j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
