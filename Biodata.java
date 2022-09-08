import java.util.Scanner;
class Biodata{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        String nama,tl,jk,alamat,agama,hb,citacita,mt,idola;

        System.out.print("Masukkan nama anda :");
        nama = a.nextLine();
        System.out.print("masukkan tempat lahir anda :");
        tl = a.nextLine();
        System.out.print("masukan jenis kelamin anda :");
        jk = a.nextLine();
        System.out.print("masukkkan alamat anda :");
        alamat = a.nextLine();
        System.out.print("masukkan agama anda :");
        agama = a.nextLine();
        System.out.print("masukan hobi anda  :");
        hb= a.nextLine();
        System.out.print("masukkan cita cita anda :");
        citacita = a.nextLine();
        System.out.print("masukkan moto hidup anda :");
        mt = a.nextLine();
        System.out.print("masukkan idola anda :");
        idola = a.nextLine();
        

        System.out.println("Nama anda          :"+nama);
        System.out.println("Tempat lahir anda  :"+tl);
        System.out.println("Jenis kelamin anda :"+jk);
        System.out.println("Alamat anda        :"+alamat);
        System.out.println("Agama anda         :"+agama);
        System.out.println("Hobi anda          :"+hb);
        System.out.println("Cita cita anda     :"+citacita);
        System.out.println("Moto hidup anda    :"+mt);
        System.out.println("Idola anda         :"+idola);
        }

    }