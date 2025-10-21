import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas: ");
        int tugas = in.nextInt();
        System.out.print("Masukkan nilai ujian: ");
        int ujian = in.nextInt();
        
        int rata2 = (tugas+ujian)/2;
        System.out.println("Nilai rata-rata: "+rata2);
        
        if (rata2>=85) {
            if (ujian>80) {
                System.out.println("Predikat : A");
            }else{
                System.out.println("Predikat : B");
            }
        }else if (rata2>=75&&rata2<85) {
            if (ujian>70) {
                System.out.println("Predikat : B");
            }else {
                System.out.println("Predikat : C");
            }
        }else if (rata2>=65&&rata2<75) {
            if (ujian>60) {
                System.out.println("Predikat : C");
            }else {
                System.out.println("Predikat : D");
            }
        }else if (rata2>=50&&rata2<65) {
            if (ujian>50) {
                System.out.println("Predikat : D");
            }else {
                System.out.println("Predikat : E");
            }
        }else{
            System.out.println("Predikat : E");
        }
        
        
        
    }
}
