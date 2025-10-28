package menu_coffee_shop;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nilai n: ");
        int n = in.nextInt();
        
        int gen = 0, gan = 0;
        int jum = 0;
        System.out.print("Deret "+n+" = ");
        for (int i = 1; i <= n; i++) {
            if(i%2==0) gen++;else gan++;
            jum+=i;
            System.out.print(i+" + ");
        }
        System.out.print("... = "+jum);
        System.out.println("\nJumlah bilangan ganjil: "+gan);
        System.out.println("Jumlah bilangan genap: "+gen);
        
        
        
        
    }
}
