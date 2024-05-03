package Ejercicios.stream.ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ejercicio01 {
    public static void main(String[] args) {

        // Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15. Utilizando streams, haz lo siguiente:
        
        Random generador = new Random();

        Supplier<Integer> random = () -> generador.nextInt(0,16);
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numeros.add(random.get());
        }

        //Imprime todos los elementos de la lista, sin ordenar.

        numeros.stream().forEach(n -> System.out.print(n + " "));

        System.out.println();

        //Imprime todos los elementos de la lista, ordenados.
        numeros.stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        //Imprime todos los elementos de la lista, sin repetir, ordenados.
        numeros.stream().sorted().distinct().forEach(n -> System.out.print(n + " "));

        System.out.println();

        //Imprime sólo los mayores o iguales a 5 distintos entre sí.
        numeros.stream().filter(n -> n >= 5).distinct().forEach(n -> System.out.print(n + " "));
        System.out.println();

        //Imprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados.
        numeros.stream().sorted((o1, o2) -> o1 - o2).filter(n -> n >= 5).distinct().forEach(n -> System.out.print(n + " "));
        System.out.println();

        //Imprime sólo los mayores o iguales a 5 distintos entre sí,  ordenados inversamente.
        numeros.stream().sorted((o1, o2) -> o2 - o1).filter(n -> n >= 5).distinct().forEach(n -> System.out.print(n + " "));
        System.out.println();

        //Suma todos los elementos de la lista e imprime el resultado.
        System.out.println(numeros.stream().reduce(0, (n, n2) -> n + n2));
        System.out.println("Otra Forma: ");
        System.out.println(numeros.stream().mapToInt(numero -> numero).sum());

        //Suma todos los elementos mayores o iguales a 5 (también los que se repitan) e imprime el resultado.
        System.out.println(numeros.stream().filter(n -> n >= 5).reduce(0, (n1, n2) -> n1 + n2));

        //Calcula el promedio de todos los elementos de la lista (sin eliminar los repetidos) e imprime el resultado.

        System.out.println(numeros.stream().reduce(0, (n1, n2) ->  (n1 + n2) / numeros.size())); // no lo saca con decimales
        System.out.println(numeros.stream().mapToDouble(Integer::doubleValue).average().orElse(0));
    }
}
