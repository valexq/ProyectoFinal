public class Queue {
        private List data;

    public Queue(){
        data = new List();
    }
    public int size(){
        return data.size();
    }
    public boolean isEmpty(){
        return (size()==0);
    }
    public void Enqueue(Object e){
        data.addLast(e);
    }

    public Object Dequeue(){
        if(isEmpty()){
            return null;
        }
        else{
            return data.removeFirst();
        }
    }
    public Object First(){
        if (isEmpty()){
            return null;
        }
        else{
            return data.first().getData();
        }
    }
    public void printListQ(){
        data.printList();
    }
}