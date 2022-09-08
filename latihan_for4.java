import java.util.Scanner;
class latihan_for4{
    public static void main (String[]args){

    Scanner a = new Scanner(System.in);

    int b,i,j;
        
        System.out.println("==========================================");
        System.out.println("PENGURUTAN BINTANG TERBESAR KE TERKECIL");
        System.out.println("-------------------------------------------");
          System.out.print("MASUKKKAN BINTANG :");
          b = a.nextInt();

        for(i=b; i >= 1; i--){

            for(j=1; j<=i; j++){
               System.out.print("*");
           }
        
            System.out.println();
            
        }
    }
}