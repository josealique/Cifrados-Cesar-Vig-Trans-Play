import java.util.Arrays;

public class Caesar {
    private static char[] CaractEsp = {'Á','É','Í','Ó','Ú','À','È','Ì','Ò','Ù','Ñ','Ç',','};

    static String cypher(String s, int delta) {
        StringBuilder resultado = new StringBuilder();
        s = s.toUpperCase();
        delta %= 26;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i); // creamos una variable para guardar cada valor del mensaje
            if (Character.isLetter(check)) { // comprobamos que no sea un numero, punto, etc
                char letter = (char) (check + delta); // sumamos el delta a la posicion del caracter
                if (letter > 'Z') {
                    if (Arrays.toString(CaractEsp).contains(Character.toString(check))) { // comprobamos que no tiene acentos
                        resultado.append(check);
                    } else {
                        resultado.append((char) (check - (26 - delta))); // si no, se le resta 26 a la posición del carácter y se le resta el delta
                    }
                } else {
                    resultado.append((char) (check + delta)); // si la letra no es mayor que Z, sumamos el delta directamente
                }
            } else {
                resultado.append(check); // en caso de no ser letra se añade directamente la palabra
            }
        }
        return resultado.toString();
    }

    static String decypher(String s, int delta) {
        StringBuilder resultado = new StringBuilder();
        s = s.toUpperCase();
        delta %= 26;
        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if (Character.isLetter(check)) {
                char letter = (char) (s.charAt(i) - delta); // hacemos lo contrario al cifrar
                if (letter > 'Z') {
                    if (Arrays.toString(CaractEsp).contains(Character.toString(check))) {
                        resultado.append(check);
                    } else {
                        resultado.append((char) (check - (26 - delta)));
                    }
                } else if (letter < 'A') { // comprobamos si la letra es menor que A
                    resultado.append((char) (check + (26 - delta))); // le sumamos 26 y le restamos el delta
                } else {
                    resultado.append(letter);  // sino, sumamos el delta a la palabra
                }
            } else {
                resultado.append(check); // en caso de no ser letra, añadimos directamente la palabra
            }
        }
        return resultado.toString();
    }

    static String magic(String s, String ss) {
        return "";
    }
}