package posiblescombinaciones;

public class Permutacion {

    public static long factorial(int i) {
        int resultado = 1;
        for (int y = 1; y <= i; y++) {
            resultado *= y;
        }
        return resultado;
    }

}
