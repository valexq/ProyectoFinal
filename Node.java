public class Node {

    private Object data;
    private Node next;

    public Node(){
        data = null;
        next = null;
    }

    public Node(Object o){
        data = o;
        next = null;
    }

    public void setData(Object o){
        data = o;
    }

    public void setNext(Node n){
        next = n;
    }

    public Object getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }
}
