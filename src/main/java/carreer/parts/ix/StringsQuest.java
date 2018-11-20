package carreer.parts.ix;

import sun.misc.Queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringsQuest {

//    public boolean isPalindrom(String str){
//
//    }

    public String shortString(String str) {
        HashMap<Character, Integer> resultMap = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (resultMap.containsKey(str.charAt(i))) {
                int val = resultMap.get(str.charAt(i)) + 1;
                resultMap.put(str.charAt(i), val);
            } else {
                resultMap.put(str.charAt(i), 1);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() > 1) {
                builder.append(entry.getKey());
                builder.append(entry.getValue());
            } else {
                builder.append(entry.getKey());
            }
        }
        return builder.toString();
    }

    public String anotherShort(String str) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder builder = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(stack.isEmpty()){
                stack.push(str.charAt(i));
            } else {
                if(stack.peek() == str.charAt(i)){
                    count++;
                } else {
                    stack.push(Character.forDigit(count, 10));
                    count = 1;
                    stack.push(str.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()){
            builder.append(stack.pop());
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        StringsQuest stringsQuest = new StringsQuest();
        System.out.println(stringsQuest.shortString("aabcccccaaa"));
        System.out.println(stringsQuest.anotherShort("aabcccccaaa"));
    }
}
