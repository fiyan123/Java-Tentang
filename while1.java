import java.util.Scanner;
class while1{

    public static void main (String[]args){
    
    Scanner a =new Scanner(System.in);

    int i = 0,p; 

         System.out.print("Masukkan Bilangan :");
         p = a.nextInt();

        while ( i <= p ){

            System.out.println("hallo "  +i);

            i++;
        }
    }
}