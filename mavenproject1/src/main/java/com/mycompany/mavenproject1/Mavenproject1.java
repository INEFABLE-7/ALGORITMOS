/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("#SISTEMA DE ORDEDNAR NUMEROS INGRESADOS AL AZAR");
        
        Scanner jean= new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("INGRESE 5 NUMEROS AL AZAR: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = jean.nextInt();
        }
        // ESTE ES UN FUNCION DE LOGARITMO PARA ORDENAR DATOS INGRESADOS EN ESTE CASO NUMEROS
        int n = numeros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
        
                
        }
        
    }
}
    }