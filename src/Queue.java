
public class Queue {
    private Student[] arr;
    private int maxSize;
    private int front;
    private int rear;
    private int nElems;

    public Queue(int s) {
        maxSize = s;
        arr = new Student[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    public void insert(Student j) {
        if (rear == maxSize - 1)
            rear = -1;
        arr[++rear] = j;
        nElems++;
    }

    public Student remove() {
        Student temp = arr[front++];
        if (front == maxSize)
            front = 0;
        nElems--;
        return temp;
    }

    public Student peekFront() {
        return arr[front];
    }

    public boolean isEmpty() {
        return nElems == 0;
    }

    public boolean isFull() {
        return nElems == maxSize;
    }

    public int size() {
        return nElems;
    }



}
