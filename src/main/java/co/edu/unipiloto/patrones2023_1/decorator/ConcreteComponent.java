/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.decorator;

/**
 *
 * @author SG701-21
 */
public class ConcreteComponent extends Component {

    @Override
    public long doJob(long valor) {
               
        System.out.println("Ejecutando desde un objeto componente concreto");
        long fact=factorial(valor);
        System.out.println("Factorial de "+valor+" igual a "+fact);
        return fact;
    }
    
    public long factorial (long valor){
        if (valor==0) 
            return 1;
        return valor*factorial(valor-1);
    }
    
}
