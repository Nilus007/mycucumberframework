package day08_13;

public class QFL02 {
    /*
    for loop kullanarak şekil olusturalım
    *
    **
    ***
    ****
     */
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){  // satır sayısı
            for (int k=1; k<=i; k++){  // yildiz sayisi
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
