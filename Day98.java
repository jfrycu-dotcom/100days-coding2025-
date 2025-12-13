package kren;
import java.util.*;
public class main{
    public static void main(String [] args){
        //deret fibonacci
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1, i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            b = a+b;
            a = b-a;
            i++;
        }
    }
}
