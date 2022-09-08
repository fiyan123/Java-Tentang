import java.util.Scanner;
class ifbersarang2{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);

        String pilih,datar,ruang;
        int alas,tinggi,luas1,sisi1,sisi2,luas2,panjang,lebar,luas3,luas5,luas6,sisi3,sisi;
        double phi=3.14,r,luas4;
        System.out.println("=========== MENGHITUNG BANGUN DATAR & RUANG ========");
        System.out.println("1.BANGUN DATAR");
        System.out.println("2.BANGUN RUANG");
            System.out.print("PILIH BANGUN  :");
            pilih = a.nextLine();

        if(pilih.equalsIgnoreCase("1")){
            System.out.println("BANGUN DATAR");
            System.out.println("1.Luas segitiga");
            System.out.println("2.Luas Persegi");
            System.out.println("3.Luas Persegi panjang");
            System.out.println("4.Luas Lingkaran");
            System.out.println("================================================");

            System.out.print("Pilih Bangun Datar  :" );
            datar = a.nextLine();

                    if(datar.equalsIgnoreCase("1")){
                            System.out.println("MENGHITUNG LUAS SEGITIGA");
                            System.out.print("MASUKKAN ALAS   :");
                            alas= a.nextInt();
                            System.out.print("MASUKKAN TINGGI :");
                            tinggi = a.nextInt();
                            System.out.println("=============================================");
                            luas1 =(alas * tinggi)/2 ;
                            System.out.println("hasil luas : "+luas1);
                    }
                    else if(datar.equalsIgnoreCase("2")){
                            System.out.println("MENGHITUNG LUAS PERSEGI");
                            System.out.print("MASUKKAN SISI 1   :");
                            sisi1= a.nextInt();
                            System.out.print("MASUKKAN SISI 2 :");
                            sisi2 = a.nextInt();
                            System.out.println("=============================================");
                            luas2 =sisi1*sisi2 ;
                            System.out.println("hasil luas : "+luas2);
                    }
                    else if(datar.equalsIgnoreCase("3")){
                            System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
                            System.out.print("MASUKKAN PANJANG  :");
                            panjang= a.nextInt();
                            System.out.print("MASUKKAN LEBAR :");
                            lebar = a.nextInt();
                            System.out.println("=============================================");
                            luas3 =panjang*lebar ;
                            System.out.println("hasil luas : "+luas3);
                    }
                     else if(datar.equalsIgnoreCase("4")){
                            System.out.println("MENGHITUNG LUAS LINGKARAN");
                            System.out.print("MASUKKAN PHI  :");
                            phi= a.nextDouble();
                            System.out.print("MASUKKAN R :");
                            r= a.nextDouble();
                            System.out.println("=============================================");
                            luas4 =phi*r*r ;
                            System.out.println("hasil luas : "+luas4);
                    }
        }
                    else if(pilih.equalsIgnoreCase("2")){
                        System.out.println("BANGUN RUANG");
                        System.out.println("1.Volume Balok");
                        System.out.println("2.Volume Kubus");
                         System.out.println("=============================================");
                         System.out.print("PILIH BANGUN RUANG :");
                         ruang = a.nextLine();

                      if(ruang.equalsIgnoreCase("1")){
                            System.out.println("MENGHITUNG VOLUME BALOK");
                            System.out.print("MASUKKAN PANJANG   :");
                            panjang= a.nextInt();
                            System.out.print("MASUKKAN LEBAR   :");
                            lebar= a.nextInt();
                            System.out.print("MASUKKAN TINGGI :");
                            tinggi = a.nextInt();
                            System.out.println("=============================================");
                            luas5 =panjang*lebar*tinggi ;
                            System.out.println("hasil luas : "+luas5);
                    }   
                      else if(ruang.equalsIgnoreCase("2")){
                            System.out.println("MENGHITUNG VOLUME KUBUS");
                            System.out.print("MASUKKAN SISI  :");
                            sisi= a.nextInt();
                            System.out.println("=============================================");
                            luas6 =sisi*sisi*sisi ;
                            System.out.println("hasil luas : "+luas6);
                    }

                    
    }

}
    }



    
    