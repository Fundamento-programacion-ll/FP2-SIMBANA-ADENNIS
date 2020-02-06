/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author Paul
 */
public abstract class Figura extends Canvas{
    
    @Override
    public abstract void paint(Graphics g);
    
    public abstract void GetArea();
    
    
}
