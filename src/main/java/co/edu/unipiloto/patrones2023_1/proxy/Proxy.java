/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.proxy;

/**
 *
 * @author SG701-21
 */
public class Proxy extends Servicio {
    
    //Declarar referencia al servicio concreto
    private Servicio servicio;

    @Override
    public void doSomeWork() {
        System.out.println("Ejecutando proxy: voy a invocar servicio");
        if(servicio==null)
            servicio=new ConcreteServicio();
        servicio.doSomeWork();
    }
    
    //Implementacion metodo abstracto
    
}
