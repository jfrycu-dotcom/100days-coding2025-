
import java.util.Scanner;
public class NewClass16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jam = in.nextInt();
        int lama = in.nextInt();
        int hasil = jam+lama;
        switch(hasil){
            case 13-> System.out.println("1 malam");
            case 14-> System.out.println("2 malam");
            case 15-> System.out.println("3 malam");
            case 16-> System.out.println("4 malam");
            case 17-> System.out.println("5 malam");
            case 18-> System.out.println("6 malam");
            case 19-> System.out.println("7 malam");
            case 20-> System.out.println("8 malam");
            case 21-> System.out.println("9 malam");
            case 22-> System.out.println("10 malam");
            case 23-> System.out.println("11 malam");
            case 24-> System.out.println("00");
            default -> System.out.println(hasil);
        }
        // jam digital;
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (a+b)%24;
        System.out.println(c);
    }
}      
