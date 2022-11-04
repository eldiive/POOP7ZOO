/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author Elián
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar; 

    public Perro() {
    }

    public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numPatas);
        this.colorCollar = colorCollar;
    }
    
    /**
     * Método que muestra el color del collar de un perro
     * @return Ragresa el color del collar de un perro
     */

    public String getColorCollar() {
        return colorCollar;
    }
    
    /**
     * Método que modifica el color del collar de un perro
     * @param colorCollar El color del collar de un perro
     */

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Método que muestra cuando un perro hace trucos
     */
    
    public void hacerTrucos(){
        System.out.println("Se rifa un truco bien pro");
    }
    
    /**
     * Método que muestra en formato los datos del perro
     * @return Regresa todos los detos del perro
     */

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "colorCollar=" + colorCollar + '}';
    }
    
    
    
    
}
