class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];
        
        int[] result = new int[n - k + 1];
        // Deque will store indices of elements
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // 1. Remove indices that are out of this window (too far left)
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            
            // 2. Remove indices of all elements smaller than current element
            // because they will never be the maximum
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            
            // 3. Add current element's index to the back
            dq.offerLast(i);
            
            // 4. The front of the Deque is always the largest element index
            // Only start adding to result once we've reached the first window size
            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        
        return result;
    }
}