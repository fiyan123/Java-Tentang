import java.util.Scanner;
class diskon{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        String nama;
        int harga,total,Qty,total_harga,diskon;

        System.out.println("========== TOKO MAKMUR ABADI ========");
        System.out.println("====================================");

        System.out.print("Nama Barang   :");
        nama = a.nextLine();
        System.out.print("Harga         :");
        harga = a.nextInt();
        System.out.print("Qty           :");
        Qty= a.nextInt();
        System.out.println("====================================");

        System.out.println("NAMA BARANG   :"+nama);
        System.out.println("HARGA         :"+harga);
        System.out.println("Qty           :"+Qty);

        total = harga * Qty;
        System.out.println("TOTAL         :"+total);
        System.out.println("====================================");


        if(total >= 100000 && total < 200000){ 
            diskon = total * 30/100;
            System.out.println("Anda Mendapat diskon 30%   :"+diskon);
            total_harga = total - diskon;
            System.out.println("Total Harga                :"+total_harga);
        }
        else if (total >= 200000 && total <300000){
            diskon = total * 50/100;
            System.out.println("Anda Mendapat Diskon 50%   :"+diskon);
            total_harga = total - diskon;
            System.out.println("Total Harga                 :"+total_harga);
        }
        else if (total >= 300000 ){
            diskon = total * 70/100;
            System.out.println("Anda Mendapat Diskon 70%   :"+diskon);
            total_harga = total - diskon;
            System.out.println("Total Harga                :"+total_harga);
        }
        else 
        System.out.println("Anda Tidak Dapat Diskon");
    }
}
        
        