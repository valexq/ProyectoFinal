public class DoubleNode {
    private Object data;
    private DoubleNode next; 
    private DoubleNode prev;
    public DoubleNode(){
        data = null; 
        next = null; 
        prev = null; 
       
    }
    public DoubleNode (Object o){
        data = o; 
        next = null; 
        prev = null; 
        
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}