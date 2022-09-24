package Intro;

public class Arrays {
    public static void main(String[] args) {
     //   double[] myNumber=new double[5];
        double[] myNumber= {1.2, 1.3, 1.8, 2.5};
        for (int i=0; i<myNumber.length; i++){
           System.out.println(myNumber[i]);
        }


      /*  double sum=0;
        double[] myNumber={1.2, 1.5, 2.6, 3.8};
        double maximumNumber=myNumber[0];
        for (double sayilarim:myNumber){
            if (maximumNumber<sayilarim){
                maximumNumber=sayilarim;

            }

            sum+=sayilarim;
            System.out.println(sayilarim);

        }
        System.out.println("Toplam =" +sum);
        System.out.println("En büyük sayı: " + maximumNumber);

       */
    }


}
