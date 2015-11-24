/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_182;

/**
 *
 * @author mypc
 */
public class Test {
    int a, b;
    
    Test(int i, int j){
        this.a = i;
        this.b = j;
    }
    
    boolean equals(Test o){
        if(o.a == a && o.b == b)return (true);
        else return(false);
    }
}
