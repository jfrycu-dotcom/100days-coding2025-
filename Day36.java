import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai UTS ddp : ");
        int uts = in.nextInt();
        System.out.print("Nilai UAS ddp : ");
        int uas = in.nextInt();
        
        int rata2 = (uts+uas)/2;
        System.out.println("Nilai rata-rata DDP: "+rata2);
        if(rata2>=75){
            System.out.println("Kategori: LULUS");
            if(uts>uas){
                System.out.println("but Nilai uts lebih tinggi");
            }else if(uas>uts){
                System.out.println("but Nilai uas lebih tinggi");
            }else{
                System.out.println("but Nilai UTS dan UAS sama besar");
            }
        }else{
            System.out.println("TIDAK LULUS");
        }
    }
}
