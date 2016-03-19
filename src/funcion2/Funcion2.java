/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcion2;

import java.util.Scanner;

/**
 *
 * @author MauricioGabriel
 */
public class Funcion2 {

    final static int N=8;
    public static void main(String[] args) {
        int[] numeros = new int[N];
        ingresar(numeros);
        muestra(numeros);
    }
    public static void ingresar(int[] x){
        int i;
        Scanner intro = new Scanner(System.in);
        for(i=0;i<N;i++){
            System.out.println("Ingrese un nº para la celda " + i);
            x[i] = intro.nextInt();
        }
    }
    public static void muestra(int[] x){
        int i;
        System.out.println("Números en el arreglo");
        for(i=0;i<N;i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
    
}
