package ws1;

public class Stack{
	private char arr[];
	private int top;
	
	public Stack(int size) {  
		  arr= new char[size];
		  top= -1;
	}

	public boolean isEmpty(){
		return top == -1;	
	}
	
	public boolean isFull(){
		return top == arr.length - 1;
	}
		
	public void push(char i) {
	    if (isFull()) {
	    	throw new IllegalStateException("Stack is full");
	      }
	      arr[++top] = i;	    
	}
	
	public char pop() {
	    if (isEmpty()) {
	      System.out.println("Stack is empty");
             throw new IllegalStateException("Stack is empty");
	    }	    
	    return arr[top--];
	}
}
	
	