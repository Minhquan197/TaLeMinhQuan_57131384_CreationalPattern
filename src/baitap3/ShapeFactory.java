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
public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case rectangle: return new Rectangle("bút lông, ", "giấy A4, ", "tranh, ");
            case cicrle: return new Circle("bút bi, ", "giấy A4, ", "hình in, ");
            case triangle: return new Triangle("Bút chì, ", "giấy nhám, ", "vẽ, ");
        }
        return null;
    }
}
