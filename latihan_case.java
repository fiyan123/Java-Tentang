import java.util.Scanner;
class latihan_case{
    public static void main(String args[]){
        
        Scanner a = new Scanner(System.in);
        
        String hari;
        System.out.print("Inputkan Hari :");
        hari = a.nextLine();
        
        switch(hari){
            case "senin":
            System.out.println("Ini adalah hari SENIN");
            break;
            case "selasa":
            System.out.println("Ini adalah hari SELASA");
            break;
            case "rabu":
            System.out.println("Ini adalah hari RABU");
            break;
            case "kamis":
            System.out.println("Ini adalah hari KAMIS");
            break;
            case "jumat":
            System.out.println("Ini adalah hari JUMAT");
            break;
            case "sabtu":
            System.out.println("Ini adalah hari SABTU");
            break;
            case "minggu":
            System.out.println("Ini adalah hari MINGGU");
            break;
            default:
            System.out.println("HARI  YANG ANDA INPUTKAN TIDA ADA!!");
        }


    
    }         
        }
    
