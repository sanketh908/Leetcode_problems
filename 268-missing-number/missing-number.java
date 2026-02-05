class Solution {
    public int missingNumber(int[] n) {
        int num=n.length;
        int expected_sum=num*(num+1)/2;
        int act_sum=0;
        for(int i:n)
        {
            act_sum+=i;
        }
        return expected_sum - act_sum;
    }
}