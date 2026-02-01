class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer,Integer> memo = new HashMap<>();
      for(int num:nums)
      {
        if(memo.containsKey(num))
        {
            return true;
        }
        memo.put(num,num);
      }  
      return false;
    }
}