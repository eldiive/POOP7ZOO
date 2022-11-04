/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author Elián
 */
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Método que muestra el número de aletas de un animal acuático
     * @return Regresa el número de aletas
     */

    public int getNumeroAletas() {
        return numeroAletas;
    }
    
    /**
     * Método que modifica el número de aletas de un animal acuático
     * @param numeroAletas El número de aletas 
     */

    public void setNumeroAletas(int numeroAletas) {
        if(numeroAletas <= 0)
            numeroAletas = 0; 
        this.numeroAletas = numeroAletas;
       
    }
    
    /**
     * Método de sobreescritura del método comer
     */
    
    @Override
    public void Comer(){
        System.out.println("El animal acuatico come");
    }
    
    /**
     * Método que muestra que el animal nada
     */
    
    
    public void Nadar(){
        System.out.println("El animal nada");
    }
    
    /**
     * Método que muestra en formato los datos del anima acuático
     * @return Regresa todos los datos de un animal acuático
     */
    
    
    @Override
    public String toString() {
        return "AnimalAcuatico{" + super.toString() + "numeroAletas=" + numeroAletas + '}';
    }
    
    
}
