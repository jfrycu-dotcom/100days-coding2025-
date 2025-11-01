import java.util.Scanner;

public class NewClass7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jenis pelanggan(1,2,3): ");
        int jenis = in.nextInt();
        if ((jenis==1||jenis==2||jenis==3)) {
        System.out.print("Masukkan pemakaian listrik(kWh): ");
        int kwh = in.nextInt();
        int tarif = 0;
        int tetap = 0;
        String jenis1 = null;
        if (jenis == 1) {
            if (kwh > 0 && kwh <= 100) {
                tarif = 1500;
            } else if (kwh > 100 && kwh <= 300) {
                tarif = 2000;
            } else if (kwh > 300 && kwh <= 500) {
                tarif = 2500;
            } else if (kwh > 500) {
                tarif = 3000;
            }
            jenis1 = "Rumah tangga";
        } else if (jenis == 2) {
            if (kwh > 0 && kwh <= 100) {
                tarif = 2000;
            } else if (kwh > 100 && kwh <= 300) {
                tarif = 2500;
            } else if (kwh > 300 && kwh <= 500) {
                tarif = 3000;
            } else if (kwh > 500) {
                tarif = 3500;
            }
            jenis1 = "Bisnis";
        } else if (jenis == 3) {
            if (kwh > 0 && kwh <= 100) {
                tarif = 2500;
            } else if (kwh > 100 && kwh <= 300) {
                tarif = 3000;
            } else if (kwh > 300 && kwh <= 500) {
                tarif = 3500;
            } else if (kwh > 500) {
                tarif = 4000;
            }
            jenis1 = "Industri";
        }
        if (jenis == 1) {
            tetap = 20000;
        } else if (jenis == 2) {
            tetap = 35000;
        } else if (jenis == 3) {
            tetap = 50000;
        }
        int total = (tarif * kwh) + tetap;
        System.out.println("Jenis pelanggan: " + jenis1);
        System.out.println("Tarif per(kwh): " + tarif);
        System.out.println("Biaya tetap : " + tetap);
        System.out.println("Total tagihan listrik: " + total);
        }
        else{
            System.err.println("\nPELANGGAN APAMO ITINGO (jari tengah!!!)");
        }
    }
}
