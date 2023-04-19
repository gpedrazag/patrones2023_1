/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.templateMethod;

/**
 *
 * @author SG701-21
 */
public class TemplateMethodExt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Referencia de objetos a la clase abstracta
        BasicasIngenieria cursos;
        
        //Instanciar sobre la subclase
        cursos=new Sistemas();
        cursos.mostrarMalla();
        
        //instanciar sobre subclases
        cursos=new Telecomunicaciones();
        cursos.mostrarMalla();
    }
    
}
