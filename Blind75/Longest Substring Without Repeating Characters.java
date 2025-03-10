/*Generate all possible substrings & check for each substring if it's valid and keep updating maxLen accordingly. 
This is the brute force approach with time complexity O(n^3) */

import java.util.HashSet;
import java.util.Set;

class Solution {
    private boolean isValid(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                String substr = s.substring(i, j + 1);
                if(isValid(substr)){
                    maxLen = Math.max(maxLen, substr.length());

                }

            }
        }

        return maxLen;
        
    }
}

/*This one is a optimized method using HashMap and sliding window. This will give you O(n) time complexity with space of O(n) for the hashmap
 * Make a hashMap, if it's the first occurance add them into it, if not, check the index where it got it's first time and move the left pointer there
 * and from there start doing the process again.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            char c = s.charAt(j);
            if (map.containsKey(c)) {
                i = Math.max(map.get(c) + 1, i);
            }
            map.put(c, j);
            maxLen = Math.max(maxLen, j - i + 1);
        }
        
        return maxLen;
    }
}