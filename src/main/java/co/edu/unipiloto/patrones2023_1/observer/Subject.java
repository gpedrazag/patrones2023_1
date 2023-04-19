/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.observer;

import java.util.ArrayList;

/**
 *
 * @author SG701-21
 */
public class Subject implements ISubject {

    //Declarar estruxctura para manejar suscriptores
    private ArrayList<Observer> observerList;
    //Atributo con estado
    private int flag;

    //Constructor

    public Subject() {
        this.observerList=new ArrayList <Observer>();
        this.flag=0;
    }
    
    
    
    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        //Indica que el estado del flag cambio
        this.flag = flag;
        //Cambio el estado de flag. Notificar a los observadores el cambio de estado
        notifyObservers();
    }
    
    
    
    
    @Override
    public void register(Observer ob) {
        
        observerList.add(ob);
    }

    @Override
    public void unregister(Observer ob) {
        observerList.remove(ob);
        
    }

    @Override
    public void notifyObservers() {
        
        for (int i=0; i<observerList.size(); i++)
            observerList.get(i).update();
        
    }
    
    
    
}
