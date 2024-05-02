package Ejercicios.lambda.ejercicio04;

import java.util.function.Function;

public class Ejercicio04 {
    public static void main(String[] args) {

        // Define una función para devolver la longitud de un String.
        Function<String, Integer> longitud = cadena -> cadena.length();

        System.out.println(longitud.apply("Hola"));

        //Define una función que devuelva el cuadrado de un entero.
        Function<Integer, Integer> cuadrado = numero -> (int) Math.pow(numero, 2);

        System.out.println(cuadrado.apply(3));


        //Define una función que devuelva el 10% de una cantidad.

        Function<Double, Double> cantidad = numero -> numero * 0.1;

        System.out.println(cantidad.apply(100.0));
    }
}
