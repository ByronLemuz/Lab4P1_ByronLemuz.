/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_byronlemuz;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author lesly
 */
public class MatrizOrdenadabycol {
    public static int[][] matrizOrdenadaByCol(int[][] matriz) {
    int m = matriz.length;
    int n = matriz[0].length;
    int[][] matrizOrdenada = new int[n][m];

    for (int j = 0; j < m; j++) {
        int[] columna = new int[n];
        for (int i = 0; i < n; i++) {
            columna[i] = matriz[i][j];
        }
        Arrays.sort(columna);
        for (int i = 0; i < n; i++) {
            matrizOrdenada[i][j] = columna[i];
        }
    }
    return matrizOrdenada;
    
    }
}
