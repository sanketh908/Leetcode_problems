class Solution {
    public int removeElement(int[] nums, int val) {
        int left=-1;
      
      
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]!=val)
        {
            left++;
            nums[left]=nums[i];
            
        }
      }
      return left+1;  
    }
}