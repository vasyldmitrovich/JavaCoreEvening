package tasks;
/*Roman Sitko
* */
public class Task4 {

    public static void countLetters(String str){

        int count = 0;
         char[] c = str.toCharArray();
         for(int i = 0; i < c.length; i++) {
             if ((c[i] == 'a') ||
                     (c[i] == 'e') ||
                     (c[i] == 'i') ||
                     (c[i] == 'o') ||
                     (c[i] == 'u') ||
                     (c[i] == 'y') ||
                     (c[i] == 'A') ||
                     (c[i] == 'E') ||
                     (c[i] == 'I') ||
                     (c[i] == 'O') ||
                     (c[i] == 'U') ||
                     (c[i] == 'Y')) {
                count++;
             }
         }
        System.out.println("Count loud letters: " + count);
    }
}
