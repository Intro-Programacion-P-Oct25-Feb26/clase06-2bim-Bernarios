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
        resultado = obtenerSuma(valor1, valor2);
    }
    public static int ingresarValor(){
        boolean bandera = true;
        
        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt();
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); 
                int resultado = valor1 / valor2;

                System.out.printf("Resultado %d\n", resultado);
                bandera = false;
    }catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);
    public static void imprimir(){
        
    }
    public static int obtenerSuma(){
        
    }
}
