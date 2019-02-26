/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcarrera.modelo;

import java.util.ArrayList;

/**
 *
 * @author Flia. Carrera
 */
public class Puntos {
    private ArrayList puntos= new ArrayList <Puntos>();
    
    public Puntos (){
        
    }
    
    public Punto punto(int i){
        if (i<0 || i>=puntos.size())
            return null; 
        return (Punto) puntos.get(i);
    }
    
}
