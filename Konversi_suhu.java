import java.util.Scanner;
class Konversi_suhu{
    public static void main(String args[]){

        Scanner a = new Scanner(System.in);
        
        double kelvin,fahrenheit,reamur,celcius;
        System.out.println("+++++++++++ Konversi Suhu ++++++++++");
        System.out.println("");
        System.out.print("Masukkan konversi Celcius  :");
        celcius = a.nextDouble();
        System.out.println("");
        System.out.println("++++++++ Hasil konversi Suhu ++++++++");
        
        kelvin = celcius + 273.15;
        fahrenheit = (celcius * 1.8)+32;
        reamur = celcius*0.8;
        


        System.out.println("Kelvin     :"+kelvin);
        System.out.println("fahrenheit : "+fahrenheit);
        System.out.println("reamur     :"+reamur);
        System.out.println("++++++++++++++++++++++++++++++++++++++");


        
    }
}