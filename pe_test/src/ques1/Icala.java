/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

/**
 *
 * @author Phuong
 */
public class Icala extends Cala {
    public int color;

    public Icala() {
    }

    public Icala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }
    
    public String toString() {
        return super.toString() + '#' + this.color;
    }
    
//    Long 
    public void setData () {
        for (int i = 0; i < this.owner.length(); i ++) {
            char[] temp = this.owner.toCharArray();
            if (i == 0) {
               if (this.owner.charAt(i) >= 'a' && this.owner.charAt(i) <= 'z') {
                   temp[i] -= 32;
                   
                   this.owner = String.valueOf(temp);
               }
            } else {
                if (temp[i - 1] == ' ') {
                    if (this.owner.charAt(i) >= 'a' && this.owner.charAt(i) <= 'z') {
                        temp[i] -= 32;

                        this.owner = String.valueOf(temp);
                    }
                } else {
                    if (this.owner.charAt(i) >= 'A' && this.owner.charAt(i) <= 'Z') {
                        temp[i] += 32;

                        this.owner = String.valueOf(temp);
                    }
                }
            }
        }
    }
    
    public int getValue () {
        if (this.color % 2 == 0) return this.price + 1;
        
        return this.price * 2;
    }
}
