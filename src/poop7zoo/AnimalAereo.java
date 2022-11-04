/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author Elián
 */
public class AnimalAereo extends Animal {
    private int numAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }
    
    /**
     * Método que muestra el número de alas de un animal aereo
     * @return Regresa el número de alas de un animal aereo
     */

    public int getNumAlas() {
        return numAlas;
    }
    
    /**
     * Método que modifica el número de alas de un animal aereo
     * @param numAlas El número de alas
     */

    public void setNumAlas(int numAlas) {
        if(numAlas < 0)
            numAlas = 0;
        this.numAlas = numAlas;
    }
    
    /**
     * Método de sobreescritura del método comer
     */

    @Override
    public void Comer() {
        super.Comer(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    /**
     * Método que muestra cuando un animal vuela
     */
    
    public void Volar(){
        System.out.println("El animal vuela");
    }
    
    /**
     * Método que muestra en formato los datos del animal aereo
     * @return Regresa todos los datos del animal aereo
     */

    @Override
    public String toString() {
        return "AnimalAereo{"+ super.toString() + "numAlas=" + numAlas + '}';
    }
    
       
}
