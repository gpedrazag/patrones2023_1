/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.decorator2;

/**
 *
 * @author SG701-21
 */
public class BaseDecorator implements IComponent {

    //Atributos
    protected ConcreteComponent wrappee;
    //protected ConcreteComponent componente;

    public BaseDecorator(ConcreteComponent wrappee) {
        this.wrappee = wrappee;
    }
    
    
    
    @Override
    public long doJob(long valor) {
        if(wrappee!=null)
            return wrappee.doJob(valor);
        return -1;
    }

   
    
    
}
