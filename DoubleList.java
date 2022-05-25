import javax.swing.*;
public class DoubleList {

    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleList() {
        head = null;
        tail = null;
        size = 0;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public DoubleNode First() {
        return head;

    }

    public DoubleNode Last() {
        return tail;

    }

    public void addFirst(Object a) {
        DoubleNode n = new DoubleNode(a);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.setNext(head);
            head.setPrev(n);
            head = n;
        }
        size++;
    }

    public void addLast(Object a) {
        if (isEmpty()) {
            addFirst(a);
        } else {
            DoubleNode n = new DoubleNode(a);
            n.setPrev(tail);
                tail.setNext(n);
            tail = n;
            size++;
        }

    }
    public Object removeFirst(){
        if (isEmpty()){
            return null;
        }
        else{
            Object temp_data = head.getData();
            if (size==1){
                head = null;
                tail = null;
                size = 0;
            }
            else{
                DoubleNode temp = head.getNext();
                head.setNext(null);
                temp.setPrev(null);
                head = temp;
                size--;
            }
            return temp_data;
        }

    }
    public Object removeLast(){
        if (size()<=1){
            return removeFirst();
        }
        else{
            Object temp_data = tail.getData();
            DoubleNode anterior = tail.getPrev();
            anterior.setNext(null);
            tail.setPrev(null);
            tail = anterior;
            size--;
            return temp_data;
        }
    }
    public Object remove (DoubleNode n){
        if (n == head){
            return removeFirst();
        }
        else{
            if(n==tail){
                return removeLast();
            }
            else{
                Object temp_data = n.getData();
                DoubleNode temp_prev = n.getPrev();
                DoubleNode temp_next = n.getNext();
                temp_prev.setNext(temp_next);
                temp_next.setPrev(temp_prev);
                n.setNext(null);
                n.setPrev(null);
                size--;
                return temp_data;
            }
        }
    }
    public void addAfter(DoubleNode n, Object a){
        if (n !=tail){
            DoubleNode m = new DoubleNode(a);
            DoubleNode siguiente = n.getNext();
            n.setNext(m);
            m.setPrev(n);
            siguiente.setPrev(m);
            m.setNext(siguiente);
            size++;
        }
        else{
            addLast(a);
        }
    }
    public void printListD(){
        DoubleNode recorrer = head;
        while(recorrer != null){
            System.out.println(recorrer.getData());
            System.out.println();
            recorrer = recorrer.getNext();
        }
    }
}