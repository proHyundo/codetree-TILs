import java.util.*;
import java.util.stream.*;
class Solution {
    boolean solution(String s) {

        int open = 0;
        int close = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }else{
                close++;
            }
            
            if(open < close){
                return false;
            }
        }
        
        if(open != close){
            return false;
        }
        
        return true;
    }
}