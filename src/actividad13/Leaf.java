/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

/**
 *
 * @author emiaj
 */
public class Leaf {
      int data;
    Leaf left;
    Leaf right;
    
    Leaf(){
    left=right=null;
    data=0;
}

Leaf(int d){
    left=right=null;
    data=d;
}


void print(){
    System.out.println(" "+data+" ");
}

int getData(){
    return data;
}

void sdetData(int d){
    data=d;
}
}