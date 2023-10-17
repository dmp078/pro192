

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong
 */
public class Engine {
    String designer;
    int power;
    Engine () {
        
    }
    Engine (String designer, int power) {
        this.designer = designer;
        this.power = power;
    }
    
    String getDesigner () {
        String res = this.designer.substring(0, 1).toLowerCase() + this.designer.substring(1,3);
        return res;
    }
    
    int getPower () {
        return this.power;
    }
    
    void setPower (int power) {
        this.power = power;
    }
}
