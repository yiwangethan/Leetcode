package leetcode;

import java.util.Stack;

public class evalrpn {
    public int evalRPN(String[] tokens) {
    	Stack<Integer> stack = new Stack<>();
    	for(String s : tokens) {
    		if(s.equals("+")) {
    			stack.push(stack.pop()+stack.pop());
    		}else if(s.equals("-")) {
    			stack.push(-stack.pop()+stack.pop());
    		}else if(s.equals("*")) {
    			stack.push(stack.pop()*stack.pop());
    		}else if(s.equals("/")) {
    			int nums = stack.pop();
    			stack.push(stack.pop()/nums);
    		}else {
    			stack.push(Integer.parseInt(s));
    		}
    	}
    	return stack.pop();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		evalrpn eval = new evalrpn();
		int k = eval.evalRPN(s);
		System.out.print(k);
	}

}
