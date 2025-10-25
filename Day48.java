
import java.util.Scanner;

public class NewClass6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<==KALKULATOR SEDERHANA==>");
        System.out.print("angka 1\t\t: ");
        double a = in.nextDouble();
        System.out.print("operator\t: ");
        char op = in.next().charAt(0);
        System.out.print("angka 2\t\t: ");
        double b = in.nextDouble();
        if (op=='+'||op=='-'||op=='/'||op=='*'||op=='%') {
        double hasil = 0; 
        String anu = null;
        switch(op){
            case '+' ->{
                hasil = a+b;
                anu = " penjumlahan: ";
            }
            case '-' ->{
                hasil = a-b;
                anu = " pengurangan: ";
            }
            case '*' ->{
                hasil = a*b;
                anu = " perkalian: ";
            }
            case '/' ->{
                hasil = a/b;
                anu = " pembagian: ";
            }
            case '%' ->{
                hasil = a%b;
                anu = " Modulus: ";
            }
        }
            System.out.println("Hasil "+anu+hasil);
        }else   {
            System.out.println("TIDAK VALID JIRR!!");
        }
        
        
    }
    
}
