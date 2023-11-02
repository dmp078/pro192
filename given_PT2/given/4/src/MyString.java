/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phuong
 */
import java.util.HashMap;

public class MyString implements IString {
    public static boolean checkPalin (String s) {
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        
        return true;
    }
    
    @Override
    public int f1(String str) {
        int res = 0;
        String[] a = str.split("\\s");
        
        for (String x : a) {
            if (checkPalin(x)) res += x.length();
        }
        
        return res;
    }
    
    @Override
    public String f2(String str) {
        HashMap<String, Integer> mark = new HashMap<String, Integer>();
        
        String res = "";
        for (int i = 0; i < str.length(); i ++) {
            String temp = String.valueOf(str.charAt(i));
            if (mark.containsKey(temp)) continue;
            res = res.concat(temp);
            mark.put(temp, 1);
        }
        
        return res;
    }
}
