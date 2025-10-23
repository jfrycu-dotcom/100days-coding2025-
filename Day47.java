import java.util.Scanner;


public class NewClass3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan hari (1-7): ");
        int pilihan = in.nextInt();
        
        switch(pilihan){
            case 1-> System.out.println("===Hari pertama adalah hari Minggu===");
            case 2-> System.out.println("===Hari kedua adalah hari Senin===");
            case 3-> System.out.println("===Hari ketiga adalah hari Selasa===");
            case 4-> System.out.println("===Hari keempat adalah hari Rabu===");
            case 5-> System.out.println("===Hari kelima adalah hari Kamis===");
            case 6-> System.out.println("===Hari keenam adalah hari Jumat===");
            case 7-> System.out.println("===Hari ketujuh adalah hari Sabtu===");
            default->System.out.println("===HARI APAMO ITINGO===");
        }
    }
}
