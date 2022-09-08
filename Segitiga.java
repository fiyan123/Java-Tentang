import java.util.Scanner;
class Segitiga{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        int alas,tinggi,luas;

        System.out.print("Masukkan alas :");
        alas= a.nextInt();
        System.out.print("masukan tinggi :");
        tinggi = a.nextInt();

         luas =(alas * tinggi)/2 ;

        System.out.println("hasil luas : "+luas);
    }
}