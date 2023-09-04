class CustomQueue{
    int[] SizeOfQueue;
    int end = -1;
    int def_size = 10;
    CustomQueue(int size){
        this.SizeOfQueue = new int[size];
    }
    CustomQueue(){
        this.SizeOfQueue = new int[def_size];
    }
    public boolean isEmpty(){
        if(end == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(end == SizeOfQueue.length -1){
            return true;
        }
        return false;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        end++;
        SizeOfQueue[end] = data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        int removed = SizeOfQueue[0];
        for(int i=1; i<=end; i++){
            SizeOfQueue[i-1] = SizeOfQueue[i];
        }
        end--;
        return removed;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        return SizeOfQueue[0];
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        for(int i=0; i<=end; i++){
            System.out.print(SizeOfQueue[i]+"<--");
        }
        System.out.print("END");
        System.out.println();
    }

    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.isFull());
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.printQueue();

    }
}
