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
    private int step;

    public SpecRobot() {
    }
    
    public SpecRobot(String label, int type, int step) {
        super(label, type);
        
        this.step = step;
    }
    
    public String toString() {
        return super.toString() + ", " + step;
    }
    
    public void setData() {
        String tmp = super.getLabel();
        super.setLabel(tmp.substring(0, 1) + step + tmp.substring(1));
    }
    
    public int getValue() {
        if (super.getType() < 3 && super.getLabel().contains("A")) {
            return step;
        }
        return step + 2;
    }
}
