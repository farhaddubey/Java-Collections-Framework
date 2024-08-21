import java.util.*;

public class LongestSubstring{
    public int lenghtOfLongestSubstring(String s){
        HashSet<Character> set =new HashSet<>();
        int left=0, right=0, maxLength=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxLength=Math.max(maxLength, right-left);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        
    }
}