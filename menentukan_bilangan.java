import java.util.Scanner;
class menentukan_bilangan{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);
        
        int bilangan;
        System.out.println("============ MENENTUKAN BILANGAN GENAP & GANJIL ==========");
        System.out.print("Masukkan bilangan :");
        bilangan = a.nextInt();
    

        if(bilangan % 2==0){ 
            System.out.print(""+bilangan);

            System.out.print(" Bilangan genap");
        }
        else{
             System.out.print(""+bilangan);

            System.out.println(" Bilangan ganjil");
        }
      }
}