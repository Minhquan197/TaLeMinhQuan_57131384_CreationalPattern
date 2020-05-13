/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author ASUS
 */
public class MyStringBuilder {
    String str = null;

//    protected MyStringBuilder(String str) {
//        this.str = str;
//    }
//    
//    public static class Builder{
//        String str = null;
        
        public MyStringBuilder addString(String s){
            
            str = str + s + " ";
            return this;    
        }
        
        public MyStringBuilder addFloat(float f){
            str = str + f + " ";
            return this;
        }
        
        public MyStringBuilder addBool(boolean b){
            str = str + b + " ";
            return this;
        }

        @Override
        public String toString() {
            return "Chuỗi nhập: " + "str = " + str;
        }
        
        
    }
//}
