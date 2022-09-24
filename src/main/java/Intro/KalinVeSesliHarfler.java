package Intro;

import java.util.Scanner;

public class KalinVeSesliHarfler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Harf giriniz: ");
        String harf= input.nextLine();

        switch (harf){
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println("Kalın sesli harf" );
                break;
            default:
                System.out.println("İnce sesli harf  ");
        }





    }
}
