class Solution {
    public String addBinary(String a, String b) {
     int lena=a.length()-1;
     int lenb=b.length()-1;   
     int sum=0,carry=0,base=2,temp1=0,temp2=0;
     StringBuilder sb=new StringBuilder();
     while(lena>=0||lenb>=0)
     {
        temp1=0;
        temp2=0;
        if(lena>=0)
         temp1=a.charAt(lena--)-'0';
        if(lenb>=0)
         temp2=b.charAt(lenb--)-'0';
        sum=temp1+temp2+carry;
        if(sum>=base)
        {
            sum=sum-base;
            carry=1;
        }
        else
        carry=0;

        sb.append(sum);

     }
     if(carry==1)
     {
            sb.append(carry);
     }  
     return sb.reverse().toString();
    }
}