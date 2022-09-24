package Intro;

import java.util.Scanner;

public class SayiAsalMi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,toplam=0;
        System.out.print("Enter the Number: ");
        n= input.nextInt();
        for (int i=1;i<=n; i++){
            if (n%i==0){
                toplam++;

            }
        }
           if (toplam==2){
               System.out.println("Asal sayıdır");
           }
           else {
               System.out.println("Asal sayı değildir");
           }
    }
}
