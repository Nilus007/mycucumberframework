package day04Practice;

public class HM {
    /*
    HM isimli bir class olusturun
    icine 2 sayiiy carpan, 2 sayiyi toplayan method
    3 sayiyi carpan, 3 sayiyi toplayan ve sonucu carpan method yazdirin

     */
    public int topla2(int num, int num1) {
        return num + num1;
    }

    public int carp2(int num1, int num2) {
        return num1 * num2;
    }

    public void topla3(int num, int num1, int num2) {
        System.out.println("girdiginiz uc sayının toplamı" + (num + num1 + num2));
    }

    public void carp3(int num, int num1, int num2) {
        System.out.println("girdiginiz uc sayının carpimi" + (num * num1 * num2));
    }
}

