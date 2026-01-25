class Solution {
    public boolean isPalindrome(String s) {
      s=  s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray())
        {
            if(Character.isLetterOrDigit(i))
            {
                sb.append(i);
            }
        }
        String real=sb.toString();
        String rev=sb.reverse().toString();
        if(real.equals(rev))
        {
            return true;
        }
        else 
        return false;

    }
}