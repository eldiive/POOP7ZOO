/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author Elián
 */
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String nombre, String lugarOrigen, String color, int numAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numAlas);
        this.tipoPico = tipoPico;
    }
    
    /**
     * Método que muestra el tipo de pico de un pájaro
     * @return Regresa el tipo de pico de un pájaro
     */

    public String getTipoPico() {
        return tipoPico;
    }
    
    /**
     * Método que modifica el tipo de pico de un pájaro
     * @param tipoPico El tipo de pico
     */

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    
    }
    
    /**
     * Método que muestra cuando un pájaro recolecta ramas
     */
    
    public void recolectarRamas(){
        System.out.println("Recolecta ramas");
    }
    
    /**
     * Método que muestra en formato los datos del pajaro
     * @return Regresa todos los datos de un pájaro
     */

    @Override
    public String toString() {
        return "Pajaro{" + super.toString() + "tipoPico=" + tipoPico + '}';
    }
    
    
    
    
    
}
