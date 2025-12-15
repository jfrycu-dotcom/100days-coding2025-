package perbaikanddp;
import java.util.Scanner;
public class Perbaikanddp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N  : ");
        int a = in.nextInt();int b =0;
        System.out.print("Deret Bilangan Prima Sebanyak "+a+" : "+"\n" );
        for (int i = 2; b < a;) {
            boolean c = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    c=false;break;}
            }
            if(c){
                System.out.print(i+" ");
                b++;
            }
            i++;
        }
        System.out.println("");
    }
}
