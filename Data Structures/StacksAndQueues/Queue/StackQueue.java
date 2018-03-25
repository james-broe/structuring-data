import java.util.*;

class StackQueue<E> {

  private Stack<E> myStack;
  private Stack<E> helpStack;
  private int size;

  public StackQueue() {
    this.myStack = new Stack<E>();
    this.helpStack = new Stack<E>();
    this.size = 0;
  }

  public E queue(E e) {
    this.myStack.push(e);
    this.size++;
    return e;
  }

  public E dequeue() {
    for (int i = 0; i < this.size; i++) {
      this.helpStack.push(this.myStack.pop());
    }
    E dequeued = this.helpStack.pop();
    this.size--;
    for (int i = 0; i < this.size; i++) {
      this.myStack.push(this.helpStack.pop());
    }
    return dequeued;
  }

  public int getSize() {
    return this.size;
  }

  public static void main(String[] args) {
    StackQueue<Integer> sq = new StackQueue<Integer>();
    sq.queue(1);
    sq.queue(2);
    sq.queue(3);
    sq.queue(4);
    sq.queue(5);
    System.out.println(sq.dequeue());
    System.out.println(sq.dequeue());
    System.out.println(sq.dequeue());
    System.out.println(sq.dequeue());
    System.out.println(sq.dequeue());
  }




}
