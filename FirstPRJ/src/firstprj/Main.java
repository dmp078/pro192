
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.add(new Integer(2));
        list.add(new Integer(8));
        list.add(new Integer(5));
        list.add(new Integer(1));
        
        Iterator i = list.iterator();
        Collections.reverse(list);
            Collections.sort(list);
            while (i.hasNext()) {
                System.out.print(i.next() + " ");
            }
    }
    
}
