class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> romen=new HashMap<>();
        romen.put('I',1);
        romen.put('V',5);
        romen.put('X',10);
        romen.put('L',50);
        romen.put('C',100);
        romen.put('D',500);
        romen.put('M',1000);
        int total=0;
        for(int i=0;i<s.length();i++)
        {
             int current=romen.get(s.charAt(i));
             if(i+1<s.length() && current<romen.get(s.charAt(i+1)))
             {
                total-=current;
             }
             else {
                 total+=current;
             }
        }
        return total;

    }
    }
