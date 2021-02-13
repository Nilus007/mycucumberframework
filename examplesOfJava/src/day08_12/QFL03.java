package day08_12;

public class QFL03 {
    public static void main(String[] args) {
        /*
        5 ten 12 ye kadar tum tam sayiların
        toplamını ekrana yazdıran sayi yazdirin
         */
        int sum=0;
        for (int i=0; i<=12; i++){
            sum=sum+i;
            // sum=+i;
        }
        System.out.println("toplam: " + sum);
    }
}
