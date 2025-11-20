package jeff_krenn;

import java.util.Scanner;
// segitiga-kren, persegi panajang-kren, lingkaran-kren, persegi-kren, total dan rata rata-kren, swittch case
public class Jeff_krenn {
    public static void main(String[] args) {     
        Scanner in = new Scanner(System.in);
        while(true){    
        System.out.println("\n1. Luas segitiga\n2. Luas persegi panjang\n3. Luas lingkaran\n4. Luas persegi\n5. Total dan Rata-rata\n6. Faktorial angka\n7. Keluar");
        System.out.print("Masukkan pilihan: ");
        int pilih = in.nextInt();
        switch(pilih){
            case 1 ->{
                System.out.println("==Anda memilih menu luas segitiga==");
                System.out.print("Masukkan A: ");
                double a = in.nextDouble();
                System.out.print("Masukkan T: ");
                double t = in.nextDouble();
                System.out.println("Luas segitiga: "+luasS(a,t));
            }
            case 2->{
                System.out.println("==Anda memilih menu luas persegi panjang==");
                System.out.print("P: ");
                double p = in.nextDouble();
                System.out.print("L: ");
                double l = in.nextDouble();
                System.out.println("Hasil: "+luas(p,l));
            }
            case 3->{
                System.out.println("==Anda memilih menu luas Lingkaran==");
                System.out.print("Masukkan r: ");
                double a = in.nextDouble();
                System.out.println("Luas lingkaran: "+luasL(a));
            }case 4->{
                System.out.println("==Anda memilih menu luas persegi==");
                System.out.print("Masukkan sisi: ");
                int s = in.nextInt();
                System.out.println("Luas persegi: "+luasP(s));
            }
            case 5->{
                System.out.println("==Anda memilih menu Rata-rata dan total==");
                System.out.print("Masukkan angka: ");
                int a = in.nextInt();
                rt(a);
                
            }case 6 ->{
                System.out.println("+==Anda memilih menu Faktorial angka==");
                System.out.print("\nAngka fak: ");
                int b = in.nextInt();
                fak(b);
            }
            case 7->{
                System.out.println("==Anda memilih menu Keluar==");
                System.out.println("==TERIMAKASIH==");
                return;
            }
            default -> {
                System.out.println("==Pilihan Tidak Valid Masukan ulang (1-7)");
            }
        }
       }
    }
    static double luas(double p,double l){
        return p*l;
    }
    static void fak(int a){
        int tam = 1;
        for (int i = 1; i <= a; i++) {
            tam*=i;
        }
        System.out.println(tam);
    }
    static double luasP(double a){
        return a*a;
    }
    static double luasL(double r){
        return 3.14*r*r;
    }
    static double luasS(double a, double t){
        return 0.5*a*t;
    }
    static void rt(int a){
        int total=0;
        for (int i = 1; i <= a; i++) {
            total+=i;
        }
        System.out.println("Total: "+total);
        System.out.println("Rata-rata: "+total/a);
    }
}
