import java.util.Scanner;
class dowhile1{

    public static void main (String[]args){
    
    Scanner a = new Scanner(System.in);

    int i = 1,bil;
     
         System.out.print("Masukkan Angka :");
         bil = a.nextInt();

     do {
         System.out.println("hallo " +i);
         i++;
     }

        while ( i <= bil );

    }
}