/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author Elián
 */
public class AnimalTerrestre extends Animal{
    private int numPatas;

    public AnimalTerrestre() {
    }
    
    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }
    
    /**
     * Muestra el número de patats de un animal terrestre
     * @return Regresa el número de patas
     */

    public int getNumPatas() {
        return numPatas;
    }
    
    /**
     * Método que modifica el número de patas de un animal Terrestre
     * @param numPatas 
     */

    public void setNumPatas(int numPatas) {
        if (numPatas < 0)
            numPatas = 0;
        this.numPatas = numPatas;
    }
    
    /**
     * Método de sobreescritura del método comer
     */
    
    @Override
    public void Comer(){
        System.out.println("El animal terrestre come");
    }
    
    /**
     * Método que muestra que un animal corre
     */
    
    public void Correr(){
        System.out.println("El animal corre");
    }
    
    /**
     * Método que muestra en formato los datos del anima Terrestre
     * @return Regresa todos los datos del animal terrestre
     */

    @Override
    public String toString() {
        return "AnimalTerrestre{" + super.toString() + "numPatas=" + numPatas + '}';
    }
    
    
}
