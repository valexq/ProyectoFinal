public class List {

    private Node head;
    private Node tail;
    private int size;

    public List(){
        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void setSize(int s){
        size = s;
    }

    public Node first(){
        return head;
    }

    public Node last(){
        return tail;
    }

    public void addFirst(Object o){
        Node n = new Node(o);
        if(isEmpty()){
            head = n;
            tail = n;
        }else{
            n.setNext(head);
            head = n;
        }
        size++;
    }

    public void addLast(Object o){
        Node n = new Node(o);
        if(isEmpty()){
            head = n;
            tail = n;
        }else{
            tail.setNext(n);
            tail = n;

        }size++;
    }

    public Object removeFirst(){
        if(isEmpty()){
            return null;
        }else{
            Node temp = head;
            head = temp.getNext();
            temp.setNext(null);
            size--;
            return temp.getData();
        }
    }

    public Object removeLast(){
        if(size <=1){
            return removeFirst();
        }else{
            if(size >1){
                Node temp = tail;
                Node anterior = head;
                while(anterior.getNext() != tail){
                    anterior = anterior.getNext();
                }
                anterior.setNext(null);
                tail = anterior;
                size--;
                return temp.getData();
            }else{
                return null;
            }
        }
    }

    public void printList(){
        Node recorrer = head;
        while(recorrer != null){
            System.out.println(recorrer.getData());
            System.out.println();
            recorrer = recorrer.getNext();
        }
    }

}
