package Ejercicios.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ficheros {

    static String ruta = "src\\main\\java\\Ejercicios\\ficheros\\";
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        crearFichero();
        escribirEnElFichero();
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
                teclado.close();
            } catch (IOException e) {
                System.out.println("No se ha podido cerrar correctamente " + e.getMessage());
            }
        }
    }
}
