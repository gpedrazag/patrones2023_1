/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unipiloto.patrones2023_1.proxy_youtube;

/**
 *
 * @author SG701-21
 */
public interface ThirdPartyYouTubeLib {
    public void listVideos();
    public String getInfo (int id);
    public void downloadVideo(int id);
}
