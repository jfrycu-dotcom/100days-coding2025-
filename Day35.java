package Nurfika_D0225006;

import java.util.Scanner;

public class jeff_persiapan_UTS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai MTK: ");
        int mtk = in.nextInt();
        System.out.print("Masukkan nilai IPA: ");
        int ipa = in.nextInt();
        
        int rata = mtk+ipa/2;
        System.out.println("Nilai rata2nya: "+rata);
        if(rata>=75){
            System.out.println("LULUS");
        }else{
            System.out.println("TIDAK LULUS");
        }
        
    }
    
}
