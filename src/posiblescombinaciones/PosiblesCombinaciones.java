package posiblescombinaciones;

import java.util.List;
import java.util.Scanner;

public class PosiblesCombinaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabra:");
        String palabra = sc.nextLine();

        List<String> listCombinacion = ListaCombinaciones.combinacion(palabra);
        System.out.println("Se generaron: " + listCombinacion.size() + " palabras");
        for(String p: listCombinacion) {
            System.out.println(p);
        } 
    }

}
