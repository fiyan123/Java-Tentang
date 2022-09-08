import java.util.Scanner;
class for2{
    public static void main (String[]args){

    Scanner a = new Scanner(System.in);
    
    int i,p,hasil;

        System.out.print("Masukkan Perkalian :");
        p = a.nextInt();

        for(i=1; i <=10; i++){
            hasil = i * p;
            System.out.println(i+" x "+p+" = "+hasil);
        }
    }
}