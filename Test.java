import java.util.Scanner;
public class Test{

     public static void main(String []args){
        
        
        System.out.println("Masukkan Total Buah :");
        Scanner input = new Scanner(System.in);
        
        int angka = input.nextInt();
        
        if(angka%3 == 0 & angka%5 == 0){
            System.out.println("Apel dan Jeruk");
        } else if (angka%3 == 0){
            System.out.println("Apel");
        } else{
            System.out.println("Jeruk");
        }
     }
}