import java.util.Scanner;
class Input{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        String nama;

        System.out.print("Masukkan nama anda :");
        nama = a.nextLine();

        System.out.println("Nama anda :"+nama);
    }
}