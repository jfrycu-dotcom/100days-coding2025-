// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(n(2,2));
        System.out.println(nn(2,2));
        System.out.println(nnn(2,2));
        System.out.println(nnnn(2,2));
    }static int n(int a, int b){
        return a+b;
    }static int nn(int a, int b){
        return a-b;
    }static int nnn(int a, int b){
        return a/b;
    }static int nnnn(int a, int b){
        return a*b;
    }
}
