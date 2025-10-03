import java.util.Scanner;
public class jef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        a += 7;
        System.out.println(a);  
        a -= 7;
        System.out.println(a);  
        a *= 7;
        System.out.println(a);  
        a /= 7;
        System.out.println(a);  
        a %= 7;
        System.out.println(a);  
        a = 7;
        System.out.println(a);  
    }
    
}
