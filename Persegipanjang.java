import java.util.Scanner;
class Persegipanjang{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        int panjang,lebar,luas;

        System.out.print("Masukkan panjang :");
        panjang= a.nextInt();
        System.out.print("masukan lebar:");
        lebar= a.nextInt();

         luas = panjang * lebar;

        System.out.println("hasil luas : "+luas);
    }
}