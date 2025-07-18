  import java.util.*;
public class string {
   
 
    // check if a number is palindrome 

    public static boolean isPalindrome(String str) {
        for(int i =0; i<str.length()/2; i++) {
            // int n = str.length();
            if(str.charAt(i) != str.charAt(str.length()-1 -i)) {
                return false;
            }
        }
        return true;
    }

    // shortest path to rach destination
    // WNEENESENNN

    public static float getShortestpath(String path) {
        int x =0, y = 0;

        for(int i =0; i<path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if(dir == 'S') {
                y--;
            }
            // north
            else if(dir == 'N') {
                y++;
            }
            // west
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }

    // for using largest string

    // public static void main(String args[]){
    //     String fruits[] = {"apple", "mango","banana"};

    //     String largest = fruits[0];
    //     for(int i=1; i<fruits.length; i++){
    //         if(largest.compareTo(fruits[i]) < 0){
    //             largest = fruits[i];
    //         }
    //     }
    //     System.out.println(largest);

    // }

    // for using string Builder
    /*
        public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z'; ch++) {
            sb.append(ch);

        }
        System.out.println( sb);

    }
     */

    //     public static void main(String args[]){
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch ='a'; ch<='z'; ch++) {
    //         sb.append(ch);

    //     }
    //     System.out.println( sb);

    // }

       
    //     public static void main(String args[]){
    //     // String str = "racecar";
    //     String path = "WNEENESENNN";
    //     // System.out.println(isPalindrome(str));
    //     System.out.println(getShortestpath(path));
    // }
    
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                
            } else {
                sb.append(str.charAt(i));
            }
            
        }
        return sb.toString();
    } 

    // for compress string 

    public static String compress(String stm) {
        String newStm ="";

        for(int i = 0; i<stm.length(); i++){
            Integer count = 1;
            while(i<stm.length()-1 && stm.charAt(i) == stm.charAt(i+1)){
                count++;
                i++;
            }
            newStm += stm.charAt(i);
            if(count >1){
                newStm += count.toString();
            }
        }
        return newStm;

    }

    public static void main(String args[]){
        String str = "hi , i am , mohit";
        String stm = "aaabbbcccdd";
        // System.out.println(toUpperCase(str));
        System.out.println(compress(stm));
    }
    
}
