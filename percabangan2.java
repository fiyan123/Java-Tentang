import java.util.Scanner;

class percabangan2{
    public static void main(String args[]){

        Scanner a =new Scanner(System.in);
        
        int nilai;

        System.out.print("Nilai Anda :");
        nilai = a.nextInt();

        if(nilai >= 90){
            System.out.println("Grade A");
        }
        else if(nilai >= 80){
            System.out.println("Grade B");
        }
        else if(nilai >= 70){
            System.out.println("Grade C");
        }
         else if(nilai >= 60){
            System.out.println("Grade D");
        }
         else if(nilai >= 50){
            System.out.println("Grade E");
        }
          else 
           System.out.println("BANYAKIN BELAJAR");
    }         
        }
    
