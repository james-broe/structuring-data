import java.util.*;

class Stack<E> {

  private E[] array;
  private int top;
  private int capacity;

    // Constructors
  @SuppressWarnings("unchecked")
  public Stack() {
      this.capacity = 10;
      this.top = -1;
      this.array = (E[]) new Object[this.capacity];
  }

  public int size() {
    return this.top + 1;
  }

  public E push(E obj) {
    if (this.size() + 1 == capacity) {
      sizeUp();
    }
    this.array[this.size()] = obj;
    this.top++;
    return obj;

  }

  public E pop() {
    if (this.size() == this.top*2) {
      sizeDown();
    } else if (this.size() == 0) {
      System.out.println("The stack is empty!");
      return null;
    }
    E popped;
    popped = this.array[this.top];
    this.array[this.top] = null;
    this.top--;
    return popped;

  }

  public E peek() {
    return this.array[this.top];
  }

  public void sizeUp() {
    this.capacity *= 2;
    this.array = Arrays.copyOf(this.array, this.capacity);
  }

  public void sizeDown() {
    this.capacity /= 2;
    this.array = Arrays.copyOf(this.array, this.capacity);
  }

  public boolean isEmpty() {
    return this.size() == 0;
  }

  public static void main(String[] args) {
    Stack<Integer> myStack = new Stack<Integer>();
    System.out.println(myStack.isEmpty());
    myStack.push(1);
    myStack.push(5);
    myStack.push(5);
    myStack.push(4);
    myStack.push(5);
    myStack.push(1);
    myStack.push(5);
    myStack.push(1);
    myStack.push(5);
    System.out.println(myStack.isEmpty());
    System.out.println(myStack.pop());
    System.out.println(myStack.peek());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.isEmpty());
  }

}
