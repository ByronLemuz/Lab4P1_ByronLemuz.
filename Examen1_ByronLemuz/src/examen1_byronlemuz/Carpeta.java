/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_byronlemuz;

import java.util.ArrayList;

/**
 *
 * @author lesly
 */
public class Carpeta extends Fichero {
  // Atributo adicional
    private ArrayList<Fichero> listaFicheros;

    // Constructor
    public Carpeta(int tamano, String fechaCreacion, String usuarioCreador, String nombreFichero, Carpeta carpeta, ArrayList<Fichero> listaFicheros) {
        // Llamar al constructor de la superclase
        super(tamano, fechaCreacion, usuarioCreador, nombreFichero, carpeta);
        this.listaFicheros = listaFicheros;
    }

    // Método get adicional
    public ArrayList<Fichero> getListaFicheros() {
        return listaFicheros;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Carpeta: " + getNombreFichero());
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Fecha de creación: " + getFechaCreacion());
        System.out.println("Usuario creador: " + getUsuarioCreador());
        System.out.println("Carpeta a la que pertenece: " + getCarpeta().getNombreFichero());
        System.out.println("Lista de ficheros:");

        for (Fichero f : listaFicheros) {
            f.mostrarInformacion();
            System.out.println();
        }
    }
}
