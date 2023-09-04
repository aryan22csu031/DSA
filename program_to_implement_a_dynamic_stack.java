class DynamicStack extends CustomStack{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }
    @Override
    public void push(int data){
        if(isFull()){
            int[] temp = new int[SizeOfStack.length*2];
            for(int i=0; i<SizeOfStack.length; i++){
                temp[i] = SizeOfStack[i];
            }
            SizeOfStack = temp;
        }

        super.push(data);
    }
}
