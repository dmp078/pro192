/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

/**
 *
 * @author Phuong
 */
import java.util.*;

public class Main
{
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MySet t = new MySet();
        for (int i = 0; i < n; i ++) {
            String s = sc.next();
            int p =  sc.nextInt();
            A x = new A(s, p);
            t.add(x);
        }
        t.display();
        A x = new A("ABC", 15);
        t.add (x);
        t.display();
        System.out.println();
    }
}
