
public class Stack {
    private int maxSize;
    private Student[] arr;
    private int top;

    public Stack(int s) {
        maxSize = s;
        arr = new Student[maxSize];
        top = -1;
    }

    public void push(Student j) {
        arr[++top] = j;
    }

    public Student pop() {
        return arr[top--];
    }

    public Student peek() {
        return arr[top];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
