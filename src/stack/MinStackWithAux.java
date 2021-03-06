package stack;

import java.util.Stack;

public class MinStackWithAux {
    Stack<Integer> s;
    Stack<Integer> aux;

    public MinStackWithAux(){
        s= new Stack<>();
        aux= new Stack<>();
    }

    public void push(int x)
    {
     s.push(x);
     if(aux.empty())
         aux.push(x);
     else{
         if(aux.peek()>=x)
             aux.push(x);
     }
    }

    public int pop(){
        if(empty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top=s.pop();
        if(aux.peek()==top)
            aux.pop();

        return top;
    }

    public int peek() {
        return s.peek();
    }

    public int size() {
        return s.size();
    }

    public boolean empty() {
        return s.empty();
    }


    public int min(){
        if(aux.empty()){
            System.out.print("Stack underflow!! ");
            return -1;
        }
        return aux.peek();
    }

    public static void main (String[] args)
    {
        MinStackWithAux s = new MinStackWithAux();

        s.push(6);
        System.out.println(s.min());    // prints 6

        s.push(7);
        System.out.println(s.min());    // prints 6

        s.push(8);
        System.out.println(s.min());    // prints 6

        s.push(5);
        System.out.println(s.min());    // prints 5

        s.push(3);
        System.out.println(s.min());    // prints 3

        s.pop();
        System.out.println(s.min());    // prints 5

        s.push(10);
        System.out.println(s.min());    // prints 5

        s.pop();
        System.out.println(s.min());    // prints 5

        s.pop();
        System.out.println(s.min());    // prints 6
    }
}
