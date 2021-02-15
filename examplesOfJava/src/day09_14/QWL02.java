package day09_14;

public class QWL02 {
    /*
    3 basamaklı 4 ve 6 ile bölünen
     tam sayıları kucukten buyuge sırala ve kaç tanae oldugunu yazdır
     */
    public static void main(String[] args) {
        int i=999;
        int counter=0;
        while (i>=100){
            if (i%4==0 && i%6==0){
                System.out.println(i+" ");
                counter++;
            }
            i--;
        }

        System.out.println(counter);

    }

}
