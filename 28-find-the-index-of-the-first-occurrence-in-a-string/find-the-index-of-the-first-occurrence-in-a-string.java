class Solution {
    public int strStr(String haystack, String needle) {
        int str=haystack.length();
        int win=needle.length();
     
      for(int i=0;i<=str-win;i++)
      {
        if(haystack.substring(i,i+win).equals(needle))
        {
            return i;
        }
      }
      return -1;
    }
}