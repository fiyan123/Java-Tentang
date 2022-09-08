import java.util.Scanner;
class Tahun_kabisat{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);
        
        int tahun;
        System.out.println("======== MENENTUKAN TAHUN KABISAT ========:");
        System.out.println("");
        System.out.print("MASUKKAN TAHUN :");
        tahun = a.nextInt();

    

        if(tahun % 4 ==0){
            System.out.println("Tahun kabisat");
        }
        else{
            System.out.println("BUKAN TAHUN KABISAT");
        }

}
}
