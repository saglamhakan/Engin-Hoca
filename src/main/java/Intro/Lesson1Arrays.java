package Intro;

public class Lesson1Arrays {
    public static void main(String[] args) {

        String[] krediler ={"Hızlı Kredi", "Maaşını Halkbanktan al", "Mutlu Emekli"};
     /* Böyle yaparsak uzun olur o yüzden döngü kullanacaz.
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length ; i++){
            System.out.println(krediler[i]);

        }
        String[] ogrenci ={"Salih", "Hakan", "Mehmet"};
        System.out.println(ogrenci[2]);
        System.out.println("----------------------");
*/
        String[] ogrenciler=new String[4];
            ogrenciler[0]="Hakan";
            ogrenciler[1]="Mehmet";
            ogrenciler[2]="Enes";
            ogrenciler[3]="Hasan";

            for (int i=0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);

        }
        System.out.println("---------------");
              for (String ogrenci: ogrenciler){
                  System.out.println(ogrenci);
              }
    }
}
