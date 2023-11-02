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
    public String designer;
    public int power;

    public Engine() {
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }
    
    public String getDesigner() {
        return designer.substring(0, 1).toLowerCase() + designer.substring(1, 3);
    }
    
    public int getPower() {
        return power;
    }
    
    public void setPower(int power) {
        this.power = power;
    } 
}
