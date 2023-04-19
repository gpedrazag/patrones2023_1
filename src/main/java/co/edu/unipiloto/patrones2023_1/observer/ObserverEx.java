/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.observer;

/**
 *
 * @author SG701-21
 */
public class ObserverEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear observadores
        
        Observer ob1=new Observer();
        Observer ob2=new Observer();
        Subject sub1=new Subject();
        //Registrar un observador
        System.out.println("Registrando un observador ");
        sub1.register(ob1);
        
        //Cambiar estado de flag
        System.out.println("Estado flag "+sub1.getFlag());
        sub1.setFlag(1);
        System.out.println("Estado flag "+sub1.getFlag());
        
        //suscribir otro observador
        System.out.println("Registrando un observador 2");
         sub1.register(ob2);
         
         //Cambiar estado de flag
        System.out.println("Estado flag "+sub1.getFlag());
        sub1.setFlag(2);
        System.out.println("Estado flag "+sub1.getFlag());
        //Des suscribirse
        
        sub1.unregister(ob1);
        
          //Cambiar estado de flag
        System.out.println("Estado flag "+sub1.getFlag());
        sub1.setFlag(3);
        System.out.println("Estado flag "+sub1.getFlag());
        
        
    }
    
}
