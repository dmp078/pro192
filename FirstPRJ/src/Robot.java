/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong
 */
public class Robot {
    String label;
    int type;
    
    Robot() {}
    
    Robot (String label, int type) {
        this.label = label;
        this.type = type;
    }
    
    String getLabel () {
        return this.label;
    }
    
    void setLabel (String label) {
        this.label = label;
    }
    
    @Override
    public String toString (Robot this) {
        return this.label + ',' + this.type;
    }
}
