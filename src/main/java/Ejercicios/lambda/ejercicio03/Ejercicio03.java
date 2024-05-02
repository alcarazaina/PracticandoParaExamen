package Ejercicios.lambda.ejercicio03;

import java.util.function.Predicate;

public class Ejercicio03 {
    public static void main(String[] args) {

        // Define un predicado para comprobar si un entero es múltiplo de 5.

        // El predicado devuelve true o false
        Predicate<Integer> numeros = numero -> numero % 5 == 0;
        System.out.println(numeros.test(15));

        // Define un predicado para comprobar si un String no termina en “s”.
        Predicate<String> cadena = c -> !c.endsWith("s");
        System.out.println(cadena.test("Holas"));

        //Define un predicado para comprobar si un entero es par y múltiplo de 3.
        numeros = numero -> numero % 2 == 0 && numero % 3 == 0;
        System.out.println(numeros.test(3));

        // Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        Predicate<Character> charmander = character -> Character.isUpperCase(character);
        System.out.println(charmander.test('D'));


        // Define un predicado para comprobar si un entero es impar y múltiplo de 7
        numeros = numero -> numero % 2 != 0 && numero % 7 == 0;

        System.out.println(numeros.test(21));

        // Define un predicado para comprobar si un entero es impar o múltiplo de 7.

        numeros = numero -> numero % 2 != 0 || numero % 7 == 0;

        System.out.println(numeros.test(14));
    }
}
