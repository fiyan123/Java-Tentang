import java.util.Scanner;

class Aritmatika{
    public static void main(String args[]){
    
    Scanner a = new Scanner(System.in);

    int angka1,angka2,penjumlahan,pengurangan,pembagian,perkalian;

    System.out.print("masukan angka pertama  :");
    angka1 = a.nextInt();
    System.out.print("masukan angka kedua  :");
    angka2  = a.nextInt();
    
    

    penjumlahan =angka1 + angka2;
    pengurangan = angka1 - angka2;
    pembagian = angka1 / angka2;
    perkalian = angka1 * angka2;

    System.out.println("hasil penjumlahan :"+penjumlahan);
    System.out.println("hasil pengurangan :"+pengurangan);
    System.out.println("hasil pembagian   :"+pembagian);
    System.out.println("hasil perkalian   :"+perkalian);

    }

}