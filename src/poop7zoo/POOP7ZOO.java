/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop7zoo;

/**
 *
 * @author poo01alu34
 */
public class POOP7ZOO {

    /**
     * Clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Perro perro = new Perro();
        perro.setColor("Negro");
        perro.setColorCollar("Rojo");
        perro.setLugarOrigen("Mexico");
        perro.setNombre("Gigi");
        perro.setNumPatas(4);
        System.out.println(perro);
        perro.Correr();
        perro.Comer();
        perro.Sonido();
        perro.hacerTrucos();
        System.out.println("------------------------------------------------");
        Ballena ballena = new Ballena();
        ballena.setColor("Azul");
        ballena.setLargo(23);
        ballena.setLugarOrigen("Mexico");
        ballena.setNombre("Frida");
        ballena.setNumeroAletas(3);
        System.out.println(ballena);
        ballena.Comer();
        ballena.Sonido();
        ballena.Nadar();
        ballena.peleaConPinocho();
        System.out.println("------------------------------------------------");
        Pajaro pajaro = new Pajaro("Pancho", "Mexico", "Rojo", 2, "picudo");
        System.out.println(pajaro);
        pajaro.Comer();
        pajaro.Sonido();
        pajaro.Volar();
        pajaro.recolectarRamas();
         
        
        
       
      
        
        
    }
    
}
