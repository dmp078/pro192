/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong
 */
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyRobot implements IRobot {
    @Override
    public int f1(List<Robot> t) {
        int res = 0;
        for(Robot x : t) {
            if (x.getLabel().contains("A") || x.getLabel().contains("B")) continue;
            
            res += x.getStep();
        }
        return res;
    }
    
    @Override
    public void f2(List<Robot> t) {
        int max = t.get(0).getStep(), pos = 0;
        for (int i = 0; i < t.size(); i ++) {
            if (t.get(i).getStep() > max) {
                max = t.get(i).getStep();
                pos = i;
            }
        }
        
        t.remove(max);
    }
    
    @Override
    public void f3(List<Robot> t) {
        for (int i = 1; i < 5; i ++) {
            for (int j = i + 1; j < 5; j ++) {
                Robot a = t.get(i), b = t.get(j);
                if (a.getStep() >= b.getStep()) {
                    if (a.getStep() == b.getStep()) {
                        if (a.getLabel().compareTo(b.getLabel()) < 0) {
                            Collections.swap(t, i, j);
                        }
                    } else {
                        Collections.swap(t, i, j);
                    }
                }
            }
        }
    }
}
