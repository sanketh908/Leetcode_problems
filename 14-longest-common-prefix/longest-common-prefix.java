class Solution {
    public String longestCommonPrefix(String[] strs) {
         String current=strs[0];
       for(int i=1;i<strs.length;i++)
       {
           while (!strs[i].startsWith(current))
           {
               current=current.substring(0,current.length()-1);
           }
           if (current.equals(""))
           {
               return "";
           }
        }
       return current;
    }
}