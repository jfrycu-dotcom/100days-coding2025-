import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();
        System.out.println("");
        if(angka>=1){
            System.out.println("Angka "+angka+" bilangan positif ");
        }else if(angka<=-1){
            System.out.println("Angka "+angka+" bilangan negatif");
        }else{
            System.out.println("Angka "+angka+" adalah bilangan nol");
        }
    }
}
