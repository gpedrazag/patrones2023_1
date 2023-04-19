/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.proxy_youtube;

/**
 *
 * @author SG701-21
 */
public class youtubeEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciar un objeto proxy
        CachedYouTubeClass proxy=new CachedYouTubeClass();
        proxy.downloadVideo(4);
        
        
    }
    
}
