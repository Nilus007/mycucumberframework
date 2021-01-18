package day03;

public class Question04 {
    public static void main(String[] args) {
        // bir string tanımlayalım ve degeri alfabenin harfleri olsun
        // Charat methodu ile Java yazısını yazdırın
        // ABCDEFGHIJKLMNOPRSTVUWXYZ

        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char c1 = alfabe.charAt(9);//J
        char c2 = alfabe.charAt(0);//A
        char c3 = alfabe.charAt(21);//V
alfabe.charAt(alfabe.length()-1);
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c2);  //JAVA
    }
}
