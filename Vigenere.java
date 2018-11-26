public class Vigenere {

    static String encode(String s, String password) {
        StringBuilder resultado = new StringBuilder();
        // limpiamos el mensaje y la clave
        s = LimpiarTexto(s);
        password = LimpiarTexto(password);
        // creamos dos variables para tener en cuenta la clave
        int repeatKey = 0, numKey;
        for (int i = 0; i < s.length(); i++) {
            // guardamos el valor de la letra
            char letra = s.charAt(i);
            // si la clave se repite, la reiniciamos
            if (repeatKey == password.length()) {
                repeatKey = 0;
            }
            // comprobamos que la letra está entre el abecedario
            if (letra >= 'A' && letra <= 'Z') {
                // obtenemos el valor de la clave
                numKey = password.charAt(repeatKey) - 64;
                repeatKey++;
                int suma = letra + numKey;
                // comprobamos que la suma de la letra y de la clave no es mayor que Z
                if (suma > 90) {
                    suma -= 26;
                }
                resultado.append((char) suma);
            } else resultado.append(letra);
        }
        return resultado.toString();
    }

    static String decode(String s, String password) {
        StringBuilder resultado = new StringBuilder();
        // limpiamos el texto y la clave
        s = LimpiarTexto(s);
        password = LimpiarTexto(password);
        int repeatKey = 0, numKey;
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            if (repeatKey == password.length()) {
                repeatKey = 0;
            }
            // comprobamos que la letra está entre la A y la Z
            if (letra >= 'A' && letra <= 'Z') {
                numKey = password.charAt(repeatKey) - 64;
                repeatKey++;
                int resta = letra - numKey;
                // comprobamos que la resta entre la letra y la clave no es menor que A
                if (resta < 65 ) {
                    resta += 26;
                }
                resultado.append((char) resta);
            } else resultado.append(letra);
        }
        return resultado.toString();
    }

    // Esta funcion elimina los caracteres no deseados
    static String LimpiarTexto(String s){
        StringBuilder texto = new StringBuilder(s.toUpperCase());
        for (int i = 0; i < s.length(); i++) {
            char replace = texto.charAt(i);
            if (replace == 'Á' || replace == 'À') texto.setCharAt(i,'A');
            if (replace == 'É' || replace == 'È') texto.setCharAt(i,'E');
            if (replace == 'Í' || replace == 'Ì') texto.setCharAt(i,'I');
            if (replace == 'Ó' || replace == 'Ò') texto.setCharAt(i,'O');
            if (replace == 'Ú' || replace == 'Ù') texto.setCharAt(i,'U');
        }
        return texto.toString();
    }
}