package belajarcoding;
import java.util.Scanner;
public class BelajarCoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nama1 : ");
        int nama1 = in.nextInt();
        System.out.print("nama2 : ");
        int nama2 = in.nextInt();
        System.out.println("anu "+(nama1==nama2));
        System.out.println("anu "+(nama1!=nama2));
    }
}
