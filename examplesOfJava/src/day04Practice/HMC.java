package day04Practice;

public class HMC {
    /*
    HM clasından obje olusturup oradaki methodları kullanınız
     */

    public static void main(String[] args) {
        // class name   obge name    key     constructor
               HM      hesapMakinesi = new       HM();
        hesapMakinesi.carp3(2, 3, 5);
        hesapMakinesi.carp2(5, 5);
        System.out.println(hesapMakinesi.carp2(5, 5));
    }
}
