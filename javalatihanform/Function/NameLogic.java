/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalatihanform.Function;

import javalatihanform.ModelProgram.ModelProgram;

/**
 *
 * @author hello
 */
public class NameLogic {
    public String returnName(ModelProgram modelProgram){
        return "Your name couldn't be empty!" + modelProgram.getName();    
    }
}
