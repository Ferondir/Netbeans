/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassObjRe;

/**
 *
 * @author mypc
 */
public class Test {
    int a, b;
    
    Test(int i, int j){
        a = i;
        b = j;
    }
    
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
