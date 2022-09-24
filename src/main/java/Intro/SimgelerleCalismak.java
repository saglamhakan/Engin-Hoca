package Intro;

public class SimgelerleCalismak {
    public static void main(String[] args) {
        String haber="Bugün Hava Çok Güzel.";
        System.out.println(haber);
        System.out.println("Harf Sayısı: " + haber.length());
        System.out.println("5. Harf : " + haber.charAt(4));
        System.out.println(haber.concat("Yaşasın!"));
        System.out.println(haber.startsWith("B"));
        System.out.println(haber.endsWith("."));
        char[] karakterler=new char[5];
        haber.getChars(0,3, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(haber.indexOf("g"));
        System.out.println(haber.lastIndexOf("a"));
        System.out.println(haber.replace('a', 'A' ));
        System.out.println(haber.substring(2,5));
        for (String kelime:haber.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(haber.toLowerCase());
        System.out.println(haber.toUpperCase());



    }
}
