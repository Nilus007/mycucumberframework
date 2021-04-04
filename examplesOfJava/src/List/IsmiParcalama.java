package List;

import java.util.*;

public class IsmiParcalama {
    // isim alın ve harflrini liste atın harf sırasına koyun
// harleri alfabetik sıranın tersinde büyül harfle yazın
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scanner.nextLine().replace(" ", "").toUpperCase();

        List<Character> words = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            words.add(str.charAt(i));
        }
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);

        List<Character> harflerTers=new ArrayList<>();

        for (int i=words.size()-1; i>=0; i++){
          harflerTers.add(words.get(i));
         //
        }
        //Collections.reverse(words);
        System.out.println(harflerTers);
            }
}
