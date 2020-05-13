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
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder msb = new MyStringBuilder().addString("NTU").addFloat(2020).addBool(true);
        System.out.println(msb.toString());
    }
    
}
