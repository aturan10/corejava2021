package day19arraylists;

import java.util.ArrayList;
import java.util.List;
public class List04 {
    public static void main(String[] args) {
        
        /*
        How to remove repeated elements from a list
        */
        
        List<Character> list1 = new ArrayList<>();
        
        list1.add('a');
        list1.add('b');
        list1.add('a');
        list1.add('c');
        list1.add('a');
        list1.add('b');
        list1.add('t');
        
        System.out.println(list1);//[a, b, a, c, a, b, t]
        
        List<Character> list2 = new ArrayList<>();
        
        for(int i = 0; i<list1.size(); i++) {
            
            
            if(!list2.contains(list1.get(i))) {
                
                
                list2.add(list1.get(i));
                
            }
        }
        
        System.out.println(list2);
        
    }
}