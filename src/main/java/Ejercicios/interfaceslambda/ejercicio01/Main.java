package Ejercicios.interfaceslambda.ejercicio01;

import Ejercicios.lambda.ejercicio01.Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.

        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("veinticuatro");

        List<Integer> lista02 = new ArrayList<>();
        lista02.add(1);
        lista02.add(2);
        lista02.add(24);
        lista02.add(4);
        lista02.add(5);
        lista02.add(3);

        System.out.println("Ejercicio 01");
        imprimirLista  imprimir = lista1 -> {
            for (String elemento : lista) {
                System.out.println(elemento);
            }
        };

        imprimir.imprimmirLista(lista);


        //Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
        System.out.println("Ejercicio 02");

        contarCaracteres contar = lista1 -> {
            int contador = 0;
            for (String elemento: lista1) {

                if (elemento.length() > 5){

                    contador++;
                }
            }
            return contador;
        };

        System.out.println(contar.contar(lista));


        //Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        System.out.println("Ejercicio 03");

        numMayor numeroMayor = lista2 ->{
            int mayor = 0;
            for (int i = 0; i < lista2.size(); i++) {
                if (mayor < lista2.get(i)){
                    mayor = lista2.get(i);
                }
            }
            return mayor;
        };
        // Otra forma
        numMayor numeroMayor2 = lista2 -> {
            return lista2.stream().max((o1, o2) -> o1 - o2).orElse(0);
        };

        System.out.println(numeroMayor.encontrarMayor(lista02));
        System.out.println(numeroMayor2.encontrarMayor(lista02));


        //Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.
        System.out.println("Ejercicio 04");

        encontarPares encontarPares = lista2 ->{
            int suma = 0;
            for (int i = 0; i < lista2.size(); i++) {
                if (lista2.get(i) % 2 == 0){
                    suma += lista2.get(i);
                }
            }
            return suma;
        };

        System.out.println(encontarPares.encontarPares(lista02));

        //Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.
        System.out.println("Ejercicio 05");


        //Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.
        //Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
        //Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.
        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.
    }
}
