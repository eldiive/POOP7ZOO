/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author Elián
 */
public class Ballena extends AnimalAcuatico {
    private int largo; 

    public Ballena() {
    }

    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas, int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }
    
    /**
     * Método que muestra el largo de una ballena
     * @return Regresa el largo de una ballena
     */

    public int getLargo() {
        return largo;
    }
    
    /**
     * Método que modifica el largo de una ballena 
     * @param largo El largo de una ballena
     */

    public void setLargo(int largo) { 
        if(largo < 0)
            largo = 0;
        this.largo = largo;
    }
    
    /**
     * Método que muestra cuando la ballena se rifa un tiro con pinocho
     */
    
    public void peleaConPinocho(){
        System.out.println("Se rifa un tiro con Pinocho");
    }
    
    /**
     * Método que muestra en formato los datos de la ballena
     * @return Todos los datos de una ballena 
     */

    @Override
    public String toString() {
        return "Ballena{" + super.toString() + "largo=" + largo + '}';
    }
       
}
