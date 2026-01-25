class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> h=new HashMap<>();
       return recurstionclimb(n,h);
    }
    public int recurstionclimb(int n,HashMap<Integer,Integer> h)
    {
        
        if(n<0)
        {
            return 0;
        }
        if(n==1 || n==0)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if(h.containsKey(n))
        {
            return h.get(n);
        }


        
        int ways=recurstionclimb(n-1,h)+recurstionclimb(n-2,h);
        h.put(n,ways);
        return ways;
    }
}