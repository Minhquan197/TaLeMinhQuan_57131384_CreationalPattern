/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author ASUS
 */
public abstract class Shape {
    protected String brush, paper, frame;
    
    public abstract String draw();

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Shape{" + "brush=" + brush + ", paper=" + paper + ", frame=" + frame + '}';
    }
    
    
    
    
}
