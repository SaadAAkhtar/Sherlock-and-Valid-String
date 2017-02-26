import java.io.*;
import java.util.*;

public class Solution {
    
    static Collection characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        char[] strArray = inputString.toCharArray();
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c)) {
 
                charCountMap.put(c, charCountMap.get(c)+1);
            } else{
                charCountMap.put(c, 1);
            }
        }
 
        return(charCountMap.values());
    }

    public static void main(String[] args) {     
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        
        Collection<Integer> c = characterCount(s);
        
        int num = c.size();
        
        int sum = 0;
        
        for (int i : c) {
            sum = sum + i;
        }
        
        if (sum % num != 0) {
            if ((sum-1) % num != 0) {
                if ((sum-1) % (num-1) == 0) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }else {
                System.out.println("YES");
            }
        }else {
            System.out.println("YES");
        }
    }
}
