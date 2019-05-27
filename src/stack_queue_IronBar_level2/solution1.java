package stack_queue_IronBar_level2;
import java.util.*;

public class solution1 {
    public int solution(String arrangement) {
        int answer = 0;
        Stack <Character> stack = new Stack<Character>();

        for(int i =0; i< arrangement.length();i++){
            if(arrangement.charAt(i) == '('){
                stack.add(arrangement.charAt(i));
            }else{
                stack.pop();
                if(arrangement.charAt(i-1)=='('){
                    answer+=stack.size();
                }else{
                    answer++;
                }
            }
        }
        return answer;
    }
}
