import java.util.Scanner;
class Persegi{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);

        int sisi1,sisi2,luas;

        System.out.print("Masukkan sisi1 :");
        sisi1= a.nextInt();
        System.out.print("masukan sisi2:");
        sisi2= a.nextInt();

         luas =sisi1 * sisi2 ;

        System.out.println("hasil luas : "+luas);
    }
}