/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.templateMethod;

/**
 *
 * @author SG701-21
 */
public class Sistemas extends BasicasIngenieria {

    
    
    
    @Override
    public void cursosEspecificos() {
        System.out.println("Cursos especificos Sistemas");
        cursoCienciasComputacion();
        cursoPatrones();
    }

    private void cursoCienciasComputacion() {
        System.out.println("Especificas Ingenieria Sistemas: Ciencias de computacion");
    }
    
    private void cursoPatrones() {
        System.out.println("Especificas Ingenieria Sistemas: Patrones");
    }
    
    
    
}
