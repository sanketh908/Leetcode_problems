class Solution {
    public String convertToTitle(int c) {
       String res="";
       while(c!=0)
       {
         c--;
         res=(char)(c%26+'A')+res;
         c=c/26;
       }
       return res;
    }
}