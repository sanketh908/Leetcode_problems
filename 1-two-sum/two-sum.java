class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] res=new int[2];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int contain=target-nums[i];
            if(h.containsKey(contain))
            {
                return new int[]{h.get(contain),i};
            }
            h.put(nums[i],i);
        }

      
      
      return new int[]{0,0};
    }

}