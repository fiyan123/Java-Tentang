import java.util.Scanner;
class ifbersarang{
    public static void main(String args[]){

        Scanner a = new Scanner (System.in);
        String pilih;
        System.out.println("========= MATA PELAJARAN ========");
        System.out.println("1.MATEMATIKA");
        System.out.println("2.BAHASA INDONESIA");
        System.out.println("3.BAHASA INGGRIS");
        System.out.println("4.KEJURUAN");
        System.out.println("");
        System.out.print("PILIH PELAJARAN :");
         pilih = a.nextLine();
         
        if(pilih.equalsIgnoreCase("MATEMATIKA")){
            System.out.println("");
            System.out.println("INI KELAS MATEMATIKA");
               if(pilih.equalsIgnoreCase("MATEMATIKA")){
                  System.out.println(" 1.Matematika kelas X");
                  System.out.println(" 2.Matematika kelas XI");
                  System.out.println(" 3.Matematika kelas XII");
        }    
     } 

          
       if(pilih.equalsIgnoreCase("BAHASA INDONESIA")){
            System.out.println("");
            System.out.println("INI KELAS B.INDONESIA");
                   if(pilih.equalsIgnoreCase("BAHASA INDONESIA")){
                      System.out.println("1.Bahasa indonesia kelas X");
                      System.out.println("2.Bahasa indonesia kelas XI");
                      System.out.println("3.Bahasa indonesia kelas XII");
        }
    }
        
     if(pilih.equalsIgnoreCase("BAHASA INGGRIS")){
            System.out.println("");
            System.out.println("INI KELAS B.INGGRIS");
                   if(pilih.equalsIgnoreCase("BAHASA INGGRIS")){
                      System.out.println("1.Bahasa inggris kelas X");
                      System.out.println("2.Bahasa inggris kelas XI");
                      System.out.println("3.Bahasa inggris kelas XII");
        }
   }  
        

        if(pilih.equalsIgnoreCase("KEJURUAN")){
            System.out.println("");
            System.out.println("INI KELAS KEJURUAN");
                     if(pilih.equalsIgnoreCase("KEJURUAN")){
                      System.out.println("1.Kejuruan kelas X");
                      System.out.println("2.Kejuruan kelas XI");
                      System.out.println("3.Kejuruan kelas XII");
        
        }
  }   else
            System.out.println("MAAF GAADA");
           
        
        
     }
}
    

       
