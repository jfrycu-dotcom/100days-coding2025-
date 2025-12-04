import java.util.Scanner;
public class day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();
        int [] elemen = new int[n];
        int total = 0;
        System.out.print("Masukkan elemen Array: ");
        for(int anu : elemen){
            elemen [anu] = in.nextInt();
            total+=elemen[anu];
        }
        System.out.println("\ntotal: "+total);
    }
}
