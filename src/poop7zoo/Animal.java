/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author poo01alu34
 */
public class Animal {
    private String nombre, lugarOrigen, color; 

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    /**
     * Método que muestra el nombre del animal
     * @return Regresa el nombre del animal
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que muestra el origen del animal
     * @return Regresa el lugar de origen del animal
     */

    public String getLugarOrigen() {
        return lugarOrigen;
    }
    
    /**
     * Método que muestra el color del animal
     * @return Regresa el color del animal
     */

    public String getColor() {
        return color;
    }
    
    /**
     * Método que modifica el nombre del animal
     * @param nombre El nombre del animal
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que modifica el origen del animal
     * @param lugarOrigen  El lugar de origen
     */

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    
    /**
     * Método que modifica el color del animal
     * @param color El color del animal
     */

    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Método que muestra el sonido del animal 
     */
    
    public void Sonido(){
        System.out.println("Sonido de animal");
    }
    
    /**
     * Método que muestra que el animal come 
     */
    
    
    public void Comer(){
        System.out.println("El animal come");
    }
    
    /**
     * Método que muestra en formato los datos del animal
     * @return Regresa todos los datos de un animal 
     */

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
    
    
    
}
