import java.util.*;
public class gua_jeff {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan sembarang: ");
        String kata = in.nextLine();
        if (kata.equals("HEBAT")) System.out.println("equals: Aku hebat");
        if (kata.equalsIgnoreCase("hebat")) System.out.println("equalsIgnoreCase: Aku tidak hebat");
        if (kata.contains("hebat"))System.out.println("contains: Benar2 hebat");
        if (kata.isEmpty()) System.out.println("isEmpty: KOSONG");
   }
}
