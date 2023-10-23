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

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter owner: ");
        String owner = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter color: ");
        int color = sc.nextInt();
        
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        
        Icala a = new Icala(owner, price, color);
        System.out.print("Choose option: ");
           
        int input = sc.nextInt();
        
        switch(input) {
            case 1: 
                String result = a.toString();
                System.out.print(result);
                break;
            case 2:
                a.setData();
                System.out.print(a.owner);
                break;
            case 3:
                int answer = a.getValue();
                System.out.print(answer);
                break;
            default:
               System.out.print("Next out!");
        }
        
    }
}
