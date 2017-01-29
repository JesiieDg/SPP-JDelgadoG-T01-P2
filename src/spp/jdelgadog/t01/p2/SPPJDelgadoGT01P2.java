/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.t01.p2;
import java.util.Scanner;
//Jessica Delgado González A01411536 IMT
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculaora de perímetros y superficies");
        // Variables. Jessica Delgado González A01411536 IMT
        double base, altu, sup, per;
        //Indicador de que usaremos teclado. Jessica Delgado González A01411536 IMT
        Scanner teclado=new Scanner (System.in);
        //Asignar valores a las variables. Jessica Delgado González A01411536 IMT
        System.out.println("Introduce la altura");
        altu=teclado.nextDouble();
        System.out.println("Introduce la base");
        base=teclado.nextDouble();
        //Resolvemos el problema. Jessica Delgado González A01411536 IMT
        per=(2*base)+(2*altu);
        sup=base*altu;
        //Mostrar el resultado. Jessica Delgado González A01411536 IMT
        System.out.println("La superficie es "+sup);
        System.out.println("El perímetro es "+per);
                
    }
    
}
