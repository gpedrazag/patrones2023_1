/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.singleton;

/**
 *
 * @author SG701-21
 */
public class Capitan {
    //Crear objeto estático
    private static  Capitan miCapi;
    
    //atributos
    private String nombre;
    private String posicion;
    private int numero;
    
    //Constructor

    private Capitan() {
        this.nombre="Pedro Perez";
        
        
    }

    private Capitan(String nombre, String posicion, int numero) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
    }

    
    
    //Get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //Metodos de negocio
    
    public static Capitan getCapitan(){
        if (miCapi==null)
        {
            miCapi=new Capitan();
            System.out.println("Instanciando por primera vez");
        }
        else
            System.out.println("Ya existe una instancia y se retorna");
        return miCapi;
    }
    
}
