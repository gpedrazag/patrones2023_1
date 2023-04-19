/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.templateMethod;

/**
 *
 * @author SG701-21
 */
public abstract class BasicasIngenieria {

    //Declarar metodo con algoritmo principal para mostrar las asignaturas basicas en ingenieria
    public void mostrarMalla() {
        //Asignaturas comunes
        cursoMatematicas();
        cursoCalculo();
        cursoFisica();

        //Asignaturas especificas
        cursosEspecificos();
    }

    private void cursoMatematicas() {
        System.out.println("Basica Ingeniera: Curso de matematicas");

    }

    private void cursoCalculo() {
        System.out.println("Basica Ingeniera: Curso de calculo");
    }

    private void cursoFisica() {
        System.out.println("Basica Ingeniera: Curso de fisica");
    }

    public abstract void cursosEspecificos();
    
   
}
