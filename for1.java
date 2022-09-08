import java.util.Scanner;
class for1{
    public static void main (String[]args){

    Scanner a = new Scanner(System.in);

    int i,p;

        System.out.print("Masukkan Pengulangan :");
        p = a.nextInt();

        for(i=1; i <= p; i++){
            System.out.println("hello world " +i);
        }
    }
}