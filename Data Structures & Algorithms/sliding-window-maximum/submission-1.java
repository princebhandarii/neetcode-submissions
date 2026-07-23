

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Outer loop: starting index of each window
        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            
            // Inner loop: fixed k size window
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            
            list.add(max);
        }
        
        // Convert ArrayList to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}