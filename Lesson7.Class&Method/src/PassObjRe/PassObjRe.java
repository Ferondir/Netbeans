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
public class PassObjRe {
    public static void main(String[] args){
        Test ob = new Test(15, 20);
        System.out.println("a and b before call : " + ob.a + " " + ob.b);
        
        
        ob.meth(ob);
        
        System.out.println("a and b after call : " + ob.a + " " + ob.b);
    }
}
