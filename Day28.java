package belajarcoding;
import java.util.Scanner;
public class BelajarCoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nama1 : ");
        String nama1 = in.nextLine();
        System.out.print("nama2 : ");
        String nama2 = in.nextLine();
        System.out.println("anu "+(nama1==nama2));
        System.out.println("anu "+(nama1!=nama2));
    }
}
