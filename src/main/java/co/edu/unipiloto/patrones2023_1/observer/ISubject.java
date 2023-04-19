/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.observer;

/**
 *
 * @author SG701-21
 */
public interface ISubject {
    
    public void register (Observer ob);
    public void unregister (Observer ob);
    public void notifyObservers ();
    
    
    
}
