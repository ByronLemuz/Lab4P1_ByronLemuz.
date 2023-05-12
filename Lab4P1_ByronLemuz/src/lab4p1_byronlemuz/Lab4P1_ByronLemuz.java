/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_byronlemuz;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class Lab4P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
        Scanner lea = new Scanner(System.in);
        int elbicho;

        
        while (opcion != 4) {
            System.out.println("------------Menú de Ejercicios\n -------------");
            System.out.println("1. Intercambio ");
            System.out.println("2. Cifrado cesar ");
            System.out.println("3. Digito Solitario");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción:  ");
            elbicho = lea.nextInt();
            switch (elbicho) {
                case 1:
                    int continuar=1;
             
                    while (continuar ==1) {
                        System.out.println("Ingrese el string:  ");
                        String enter=lea.nextline();
                        System.out.println("Ingrese la frecuencia de intercmabio:  ");
                        int b = lea.nextInt();
                        String output = intercambiar(enter, b);
                        System.out.println("Output: " + output);
                        System.out.println("¿Desea continuar con otro string?: ");
                        continuar = lea.nextInt();
                        lea.nextLine();
                        
                                }
     
                    break;

                case 2:
                    
        System.out.print("Ingrese N: ");
        String n = lea.next();
        int solitario = 0;
        int soledad = Integer.MAX_VALUE;
        for (int i = 0; i < n.length(); i++) {
            int suma = 0;
            int digito = n.charAt(i) - '0';
            for (int j = 1; j <= digito; j++) {
                if (i - j >= 0) {
                    suma += n.charAt(i - j) - '0';
                }
                if (i + j < n.length()) {
                    suma += n.charAt(i + j) - '0';
                }
            }
            if (suma < soledad) {
                solitario = digito;
                soledad = suma;
            }
        }
        System.out.println("El número más solitario es el " + solitario + " porque su nivel de soledad es " + soledad);
            }


                      
                         
                    break;
                case 3:
                   
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }

            public static String intercambiar(String enter, int b) {
            for (int i = 0; i < enter.length(); i += b) {
            int fin = Math.min(i + b, enter.length());
            String sub = enter.substring(i, fin);
            if (sub.length() == b) {
               b.append(new StringBuilder(sub).reverse());
            } else {
                b.append(sub);
            }
        
        return b.toString();
        
        }
                  
            
        
        
        
    

    
        

