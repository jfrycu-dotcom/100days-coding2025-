import java.util.*;
public class gua_jeff {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan nama: ");
        String nama = in.nextLine();
        System.out.println("Length: " + nama.length());
        System.out.println("toUppercase: " + nama.toUpperCase());
        System.out.println("toLowercase: " + nama.toLowerCase());
    }
}
