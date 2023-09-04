class CircularQ{
    int[] SizeOfQueue;
    int end = 0;
    int size = 0;
    int front = 0;
    int def_size = 10;
    CircularQ(int size){
        this.SizeOfQueue = new int[size];
    }
    CircularQ(){
        this.SizeOfQueue = new int[def_size];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==SizeOfQueue.length;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        SizeOfQueue[end++] = data;
        end = end % SizeOfQueue.length;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        int removed = SizeOfQueue[front++];
        front = front % SizeOfQueue.length;
        size--;
        return removed;
    }
    public int frontofQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        return SizeOfQueue[front];
    }
    public void printQueue(){
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(SizeOfQueue[i] + " -> ");
            i++;
            i %= SizeOfQueue.length;
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) {
        CircularQ q = new CircularQ(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.printQueue();
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.frontofQueue());
        q.printQueue();

    }
}
