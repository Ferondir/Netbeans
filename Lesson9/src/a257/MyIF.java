/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a257;

/**
 *
 * @author mypc
 */
public interface MyIF {
    int getNumber();
    
    default String getString(){
        return("Object type by default");
    }
}
