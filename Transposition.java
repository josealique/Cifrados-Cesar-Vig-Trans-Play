public class Transposition {
    static String cypher(String s, int dim) {
        // creamos una variable para saber cuantas filas habrá en la tabla
        int filas = (s.length() / dim) + 1;
        // creamos la matriz definiendo filas y columnas
        char[][] transposicion = new char[filas][dim];
        // variable para contar la longitud del mensaje
        int longitudMensaje = 0;
        // variable que cubre los espacios vacíos
        char espacioVacio = '\0';
        StringBuilder resultado = new StringBuilder();

        for (int fila = 0; fila < transposicion.length; fila++) {
            for (int col = 0; col < transposicion[fila].length; col++) {
                // si las longitudes son iguales, salimos del bucle
                if (longitudMensaje > s.length()-1){
                    break;
                }
                transposicion[fila][col] = s.charAt(longitudMensaje);
                longitudMensaje++;
            }
        }

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < filas; j++) {
                // esto lo hacemos para ignorar los espacios en blanco
                if (transposicion[j][i] == espacioVacio){
                    continue;
                }
                // añadimos al resultado el mensaje transposicionado
                resultado.append(transposicion[j][i]);
            }
        }
        return resultado.toString();
    }

    static String cypher(String s, String key) {return "";}

    static String decypher(String s, int dim) {return "";}

    static String decypher(String s, String key) {return "";}
}