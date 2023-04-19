/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.templateMethod;

/**
 *
 * @author SG701-21
 */
public class Telecomunicaciones extends BasicasIngenieria{

    @Override
    public void cursosEspecificos() {
        System.out.println("Cursos especificos Telecomunicaciones");
        cursoSenalesCircuitos();
        cursoCircuitosRadioElectricos();
    }

    private void cursoSenalesCircuitos() {
        System.out.println("Telecomunicaciones. Curso específico: Senales y circuitos");
    }

    private void cursoCircuitosRadioElectricos() {
        System.out.println("Telecomunicaciones. Curso específico: Circuitos Radio Electricos");
    }

   
}
