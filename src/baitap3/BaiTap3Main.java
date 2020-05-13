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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory sf = new ShapeFactory();
        Shape shape = sf.createShape(ShapeType.rectangle);
        System.out.println(shape.draw());
        
        Shape shape1 = sf.createShape(ShapeType.cicrle);
        System.out.println(shape1.draw());
        
        Shape shape2 = sf.createShape(ShapeType.triangle);
        System.out.println(shape2.draw());
        
        
    }
    
}
