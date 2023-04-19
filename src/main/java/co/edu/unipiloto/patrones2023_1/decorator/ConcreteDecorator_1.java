/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.decorator;

/**
 *
 * @author SG701-21
 */
public class ConcreteDecorator_1  extends AbstractDecorator{

    public ConcreteDecorator_1(Component componente) {
        super(componente);
    }

    

    //Metodo hacer trabajo
    public long doJob(long valor) {
        System.out.println("Comportamiento extendido previo 1");
        long resultado=super.doJob(valor);
        //Agregando comportamiento del decorador
        System.out.println("El resultado modulo 6 es "+moduloSeis(resultado));
        System.out.println("Comportamiento extendido posterior 1");
        return resultado;
    }
    
    private long moduloSeis(long valor){
        return valor%6;
    }
}
