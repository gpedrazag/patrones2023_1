/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.decorator;

/**
 *
 * @author SG701-21
 */
public class ConcreteDecorator_2 extends AbstractDecorator {
    //Constructor
    
    public ConcreteDecorator_2(Component componente) {
        super(componente);
    }

    public long doJob(long valor) {
        System.out.println("Comportamiento extendido previo 2 ");
        long resultado=super.doJob(valor);
        //Agregando comportamiento del decorador
        System.out.println("El resultado modulo 7 es "+moduloSiete(resultado));
        System.out.println("Comportamiento extendido posterior 2");
        return resultado;
    }
    
    private long moduloSiete(long valor){
        return valor%7;
    }
}
