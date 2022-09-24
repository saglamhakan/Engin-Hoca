package Intro;

import java.util.Scanner;

public class ArkadasSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1;
        int n2;
        int sum1=0;
        int sum2=0;
        System.out.print("Enter the first number: ");
        n1= input.nextInt();
        System.out.print("Enter the second number: ");
        n2= input.nextInt();

        for (int i=1; i<n1; i++){
            if (n1%i==0) {
                sum1 += i;
            }
        }
        for (int i=1; i<n2; i++){
            if (n2%i==0) {
                sum2 += i;
            }
        }
        if (sum1==n2 && sum2==n1){
            System.out.println("Friendly number");
        }else {
            System.out.println("Ordinary number");
        }
    }
}
