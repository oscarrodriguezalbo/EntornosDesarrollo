/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamened;

import java.util.Scanner;

/**
 *
 * @author oralb
 */
public class EjercicioExamenED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc, numero;
        
        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Cambio de horas a segundos");
            System.out.println("2. Cambio de kilometros a metros");
            System.out.println("3. Salir");
            opc = teclado.nextInt();
            System.out.println("Indique el numero: ");
            switch (opc){
                case 1:
                    numero = teclado.nextInt();
                    numero = numero * 3600;
                    break;
                case 2:
                    numero = teclado.nextInt();
                    numero = numero * 1000;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }            
        } while (opc != 3);         
        
    }
    
}
