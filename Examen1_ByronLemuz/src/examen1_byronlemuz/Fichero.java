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
public  abstract class Fichero {
   
    // Atributos
    private int tamano;
    private String fechaCreacion;
    private String usuarioCreador;
    private String nombreFichero;
    private Carpeta carpeta;

    // Constructor
    public Fichero(int tamano, String fechaCreacion, String usuarioCreador, String nombreFichero, Carpeta carpeta) {
        // Validar que el tamaño esté entre 0 y 1024
        if (tamano < 0 || tamano > 1024) {
            throw new IllegalArgumentException("El tamaño debe estar entre 0 y 1024");
        }
        this.tamano = tamano;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreador = usuarioCreador;
        this.nombreFichero = nombreFichero;
        this.carpeta = carpeta;
    }

    // Métodos get
    public int getTamano() {
        return tamano;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public Carpeta getCarpeta() {
        return carpeta;
    }

    // Método abstracto para mostrar la información del fichero
    public abstract void mostrarInformacion();
}


    



    
