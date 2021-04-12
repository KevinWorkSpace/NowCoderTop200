import java.util.ArrayList;
import java.util.Stack;

public class GetMinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public int[] getMinStack (int[][] op) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<op.length; i++) {
            int[] opers = op[i];
            if (opers[0] == 1) {
                push(opers[1]);
            }
            else if (opers[0] == 2) {
                pop();
            }
            else {
                list.add(getMin());
            }
        }
        int[] res = new int[list.size()];
        for (int i=0; i<res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void push(int num) {
        stack.push(num);
        if (minStack.isEmpty() || num <= minStack.peek()) minStack.push(num);
    }

    public void pop() {
        int num = stack.pop();
        if (num == minStack.peek()) minStack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }
}
