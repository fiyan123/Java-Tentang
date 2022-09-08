import java.util.Scanner;
class latihan_for2{
    public static void main (String[]args){

    Scanner a = new Scanner(System.in);

    int b,i,h;
        
        System.out.println("=======================");
        System.out.println("BILANGAN GANJIL ");
        System.out.println("");
          System.out.print("MASUKKKAN BILANGAN :");
        b = a.nextInt();

        for(i=1; i <= b ; i+=2){

            System.out.println(+i+"");

           
        }
    }
}