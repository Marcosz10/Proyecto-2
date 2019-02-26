/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcarrera.modelo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Flia. Carrera
 */
public class PanelPuntos extends JPanel{
     private Puntos puntos;
     private Aristas aristas;
    

/**
*	
*	@param puntos 
*	@param aristas
*/
public PanelPuntos(Puntos puntos, Aristas aristas) { 
    this.puntos = puntos;
    this.aristas = aristas;

    setPreferredSize(new Dimension(400, 400)) ;  
    setBackground(Color.LIGHT_GRAY);
}
 
/**
*	
*	
*/ @Override
public void paintComponent(Graphics g) { super.paintComponent(g);

 int i=0;
Punto p;
while ((p = puntos.punto(i)) != null) 
{ 
    g.drawString(String.valueOf(i), p.x, p.y); i++;
}

 i=0;
Arista a;
while ((a = aristas.arista(i)) != null) { 
    g.drawLine(a.ptoIni.x, a.ptoIni.y, a.ptoFin.x, a.ptoFin.y); 
    i++;
}
}


    
}
