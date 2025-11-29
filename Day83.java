import java.util.*;
public class Ilda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = new int [5];
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            total+=array[i];
        }
        System.out.println("Total: "+total);
    }
}
