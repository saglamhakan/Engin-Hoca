package Intro;

import java.util.Scanner;

public class AranacakSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] sayi=new int[]{1,3,5,7,9};
        int aranacak=8;
        boolean varMi=false;
        for (int sayilar: sayi){
            if (sayilar==aranacak){
              varMi=true;
              break;
            }

        }
        if (varMi){
            System.out.println("Sayı var");
        }else {
            System.out.println("Sayı yok");
        }



    }
}
