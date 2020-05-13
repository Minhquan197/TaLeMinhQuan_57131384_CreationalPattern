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
public class Circle extends Shape{
    private static Circle instance;

    public Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    

    @Override
    public String draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(instance==null)
            return "Hình tròn " + brush + paper + frame;
        else return " ";
    }
    
}
