class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int p=j+1;p<n;p++){
                    if(nums[i]+nums[j]+nums[p]==0){

                       List<Integer> list = new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[p]);
                       
                       
                       
                       Collections.sort(list);

                       if(!ans.contains(list))
                       {
                        ans.add(list);
                       }
                       
                    }
                }
            }
        }
        return ans;
        
    }
}
