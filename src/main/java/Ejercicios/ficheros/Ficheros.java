package Ejercicios.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros {

    static String ruta = "src\\main\\java\\Ejercicios\\ficheros\\";
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void crearFichero (){
        System.out.println("Como quieres llamar al fichero: ");
        File fichero = new File(ruta + teclado.nextLine());
        try {
            if (fichero.exists()){
                System.out.println("El fichero ya existe");
            } else {
                fichero.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("A ocurrido una excepción " + e.getMessage());
        }
    }

    public static void escribirEnElFichero () {

        FileWriter fw = null;
        try{
            System.out.println("¿En que fichero quieres escribir?");
            File fichero = new File(ruta + teclado.nextLine());
            fw = new FileWriter(fichero, true);
            System.out.println("¿Qué quieres escribir?, escribe terminar para terminar");
            String linea = teclado.nextLine();
            while (!linea.equalsIgnoreCase("terminar")){

                fw.write(linea + "\n");
                linea = teclado.nextLine();
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("No se ha podido cerrar correctamente " + e.getMessage());
            }
        }
    }

    public static void eliminarFichero (){

        try {
            System.out.println("¿Qué fichero quieres eliminar?");
            File fichero = new File(ruta + teclado.nextLine());
            boolean eliminado = fichero.delete();
            if (eliminado){
                System.out.println("Fichero eliminado correctamente");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void leerFichero(){
        Scanner lector = null;
        try {
            System.out.println("¿Qué fichero quieres leer?");
            File fichero = new File(ruta + teclado.nextLine());
            lector = new Scanner(fichero);
            while (lector.hasNextLine()){
                System.out.println(lector.nextLine());
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (lector != null) {
                lector.close();
            }
        }
    }
    public static void menu(){
        System.out.println("¿Qué quieres hacer?\n1-Crear un fichero.\n2-Escribir en un fichero.\n3-Borrar un fichero.\n4-Leer fichero.\n0-Para salir ");
        int numero = teclado.nextInt(); teclado.nextLine();

        while (numero != 0) {

            switch (numero) {
                case 1 -> crearFichero();
                case 2 -> escribirEnElFichero();
                case 3 -> eliminarFichero();
                case 4 -> leerFichero();
                default -> System.out.println("Opción incorrecta inténtelo de nuevo");
            }
            System.out.println("¿Qué quieres hacer?\n1-Crear un fichero.\n2-Escribir en un fichero.\n3-Borrar un fichero.\n4-Leer fichero.\n0-Para salir ");
            numero = teclado.nextInt(); teclado.nextLine();
        }

    }

}
