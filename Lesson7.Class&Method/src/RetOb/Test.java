/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetOb;

/**
 *
 * @author mypc
 */
public class Test {
    int a;
    
    Test(int i){
        this.a = i;
    }
    
    Test incrByTen(){
        Test tmp = new Test(a+10);
        return(tmp);
    }
    
}
