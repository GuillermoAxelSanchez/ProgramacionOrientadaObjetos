/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.personas;

/**
 *
 * @author HP
 */
public class Persona {
    private String nombre;
    private int edad;
    private int genero;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, int genero, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        String generoPalabra;
        switch (genero) {
            case 1:
                generoPalabra="Masculino";
                this.genero = genero;
                break;
            case 0:
                generoPalabra="Femenino";
                this.genero = genero;
                break;
            default:
                System.out.println("Digite un genero 1=Masculino 0=Femenino");
                 this.genero = 2;
                break;
        }
        
    }

    @Override
    public String toString() {
        String generoPalabras;
        switch (genero) {
            case 0:
                generoPalabras="Femenino";
                break;
            case 1:
                generoPalabras="Maculino";
                break;
            default:
                generoPalabras="Digite un genero correctamente 1=Masculino 0=Femenino";
                break;
        }
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + generoPalabras + ", altura=" + altura + '}';
    }
    
    
}
