/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.decorator;

/**
 *
 * @author SG701-21
 */
public class AbstractDecorator extends Component {

    //Constructor aceptando el componente
    public AbstractDecorator(Component componente) {
        this.componente = componente;
    }
    
    //Atributos
    protected Component componente;
    //protected ConcreteComponent componente;
    
    @Override
    public long doJob(long valor) {
        if(componente!=null)
            return componente.doJob(valor);
        return -1;
    }

    public void setComponente(Component componente) {
        this.componente = componente;
    }
    
    
}
