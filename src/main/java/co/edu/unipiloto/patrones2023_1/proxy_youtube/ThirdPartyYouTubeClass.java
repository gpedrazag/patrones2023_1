/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.proxy_youtube;

/**
 *
 * @author SG701-21
 */
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    
    
    //Debe implmeentar los metodos definidos en la interface
    public void listVideos(){
        System.out.println("Listando los videos");
    }
    public String getInfo (int id){
            return "Video de prueba "+id;
    }
                    
                    
    public void downloadVideo(int id){
        System.out.println("Descargando el video "+id);
    }
    
}
