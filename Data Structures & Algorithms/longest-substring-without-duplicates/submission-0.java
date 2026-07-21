class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;

        for(int i=0;i<n;i++){
            Set<Character> set = new HashSet<>();

            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(set.contains(ch)) break;

                set.add(ch);
                max=Math.max(max,j-i+1);
            }
        }
        return max;
        
    }
}
