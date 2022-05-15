public class Stack {
    private List data;

    public Stack() {
        data = new List();
    }

    public int size(){
        return data.size();
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }
    public void Push(Object e){
        data.addFirst(e);
    }
    public Object pop(){
        return data.removeFirst();
    }
    public Object top(){
        return data.first().getData();
    }

}