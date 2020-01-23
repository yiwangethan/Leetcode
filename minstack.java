package leetcode;

import java.util.Stack;

public class minstack {
	
	private Stack<Integer> data;
    private Stack<Integer> helper;
    
	public minstack() {
        data = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        data.add(x);
        if(helper.isEmpty()||helper.peek()>=x) {
        	helper.add(x);
        }else {
        	helper.add(helper.peek());
        }
        
    }
    
    public void pop() {
        if(!data.isEmpty()) {
        	data.pop();
        	helper.pop();
        }
    }
    
    public int top() {
        if(!data.isEmpty()) {
        	return data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }
    
    public int getMin() {
        if(!helper.isEmpty()) {
        	return helper.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minstack m = new minstack();
		m.push(-2);
		m.push(0);
		m.push(-3);
		System.out.println(m.getMin());
		m.pop();
		m.top(); 
		System.out.println(m.getMin());
		//m.getMin();
	}

}
