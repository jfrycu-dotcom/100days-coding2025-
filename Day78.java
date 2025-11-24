
import java.util.*;
public class NewClass {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan kata: ");
        String anu = in.nextLine();
        String anu1 = anu.toUpperCase();
        String anu2 = anu.toLowerCase();
        if (anu.contains("j")) {
            System.out.println(anu1);
            System.out.println(anu.replace("j", "p"));
        }else if (anu.contains("celsi")) {
            System.out.println(anu2);
            System.out.println(anu.substring(3
        }
        if (anu.equalsIgnoreCase("Jefri")) {
                System.out.println("satu kata dan ini namaku jirr!!!");
        }else{
            System.out.println(anu.trim());
        }
  }  
}
