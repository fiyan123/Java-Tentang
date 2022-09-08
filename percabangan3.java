import java.util.Scanner;
class percabangan3{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);
        
        String hari;
        System.out.print("Hari apakah ini :");
        hari = a.nextLine();
    

        if(hari.equalsIgnoreCase("Senin")){
            System.out.println("Hari ini hari senin");
        }
        else if(hari.equalsIgnoreCase("selasa")){
            System.out.println("Hari ini hari selasa");
        }
        else if(hari.equalsIgnoreCase("Rabu")){
            System.out.println("Hari ini hari Rabu");
        }
        else if(hari.equalsIgnoreCase("Kamis")){
            System.out.println("Hari ini hari kamis");
        } 
        else if(hari.equalsIgnoreCase("Jumat")){
            System.out.println("Hari ini hari Jumat");
        } 
        else if(hari.equalsIgnoreCase("Sabtu")){
            System.out.println("Hari ini hari Sabtu");
        } 
         else if(hari.equalsIgnoreCase("Minggu")){
            System.out.println("Hari ini hari Minggu");
        } 
        else 
        System.out.println("MAAF GAADA");

    }
}



     
    