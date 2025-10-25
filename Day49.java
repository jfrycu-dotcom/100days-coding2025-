
import java.util.Scanner;


public class NewClass11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama\t: ");
        String nama = in.nextLine();
        System.out.print("Nilai akhir\t: ");
        double nilai = in.nextDouble();
        System.out.print("Kehadiran \t: ");
        double hadir = in.nextDouble();
        
        String ketentuan = (nilai>=75 && hadir>=80) ? "LULUS" : "TIDAK LULUS";
        
        String grade = "";
        if (nilai>90) {
            grade = "A";
        } 
        else if (nilai>80&&nilai<=90) {
            grade = "B";
        } 
        else if (nilai>70&&nilai<=80) {
            grade = "C";
        } 
        else if (nilai>60&&nilai<=70) {
            grade = "D";
        } 
        else {
            grade = "E";
        }
        System.out.println("\nNama\t\t: "+nama);
        System.out.println("Nilai\t\t: "+(int)nilai);
        System.out.println("Kehadiran\t: "+(int)hadir+"%");
        System.out.println("Status\t\t: "+ketentuan);
        System.out.println("grade \t\t: "+grade);

    }
}
