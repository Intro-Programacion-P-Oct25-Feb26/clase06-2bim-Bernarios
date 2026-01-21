/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danielrios
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        boolean bandera = true;
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int resultado = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2,resultado);
    }
    public static int ingresarValor(){
        int valor = 0;
        
        try  {
            boolean bandera =  true; 
            while(bandera) {
                System.out.println("Ingrese valor 1:");
                valor = entrada.nextInt();
                if (valor < 0 && valor %2 == 1){
                    thro new Exception("valor no valido");
                   
                }
                bandera = false;
            }
        }catch (Exceotion e){
            System.out.printf("hay un error tipo %s\n",e)
        }    
        resur
    public static void imprimir(){
        
    }
    public static int obtenerSuma(){
        
    }
}
