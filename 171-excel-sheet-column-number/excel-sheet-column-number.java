class Solution {
    public int titleToNumber(String c) {
        int res=0;
        for(int i=0;i<c.length();i++)
        {
            res=res*26+(c.charAt(i)-'A'+1);
        }
        return res; 
    }
}