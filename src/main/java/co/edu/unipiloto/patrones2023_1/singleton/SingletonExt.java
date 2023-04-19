/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.singleton;

/**
 *
 * @author SG701-21
 */
public class SingletonExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Capitan primero=Capitan.getCapitan();
       
        System.out.println("Primer capitan "+primero.getCapitan().getNombre());
        //Instanciar segundo capitan
        Capitan segundo=Capitan.getCapitan();
        System.out.println("Es el mismo capitan? "+(primero==segundo));
    }
    
}
