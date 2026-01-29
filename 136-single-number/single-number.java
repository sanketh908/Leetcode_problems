class Solution {
    public int singleNumber(int[] n) {
        int xor=0;
        for(int i=0;i<n.length;i++)
        {
            xor^=n[i];
        }
        return xor;
    }
}