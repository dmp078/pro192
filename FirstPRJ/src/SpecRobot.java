/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong
 */
public class SpecRobot extends Robot {
    int step;
    SpecRobot (String label, int type, int step) {
        this.label = label;
        this.type = type;
        this.step = step;
    }
    
    @Override
    public String toString (SpecRobot this) {
        return this.label + ',' + this.type + ',' + this.step;
    }
    
    void setData () {
        this.label = this.label.substring(0,1) + this.step + this.label.substring(1);
    }
    
    int getValue () {
        if (this.type < 3 && this.label.contains("A")) {
            return this.step;
        }
        
        return this.step + 2;
    }
}
