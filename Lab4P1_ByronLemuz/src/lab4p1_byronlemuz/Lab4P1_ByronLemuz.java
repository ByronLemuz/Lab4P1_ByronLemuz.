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

        
        while (opcion!= 4) {
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
                        String enter=elbicho.nextline();
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
                    System.out.println(" Ingrese N: ");
                    String imput=elbicho.nextLine();
                    int[]digtos =new int (imput.length());
                    for (int i = 0; i < imput.length(); i++) {
                        digitos[i]= Character.getnumericValue(imput.charAt(i));
                       
                    }
                    int solito = -1;
                    int soledadmin = Integer.MAX_VALUE;
                    for (int i = 0; i < digitos.lenght; i++) {
                      int soledad=0;
                        for (int j = i-digitos[i]; j <=i + digitos[i]; j++) {
                            if (j >= 0 && j <digitos.lenght && j != i) {
                                soledad += digitos[j];
                                
                            }
                        
                         if (Solito < soledadmin) {
                             Soledadmin 0 soledad;
                             solitario = digitos[i];
                            
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
            }}}}}
            public static String intercambiar(String enter, int b) {
            for (int i = 0; i < input.length(); i += n) {
            int fin = Math.min(i + n, input.length());
            String sub = input.substring(i, end);
            if (sub.length() == n) {
               x.append(new StringBuilder(sub).reverse());
            } else {
                x.append(sub);
            }
        
        return x.toString();
        
        }
                
            
        
        
        
    

    
        

