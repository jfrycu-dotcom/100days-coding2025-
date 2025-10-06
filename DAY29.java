package jeff_brokk;
import java.util.Scanner;
public class Jeff_brokk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tinggi Arul: ");
        double a = in.nextDouble();
        System.out.print("Masukkan tinggi jeff: ");
        double b = in.nextDouble();
        
        boolean c = a>b;
        boolean d = a<b;
        System.out.printf("Tinggi arul:%.2f %s",a," meter");
        System.out.printf("\nTinggi jefri:%.2f %s\n",b," meter");
        System.out.println("Apakah arul lebih tinggi daripada jefri?? : "+c);
        System.out.println("Apakah jefri lebih tinggi daripada arul?? : "+d);
    }
}
