import java.util.Scanner;
class latihan_case2{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);
        String pilih,nama,ttl,jk,kelas,semester;
        System.out.println("===========================");
        System.out.println("1.SD");
        System.out.println("2.SMP");
        System.out.println("3.SMK");
        System.out.println("4.KULIAH");
        System.out.println("");
         System.out.print("PILIH DERAJAT PENDIDIKANMU  :");
         pilih = a.nextLine();

         switch(pilih){
             case "sd":
              System.out.println("");
             System.out.println("PENDIDIKAN ANDA SEKARANG SD");
             System.out.print("Nama           :");
             nama = a.nextLine();
             System.out.print("TTL            :");
             ttl = a.nextLine();
             System.out.print("JENIS KELAMIN  :");
             jk= a.nextLine();
             System.out.print("KELAS          :");
             kelas = a.nextLine();
             System.out.println("");
             System.out.println("NAMA ANDA         :"+nama);
             System.out.println("TTL               :"+ttl);
             System.out.println("JENIS KELAMIN     :"+jk);
             System.out.println("KELAS             :"+kelas);
             break;

             case "smp":
              System.out.println("");
             System.out.println("PENDIDIKAN ANDA SEKARANG SMP");
             System.out.print("Nama           :");
             nama = a.nextLine();
             System.out.print("TTL            :");
             ttl = a.nextLine();
             System.out.print("JENIS KELAMIN  :");
             jk= a.nextLine();
             System.out.print("KELAS          :");
             kelas = a.nextLine();
             System.out.println("");
             System.out.println("NAMA ANDA         :"+nama);
             System.out.println("TTL               :"+ttl);
             System.out.println("JENIS KELAMIN     :"+jk);
             System.out.println("KELAS             :"+kelas);
             break;
            
            case "smk":
            System.out.println("");
            System.out.println("PENDIDIKAN ANDA SEKARANG SMK");
             System.out.print("Nama           :");
             nama = a.nextLine();
             System.out.print("TTL            :");
             ttl = a.nextLine();
             System.out.print("JENIS KELAMIN  :");
             jk= a.nextLine();
             System.out.print("KELAS          :");
             kelas = a.nextLine();
             System.out.println("");
             System.out.println("NAMA ANDA         :"+nama);
             System.out.println("TTL               :"+ttl);
             System.out.println("JENIS KELAMIN     :"+jk);
             System.out.println("KELAS             :"+kelas);
             break;
             
             case "kuliah":
             System.out.println("");
            System.out.println("PENDIDIKAN ANDA SEKARANG KULIAH");
             System.out.print("Nama           :");
             nama = a.nextLine();
             System.out.print("TTL            :");
             ttl = a.nextLine();
             System.out.print("JENIS KELAMIN  :");
             jk= a.nextLine();
             System.out.print("SEMESTER       :");
             semester= a.nextLine();
             System.out.println("");
             System.out.println("NAMA ANDA         :"+nama);
             System.out.println("TTL               :"+ttl);
             System.out.println("JENIS KELAMIN     :"+jk);
             System.out.println("SEMESTER          :"+semester);
             break;

             default:
             System.out.println("ANDA BELUM ADA PENDIDIKAN");

         }

    }
}