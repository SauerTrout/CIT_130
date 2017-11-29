/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15generics;

/**
 *
 * @author kmoore
 */
public class MyGeneric<T> {
    public void print(T x){
        System.out.println("printing " + x);
    }
    
}
