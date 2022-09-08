import java.util.Scanner;
class Belanja{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        String nama_anda,nama_pesanan;
        int harga,jumlah,total_bayar,kembalian,bayar;

        System.out.println("==========Pesan Makanan=========");
        System.out.println("================================");

        System.out.print("Nama anda    :");
        nama_anda = a.nextLine();
        System.out.print("Nama pesanan :");
        nama_pesanan = a.nextLine();
        System.out.print("Harga        :");
        harga = a.nextInt();
        System.out.print("Jumlah       :");
        jumlah = a.nextInt();
        System.out.println("================================");

        total_bayar = jumlah * harga;
    
        System.out.println("Nama pemesan :"+nama_anda);
        System.out.println("Nama pesanan :"+nama_pesanan);
        System.out.println("harga        :"+harga);
        System.out.println("Jumlah       :"+jumlah);
        System.out.println("Total bayar  :"+total_bayar);

        System.out.println("===================================");
        System.out.print("bayar    :");
        bayar = a.nextInt();

        kembalian = bayar - total_bayar;
         System.out.println("Kembalian :"+kembalian);
    }
}