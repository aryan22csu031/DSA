class CustomStack{
    int index = -1;
    int[] SizeOfStack;
    final int DEFAULT_SIZE = 10;
    CustomStack(int size){
        this.SizeOfStack = new int[size];
    }
    CustomStack(){
        this.SizeOfStack = new int[DEFAULT_SIZE];
    }
    public void push(int data){
        if(index == SizeOfStack.length-1){
            System.out.print("stack is full");
        }
        index++;
        SizeOfStack[index] = data;
    }
    public int pop(){
        if(index == -1){
            System.out.print("stack is empty");
        }
        return SizeOfStack[index--];
    }
    public int peek(){
        return SizeOfStack[index];
    }
    public boolean isEmpty(){
        if(index == -1 || index<SizeOfStack.length-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(index == SizeOfStack.length-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CustomStack stack1 = new CustomStack(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        //System.out.println(stack1.pop());
        //System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.isFull());
    }
}
