/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_byronlemuz;

/**
 *
 * @author lesly
 */
public class Archivo extends Fichero{
 private String texto;

    public Archivo(int tamano, String fechaCreacion, String usuarioCreador, String nombreFichero, Carpeta carpeta, String texto) {
        super(tamano, fechaCreacion, usuarioCreador, nombreFichero, carpeta);
        this.texto = texto;
    }

    // Método get adicional
    public String getTexto() {
        return texto;
    }

// Sobrescribir el método mostrarInform
@Override
public void mostrarInformacion() {
// Imprimir los datos del archivo
System.out.println("Archivo: " + getNombreFichero());
System.out.println("Tamaño: " + getTamano());
System.out.println("Fecha de creación: " + getFechaCreacion());
System.out.println("Usuario creador: " + getUsuarioCreador());
System.out.println("Carpeta a la que pertenece: " + getCarpeta().getNombreFichero());
System.out.println("Texto contenido: " + texto);
}
}
