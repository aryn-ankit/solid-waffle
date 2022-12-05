import java.util.Arrays;
import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        // Your code goes here

        Stack<Integer> stack = new Stack<>();
        int[] stArr = new int[operations.length];
        Arrays.fill(stArr,0);
        int ptr = 0;

        for (int i = 0; i < operations.length ; i++) {
            if (operations[i].equals("+")) {
                int s1 = stack.pop(), s2 = stack.peek();
                stack.push(s1);
                stack.push(s1+s2);

                s1 = stArr[ptr-1];s2 = stArr[ptr-2];
                stArr[ptr++] = s1+s2;
            } else if (operations[i].equals("C")) {
                stack.pop();
                stArr[--ptr] = 0;
            } else if (operations[i].equals("D")) {
                stack.push(2 * (stack.peek()));
                stArr[ptr] = 2*stArr[ptr-1];
                ptr++;
            } else {
                stack.push(Integer.parseInt(operations[i]));
                stArr[ptr++] = Integer.parseInt(operations[i]);
            }
        }
        int ans = 0;
        while(!stack.empty()) {
            ans += stack.pop();
        }
        ans = 0;
        
        for (int i = 0;i<operations.length;i++)
        ans += stArr[i];
        return ans;
    }

}
