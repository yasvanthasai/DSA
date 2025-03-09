/*method using hashmaps which is not that optimized */
/*Question: first char which is repeating only once in a string */
class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
          HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }

        return -1;

        
    }
}

/*here is the optimized method using indexing */
class Solution {
    public int firstUniqChar(String s) {
         int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; 
    }
}

