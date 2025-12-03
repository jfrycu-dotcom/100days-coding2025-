package soalArray;

import java.util.Arrays;
import java.util.Scanner;

public class soalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String [] nama = new String [3];
        
        for (int i = 0; i < nama.length; i++) {
            nama [i] = in.nextLine();
        }
        String cari = in.nextLine();
        String anu = "";
        int deks = -1;
        for (int i = 0; i < nama.length; i++) {
            if (cari.contains(nama[i])) {
                anu = nama[i];
                deks = i;
            }
        }if (deks>0) {
            System.out.println(cari+" ditemukan pada indeks "+deks);
        }else{
            System.out.println("Nama tidak ada dalam array!");
        }
        
    }
}
