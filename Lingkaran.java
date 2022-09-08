import java.util.Scanner;
class Lingkaran{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);
        double phi = 3.14,r,luas;
         

        System.out.print("Masukkan phi :");
        phi= a.nextDouble();
        System.out.print("masukan jarijari:");
        r = a.nextDouble();

         luas = phi * r * r;

        System.out.println("hasil luas : " +luas);
    }
}