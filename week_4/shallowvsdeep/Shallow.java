/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shallowvsdeep;

/**
 *
 * @author kmoore
 */
public class Shallow {
    public int [] a = new int[10];
    public Shallow(){}
    public Shallow(Shallow s){
        a = s.a;
    }
    public String toString(){
        String x = "";
        for(int i = 0; i < 10; i++)
            x += a[i] + " ";
        return x;
    }
    
    
}
