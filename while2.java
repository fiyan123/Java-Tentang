import java.util.Scanner;
class while2{

    public static void main (String[]args){
    
    Scanner a =new Scanner(System.in);
    
    boolean running = true;
    int counter = 0;
    String jawab;

        

        while ( running ){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");
            jawab = a.nextLine();

            if (jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            

            counter++;
        }
        System.out.println("Anda Sudah Melakukan perulangan Sebanyak "+ counter + " Kali");
    }
}