package havadurumu;

import java.util.Scanner;

public class havadurumu {
    public static void main(String[] args) {

        int heat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz: ");
        heat = scan.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsiniz!");
        } else if (heat>=5 && heat<=15 ) {
            System.out.println("Sinemaya gidebilirsiniz!");
            
        } else if (heat>15 && heat<=25) {
            System.out.println("Pikniğe gidebilirsiniz!");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz!");

        }
    }
}
