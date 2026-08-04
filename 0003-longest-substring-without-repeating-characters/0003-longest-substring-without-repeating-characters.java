class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char cur = s.charAt(right);
            if (map.containsKey(cur) && map.get(cur) >= left){
                left = map.get(cur) + 1;
            }
            map.put(cur, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}   