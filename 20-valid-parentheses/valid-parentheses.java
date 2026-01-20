class Solution {
    public boolean isValid(String s) {
           Stack<Character> stack = new Stack<>();
        Map<Character, Character> h = new HashMap<>();
        h.put('}', '{');
        h.put(']', '[');
        h.put(')', '(');
        for(char c:s.toCharArray())
        {
         if(h.containsKey(c))
         {
             if(stack.isEmpty())
             {
                 return false;
             }
             if(stack.isEmpty() || stack.pop()!=h.get(c))
             {
                 return false;
             }
         }
         else {
             stack.add(c);
         }

        }
        return stack.isEmpty();

    }
    
}