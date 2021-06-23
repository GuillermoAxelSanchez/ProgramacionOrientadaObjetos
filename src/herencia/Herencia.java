/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.personas.Alumno;

/**
 *
 * @author HP
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alm1 = new Alumno();
        System.out.println(alm1.toString());
        alm1.setNombre("Memo");
        alm1.setEdad(19);
        //genero binario 1=Masculino  0=femenino  else=digite uno correctamente REVISAR CONDICIONAES EN CLASE PERSONA
        alm1.setGenero(1);
        alm1.setAltura(1.70f);

        alm1.setNumeroCuenta("421025804");
        alm1.setCarrera("Ing. en computacion");
        alm1.setSemestre(6);
        System.out.println(alm1.toString());
        
        Alumno alm2= new Alumno("421025805", "Economía", 1);
        System.out.println(alm2.toString());
        alm2.setNombre("Monse");
        alm2.setAltura(1.6f);
        //genero binario 1=Masculino  0=femenino  else=digite uno correctamente
        alm2.setGenero(0);
        alm2.setEdad(19);
        System.out.println(alm2.toString());
    }

}
