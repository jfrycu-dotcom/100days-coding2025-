import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama mahasiswa: ");
        String nama = in.nextLine();
        int a,b,c,d;
        System.out.println("Nilai tugas: ");
        a = in.nextInt();
        System.out.println("Nilai kuis: ");
        b = in.nextInt();
        System.out.println("Nilai UTS: ");
        c = in.nextInt();
        System.out.println("Nilai UAS: ");
        d = in.nextInt();
        System.out.println();
        
        double akhir = (a*0.2)+(b*0.2)+(c*0.3)+(d*0.3);
        System.out.println("NAMA : "+nama);  
        System.out.println("Nilai akhir: "+akhir);
        if(akhir>=85&& akhir<=100){
            System.out.println("Grade: A");
        }else if(akhir>=70 && akhir<85){
            System.out.println("Grade: B");
        }else if(akhir>=55&&akhir<70){
            System.out.println("Grade: C");
        }else if(akhir>=40&&akhir<55){
            System.out.println("Grade: D");
        }else if(akhir<40){
            System.out.println("Grade: E");
        }else{
            System.out.println("Tidak valid");
        }if(akhir>=55&&akhir<=100){
        System.out.println("Status: LULUS");
        }else {
        System.out.println("Status: Tidak LULUS");
        }        
    }
}
