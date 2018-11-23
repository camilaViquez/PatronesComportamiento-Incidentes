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


/**
 *
 * @author Leonardo Mata
 */
public class Mapear extends MapView {
    private Map map;
    public Mapear() {
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
                    map.setCenter(new LatLng(9.86444, -83.9194412));
                    map.setZoom(11.0);
                    
                    
                    Marker mark = new Marker(map);
                    mark.setPosition(map.getCenter());
                    
                    final InfoWindow window = new InfoWindow(map);
                    window.setContent("Cartago!");
                    window.open(map, mark);
                    
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(9.9333296, -84.0833282));
                    map.setZoom(11.0);
                    
                    final InfoWindow window2 = new InfoWindow(map);
                    window2.setContent("San Jose!");
                    window2.open(map, mark);
                    //Cartago:9.86444, -83.9194412
                    //San Jose:	9.9333296, -84.0833282
                    //Alajuela:10.0162500, 10.0162500
                    //Limon:9.9907398, -83.0359573
                    //Puntarenas: 9.9762497, -84.8383636
                    //Guanacaste:10.4958, -85.3550
                    //Heredia:10.0023600, -84.1165100
                }
            }
            
        });

    }
    
}