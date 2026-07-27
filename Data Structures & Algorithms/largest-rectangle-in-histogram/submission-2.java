class Solution {
    public int largestRectangleArea(int[] heights) {
        
    int maxArea=0;
    int n = heights.length;
    for(int i=0;i<n;i++){
        int height=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            height=Math.min(height,heights[j]);
            int width=j-i+1;
            int area = height*width;

        maxArea=Math.max(maxArea,area);
        }
    }
    return maxArea;
    }
}
