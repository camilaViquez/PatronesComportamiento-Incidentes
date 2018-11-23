/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.BorderLayout;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.teamdev.jxmaps.swing.MapView;

import com.teamdev.jxmaps.*;
import javax.swing.JPanel;

import vista.*;
/**
 *
 * @author Leonardo Mata
 */
public class MapaAlajuela extends MapView{

    private Map map;
    private Principal principal;
    public MapaAlajuela(String nName ){
        JFrame frame = new JFrame(nName);
        setOnMapReadyHandler(new MapReadyHandler(){
            @Override
            public void onMapReady(MapStatus status) {
                if(status == MapStatus.MAP_STATUS_OK)
                {
                    //cada vez que quiera crear un mapa nuevo
                    map = getMap();
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(controlOptions);
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(10.0162500, 10.0162500));
                    map.setZoom(11.0);

                    Marker mark = new Marker(map);
                    mark.setPosition(map.getCenter());
                    
                    final InfoWindow window = new InfoWindow(map);
                    window.setContent("Alajuela");
                    window.open(map, mark);
                }
            }
            
        });
        
        frame.add(this,BorderLayout.CENTER);
        frame.setSize(700,500);
        frame.setVisible(true);
        
    
    }
   
}
