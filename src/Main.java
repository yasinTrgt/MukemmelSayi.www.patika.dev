import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mukemmelSayi,sum=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        mukemmelSayi=input.nextInt();

        for (int i=1 ; i<mukemmelSayi ; i++){
            if (mukemmelSayi % i ==0 ){
                sum+=i;
            }
        }
        if (sum==mukemmelSayi){
            System.out.println( mukemmelSayi + " mükemmel sayıdır.");
        }else
            System.out.println( mukemmelSayi + " mükemmel sayı değildir.");
    }
}
