import java.util.Scanner;
public class cetak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int angka = in.nextInt();
        //untuk memunculkan bilangan ganjil saja
        for (int i = 1; i <= angka; i++) {
            if(i%2==0)continue;
            System.out.println(i);
        }
    }
}
