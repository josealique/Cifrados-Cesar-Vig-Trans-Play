public class Caesar {

   private static String abecedarioMay =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   private static String abecedarioMin = abecedarioMay.toLowerCase();


    static String cypher(String s, int delta) {
        StringBuilder cifrado = new StringBuilder();
        delta = delta % 26;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if ((s.charAt(i) + delta) > 'z') {
                    cifrado.append((char) (s.charAt(i) + delta - 26));
                } else {
                    cifrado.append((char) (s.charAt(i) + delta));
                }
                System.out.println(s.charAt(i));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if ((s.charAt(i) + delta) > 'Z') {
                    cifrado.append((char) (s.charAt(i) + delta - 26));
                } else {
                    cifrado.append((char) (s.charAt(i) + delta));
                }
            }
        }
        return cifrado.toString();
    }

    static String decypher(String s, int delta) {
        return "";
    }

    static String magic(String s, String ss) {
        return "";
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(cypher(s,1));
    }
}