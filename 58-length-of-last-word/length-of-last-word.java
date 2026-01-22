class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length();
        int count =0;
        for(int i=len-1;i>=0;i--)
        {
            if(count!=0 && s.charAt(i)==' ')
            {
                break;
            }
            else if(s.charAt(i)!=' ') 
            {
                count++;
            }
        }
        return count;
    }
}