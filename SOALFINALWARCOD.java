// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        int a = in.nextInt();
        
        double jumdis = 0;
        double dis = 0;
        if(a>=100000){
            jumdis = a*0.1;
            dis = a - (a*0.1);
        }else {
            jumdis = 0;
            dis = a;
        }
        System.out.println("Jumlah diskon: "+(int)jumdis);
        System.out.println((int)dis);
    }
}
