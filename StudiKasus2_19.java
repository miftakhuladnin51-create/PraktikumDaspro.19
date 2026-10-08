import java.util.Scanner;

public class StudiKasus2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.println("Selamat datang, " + nama + "!");

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
          
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat juara : ");
            int peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
           
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Selamat, Anda berhak menerima dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dana penghargaan tidak diberikan karena belum berhasil meraih Juara 1, 2, atau 3.");
            }
} else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
  
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPendanaan = sc.nextInt();

            
            if (statusPendanaan == 1) {
             
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Selamat, tim Anda berhak menerima dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Dana penghargaan tidak diberikan karena tim tidak lolos pendanaan PKM.");
            }

        } else {
   
            System.out.println("Status : Kegiatan jenis Lainnya tidak memperoleh dana penghargaan.");
        }

        sc.close();
    }
}