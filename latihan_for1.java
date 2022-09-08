import java.util.Scanner;
class latihan_for1{
    public static void main (String[]args){

    Scanner a = new Scanner(System.in);

    int b,i,h;
        
        System.out.println("==========================================");
        System.out.println("PENGURUTAN BILANGAN TERBESAR DAN TERKECIL ");
          System.out.print("MASUKKKAN BILANGAN :");
        b = a.nextInt();

        for(i=b; i >= 1; i--){
        
            System.out.println(i);
            
        }
    }
}