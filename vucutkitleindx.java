package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class vucutkitleindx {

	public static void main(String[] args) {
		
		double boy,kilo;
		double index;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("boyunuzu giriniz: ");
		boy = scan.nextDouble();
		
		System.out.println("kilonuzu  giriniz: ");
		kilo = scan.nextDouble();
		
		index = (kilo  / boy) * boy;
		
		System.out.println("vucut kitle indexiniz: " + index);
		
		

	}

}
