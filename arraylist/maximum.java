package arraylist;
import java.util.*;
import java.util.ArrayList;
 

public class maximum{
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        // int max = Integer.MIN_VALUE;
        
        int max = Collections.max(list); 

        for(int i = 0; i<list.size(); i++){
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("max element = " + max);
    }
}
