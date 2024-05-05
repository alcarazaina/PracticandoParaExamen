package Ejercicios.directorios;

import java.io.File;
import java.io.IOException;

public class Directorio {
    public static void main(String[] args) {

        String ruta = "src\\main\\java\\Ejercicios\\directorios\\";

        File directorio = new File(ruta + "directorio");

        boolean creado = directorio.mkdir();

        if(creado){
            System.out.println("Directorio creado correctamente");
        } else {
            System.out.println("Error al crear el directorio");
        }
        File fichero = new File(ruta + "fichero.txt");

        try {
            creado = fichero.createNewFile();
            if (creado){
                System.out.println("Fichero creado correctamente");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero " + e.getMessage());
        }
        File oldFile = new File(ruta + "fichero.txt");
        File newFile = new File(ruta + "directorio\\fichero.txt");
        boolean movido = oldFile.renameTo(newFile);
        if (movido){
            System.out.println("Movido correctamente");
        }else {
            System.out.println("Error");
        }

        newFile.delete();
    }
}
