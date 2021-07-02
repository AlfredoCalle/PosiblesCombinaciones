package posiblescombinaciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import posiblescombinaciones.Permutacion;

public class ListaCombinaciones {

    public static List<String> combinacion(String s) {
        List<String> lista = new ArrayList<>();

        String[] caracteres = s.split("");
        Collections.shuffle(Arrays.asList(caracteres));

        StringBuilder palabra = new StringBuilder();

        while (lista.size() != Permutacion.factorial(s.length())) {
            for (String caracter : caracteres) {
                palabra.append(caracter);
            }
            if (!lista.contains(palabra)) {
                lista.add(palabra.toString());
            }
            Collections.shuffle(Arrays.asList(caracteres));
            palabra = new StringBuilder();
        }
        return lista;
    }

}
