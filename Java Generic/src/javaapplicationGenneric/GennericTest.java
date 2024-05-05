/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplicationGenneric;

import javax.swing.JButton;

/**
 *
 * @author FATHUR
 */
public class GennericTest {

    public static void main(String[] args) {
        ClassGenneric<JButton> iOb = new ClassGenneric<>(new JButton("OK"));
        iOb.showType();
//        int v = iOb.getob();
//        System.out.println("value : " + v);
//        System.out.println();
//        ClassGenneric<String> strOb = new ClassGenneric<>("Generic Test");
//        String v2 = strOb.getob();
//        strOb.showType();
//        System.out.println("value: " + v2);
//        System.out.println();
//Integer i = (Integer) strOb.getob();
//Error: cannot cast from String to Integer
    }
}
