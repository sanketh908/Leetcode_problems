class Solution {
    public boolean isValid(String s) {
        char a[]=new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( ch == '(' || ch == '{' || ch =='['){
                a[++top] =ch;
            }else{
                if(top == -1) return false;

                char last =a[top--];
                if((ch == ')' && last != '(') ||
                   (ch == '}' && last != '{') ||
                   (ch == ']' && last != '[')) {
                    return false;
                   }
            }
        }
        return top == -1;
    }
}