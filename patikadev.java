package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class patikadev {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("mat notunuzu girin: ");
		int m = scan.nextInt();
		
		System.out.println("fizik notunuzu girin: ");
		int f = scan.nextInt();
		
		System.out.println("kimya notunuzu girin: ");
		int k = scan.nextInt();
		
		int ort = (m+f+k)/3;
		System.out.println("ortalamaniz: "+ ort);
		
		
		if (ort>= 60) {
			System.out.println("Sinifi gecti");
			
		}else {
			System.out.println("sinfita kaldi");
		}
		
			
		
		
		
		

	}

}
