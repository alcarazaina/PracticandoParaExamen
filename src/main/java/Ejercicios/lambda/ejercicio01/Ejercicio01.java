package Ejercicios.lambda.ejercicio01;


import java.util.ArrayList;
import java.util.List;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.
        List<String> lista = new ArrayList<>();
         lista.add("Hola");
         lista.add("Caracola");
         lista.add("Pff");
         lista.add("Pepito");
         lista.add("Diez");

         //Consumer
         lista.forEach(l -> System.out.println(l));

         //Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.

        // Predicate
        System.out.println(lista.stream().filter(l -> l.length() > 5).count());

        // Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.

        List<Integer> lista2 = new ArrayList<>();

        lista2.add(1);
        lista2.add(4);
        lista2.add(25);
        lista2.add(6);
        lista2.add(79);
        lista2.add(12);

        // Comparator
        System.out.println(lista2.stream().max((o1, o2) -> o1 - o2).orElse(0));


        // Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.


        //Predicate
        System.out.println(lista2.stream().filter(l -> l % 2 == 0).reduce(0, Integer::sum));

        // Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Pedro", 51));
        personas.add(new Persona("Carlos", 35));
        personas.add(new Persona("Robert", 24));
        personas.add(new Persona("Aina", 29));
        personas.add(new Persona("Kamilly", 19));
        personas.add(new Persona("Sergio", 13));
        personas.add(new Persona("Ana", 8));
        personas.add(new Persona("Alejandro", 27));


        //Comparator
        System.out.println(personas.stream().min((o1, o2) -> o1.getEdad() - o2.getEdad()).orElseThrow());


        // Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.

        // consumer
        personas.stream().sorted((o1, o2) -> o1.getEdad() - o2.getEdad()).forEach(persona -> System.out.println(persona));


        // Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.


        // predicate (filtro) y consumer (foreach)
        personas.stream().filter(persona -> persona.getEdad() > 30).forEach(persona -> System.out.println(persona));

        // Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Pan", 0.99));
        productos.add(new Producto("Leche", 1.10));
        productos.add(new Producto("Jamón", 1));
        productos.add(new Producto("Estropajo", 2.15));
        productos.add(new Producto("Donuts", 1.05));
        productos.add(new Producto("Doritos", 1.25));
        productos.add(new Producto("Coca-cola", 1.25));
        productos.add(new Producto("AOVE", 10.50));

        System.out.println(productos.stream().mapToDouble(Producto::getPrecio).sum());

        // Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.

        productos.stream().sorted((o1, o2) -> (int) ((o1.getPrecio() * 100) - (o2.getPrecio() * 100))).forEach(producto -> System.out.println(producto));

        // Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.

        productos.stream().filter(producto -> producto.getPrecio() < 10).forEach(producto -> System.out.println(producto));



    }

}
