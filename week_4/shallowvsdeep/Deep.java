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
public class Deep {
    public int [] a = new int[10];
    public Deep(){}
    public Deep(Deep s){
        for(int i = 0; i <10; i++)
           a[i] = s.a[i];
    }
    public String toString(){
        String x = "";
        for(int i = 0; i < 10; i++)
            x += a[i] + " ";
        return x;
    }    
}
