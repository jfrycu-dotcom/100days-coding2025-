public clas kren{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n==PILIHAN MENU==");
            System.out.println("1. Nasi goreng\n2. Nasi campur\n3. Mie goreng\n4. Tidak jadi pesan");
            System.out.print("Masukkan pilihan: ");
            int pilihan = in.nextInt();
            switch(pilihan){
                case 1 ->{
                    System.out.println("\nAnda memilih Nasi goreng");
                }
                case 2 ->{
                    System.out.println("\nAnda memilih Nasi campur");
                }
                case 3->{
                    System.out.println("\nAnda memilih Mie goreng");
                }
                case 4 ->{
                    System.out.println("\nAnda tidak jadi memesan");
                    return;
                }
                default -> {
                    System.out.println("\nPilihan anda tidak ada dalam menu!");
                    System.out.println("Tolong pilih ulang!!");
                }
            }
        } while (true);
}
