import java.util.*;
public class JEFF_TESSS_DDP {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String user, pw;
        String user1 = "M_JEFRI_KREN";
        String pw1 = "18-10-2007cell";
        
        do{
            System.out.print("Masukkan username: ");
            user = in.nextLine();
            System.out.print("Masukkan password: ");
            pw = in.nextLine();
            
            if (user.equals(user1)&&pw.equals(pw1)) {
                System.out.println("\nLOGIN BERHASIL");
                break;
            }else{
                if (!user.equals(user1)) {
                    System.out.println("\nUsername salah!\nLogin ulang");
                }else{
                    System.out.println("\nPassword salah!\nLogin ulang");
                }
            }
        }while (true);
   }
}
