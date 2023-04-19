/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.proxy_youtube;

/**
 *
 * @author SG701-21
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib {

    //Declara atributo de clase servicio
    ThirdPartyYouTubeClass servicio;
    
    
    @Override
    public void listVideos() {
        System.out.println("Ejecutando proxy: voy a invocar servicio de listar video");
        //Verificar si el servicio se ha instanciado
        if(servicio==null)
            servicio=new ThirdPartyYouTubeClass();
        // invocar el servicio solicitado
        servicio.listVideos();
    }

    @Override
    public String getInfo(int id) {
        //Verificar si el servicio se ha instanciado
        if(servicio==null)
            servicio=new ThirdPartyYouTubeClass();
        return servicio.getInfo(id);
    }

    @Override
    public void downloadVideo(int id) {
        //Verificar si el servicio se ha instanciado
        if(servicio==null)
            servicio=new ThirdPartyYouTubeClass();
        servicio.downloadVideo(id);
    }
  
    
}
