/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.decorator;

/**
 *
 * @author SG701-21
 */
public class DecoratorPatternEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteComponent cc=new ConcreteComponent();
        //cc.doJob(5);
        ConcreteDecorator_1 cd_1=new ConcreteDecorator_1(cc);
        //cd_1.setComponente(cc);
        //cd_1.doJob(5);
        ConcreteDecorator_2 cd_2=new ConcreteDecorator_2(cd_1);
        //cd_2.setComponente(cc);
        cd_2.doJob(13);
        
                
        
    }
    
}
