/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_byronlemuz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Examen1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Crear la carpeta raíz con los datos iniciales que quieras
    Carpeta carpetaRaiz = new Carpeta(100, "01/01/2020", "admin", "C:", null, new ArrayList<Fichero>());
    // Crear la referencia a la carpeta actual
    Carpeta carpetaActual = carpetaRaiz;
    // Crear el Scanner para leer la entrada del usuario
    Scanner sc = new Scanner(System.in);
    // Crear una variable para almacenar la opción del usuario
    int opcion = 0;
    // Crear un bucle que se repita hasta que el usuario ingrese la opción 0 para salir
    do {
      // Mostrar el menú
      System.out.println("MENU");
      System.out.println("a- Sistema de archivos");
      System.out.println("1- Entrar en una Subcarpeta");
      System.out.println("2- Regresar carpeta anterior");
      System.out.println("3- Crear un archivo");
      System.out.println("4- Crear una carpeta");
      System.out.println("5- Listar directorio Actual");
      System.out.println("6- Listar todo el File System");
      System.out.println("b- Probar el método recursivo");
      System.out.println("0- Salir");
      // Leer la opción del usuario
      opcion = sc.nextInt();
      // Usar un switch para ejecutar la acción correspondiente a cada opción
      switch (opcion) {
        case 1:
          // Pedir el nombre de la subcarpeta a la que quiere entrar
          System.out.println("Ingrese el nombre de la subcarpeta:");
          String nombreSubcarpeta = sc.next();
          // Buscar si existe en la lista de ficheros de la carpeta actual
          Fichero subcarpeta = null;
          for (Fichero f : carpetaActual.getListaFicheros()) {
            if (f.getNombreFichero().equals(nombreSubcarpeta)) {
              subcarpeta = f;
              break;
            }
          }
          // Si existe y es una instancia de Carpeta, actualizar la referencia de carpetaActual con la subcarpeta
          if (subcarpeta != null && subcarpeta instanceof Carpeta) {
            carpetaActual = (Carpeta) subcarpeta;
            System.out.println("Entraste en la subcarpeta " + nombreSubcarpeta);
          } else {
            // Si no existe o no es una Carpeta, mostrar un mensaje de error
            System.out.println("No se encontró la subcarpeta " + nombreSubcarpeta);
          }
          break;
        case 2:
          // Verificar si la carpeta actual es la carpeta raíz
          if (carpetaActual == carpetaRaiz) {
            // Si lo es, llamar al método recursivo con la carpeta raíz como parámetro
            matrizOrdenadaByCol(carpetaRaiz, 0, 0);
          } else {
            // Si no lo es, actualizar la referencia de carpetaActual con la carpeta a la que pertenece
            carpetaActual = (Carpeta) carpetaActual.getCarpeta();
            System.out.println("Regresaste a la carpeta anterior");
          }
          break;
        case 3:
          // Pedir los datos del archivo a crear
          System.out.println("Ingrese el tamaño del archivo:");
          int tamanoArchivo = sc.nextInt();
          System.out.println("Ingrese la fecha de creación del archivo:");
          String fechaArchivo = sc.next();
          System.out.println("Ingrese el usuario creador del archivo:");
          String usuarioArchivo = sc.next();
          System.out.println("Ingrese el nombre del archivo:");
          String nombreArchivo = sc.next();
                    System.out.println("Ingrese el texto del archivo:");
          String textoArchivo = sc.next();
          // Crear el archivo con los datos ingresados
          Archivo archivo = new Archivo(tamanoArchivo, fechaArchivo, usuarioArchivo, nombreArchivo, carpetaActual, textoArchivo);
          // Añadir el archivo a la lista de ficheros de la carpeta actual
          carpetaActual.getListaFicheros().add(archivo);
          System.out.println("Se creó el archivo " + nombreArchivo);
          break;
        case 4:
          // Pedir los datos de la carpeta a crear
          System.out.println("Ingrese el tamaño de la carpeta:");
          int tamanoCarpeta = sc.nextInt();
          System.out.println("Ingrese la fecha de creación de la carpeta:");
          String fechaCarpeta = sc.next();
          System.out.println("Ingrese el usuario creador de la carpeta:");
          String usuarioCarpeta = sc.next();
          System.out.println("Ingrese el nombre de la carpeta:");
          String nombreCarpeta = sc.next();
          // Crear la carpeta con los datos ingresados y una lista vacía de ficheros
          Carpeta carpeta = new Carpeta(tamanoCarpeta, fechaCarpeta, usuarioCarpeta, nombreCarpeta, carpetaActual, new ArrayList<Fichero>());
          // Añadir la carpeta a la lista de ficheros de la carpeta actual
          carpetaActual.getListaFicheros().add(carpeta);
          System.out.println("Se creó la carpeta " + nombreCarpeta);
          break;
        case 5:
          // Listar el directorio actual llamando al método mostrarInformacion de la carpeta actual
          carpetaActual.mostrarInformacion();
          break;
        case 6:
          // Listar todo el file system llamando al método mostrarInformacion de la carpeta raíz
          carpetaRaiz.mostrarInformacion();
          break;
        case 0:
          // Salir del programa
          System.out.println("Gracias por usar el sistema de archivos.");
          break;
        default:
          // Mostrar un mensaje de error si la opción no es válida
          System.out.println("Opción inválida. Intente de nuevo.");
      }
    } while (opcion != 0);
    // Cerrar el Scanner
    sc.close();
  }


            public static void matrizOrdenadaByCol(Carpeta matriz, int fila, int col) {
        if (col == matriz[0].length) {
            return;
        }
        // Caso base: si se llega a la última fila, pasa a la siguiente columna
        if (fila == matriz.length) {
            matrizOrdenadaByCol(matriz, 0, col + 1);
            return;
        }
        // Variable que almacena el índice de la fila con el menor valor en la columna actual
        int minIndex = fila;
        // Recorre las filas restantes de la columna actual
        for (int i = fila + 1; i < matriz.length; i++) {
            // Si se encuentra un valor menor, se actualiza minIndex
            if (matriz[i][col] < matriz[minIndex][col]) {
                minIndex = i;
            }
        }

        int temp = matriz[fila][col];
        matriz[fila][col] = matriz[minIndex][col];
        matriz[minIndex][col] = temp;

        matrizOrdenadaByCol(matriz, fila + 1, col);
    }
 
            
        }
    
    

