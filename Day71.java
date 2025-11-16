
package menu_coffee_shop;

import java.util.Scanner;

public class NewClass7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
