import java.util.Scanner;
class percabangan4{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);
        int alas,tinggi,luas1,luas2,luas3,sisi1,sisi2,panjang,lebar,r;
        String segitiga,persegi,persegi_panjang,linkaran,pilih;
        double luas4,phi = 3.14;
        System.out.println("=========== BANGUN DATAR ========");
        System.out.println("1.SEGITIGA");
        System.out.println("2.PERSEGI");
        System.out.println("3.PERSEGI PANJANG");
        System.out.println("4.LINGKARAN");
        System.out.println("");
         System.out.print("Pilih bangun datar :");
         pilih = a.nextLine();
    
        if(pilih.equalsIgnoreCase("1")){
            System.out.println("Menghitung luas Segitiga");
            System.out.print("Masukkan alas  :");
            alas= a.nextInt();
            System.out.print("masukan tinggi :");
        tinggi = a.nextInt();

         luas1 =(alas * tinggi)/2 ;

        System.out.println("hasil luas : "+luas1);
        }
        else if(pilih.equalsIgnoreCase("2")){
            System.out.println("Menghitung luas Persegi");
             System.out.print("Masukkan sisi1 :");
             sisi1= a.nextInt();
             System.out.print("masukan sisi2  :");
             sisi2= a.nextInt();

         luas2 =sisi1 * sisi2 ;

        System.out.println("hasil luas : "+luas2);
        
        }
         else if(pilih.equalsIgnoreCase("3")){
            System.out.println("Menghitung luas Persegi Panjang");
        System.out.print("Masukkan panjang :");
        panjang= a.nextInt();
        System.out.print("masukan lebar    :");
        lebar= a.nextInt();

         luas3 = panjang * lebar;

        System.out.println("hasil luas : "+luas3);   
        }
         else if(pilih.equalsIgnoreCase("4")){
            System.out.println("Menghitung luas Lingkaran");
            System.out.print("masukan jarijari:");
        r= a.nextInt();

         luas4 = phi * r * r;

        System.out.println("hasil luas : " +luas4);
         }
     }
}
    

     
       