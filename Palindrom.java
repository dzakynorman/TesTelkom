import java.util.Scanner;
class Palindrom{
	public static void main(String[] args){
		System.out.println("Masukkan Kata :");
        Scanner input = new Scanner(System.in);

        String tulis = input.nextLine();		
			
		String poli = "";		

		for(int i= tulis.length();i>0;i--){
			String test1 = tulis.substring(i-1, i);
			poli += test1;
		}
		
		if(tulis.equals(poli)){
			System.out.println("==== "+tulis+" adalah True =====");
		}else{
			System.out.println("==== "+tulis+" adalah False =====");
		}
	}
}