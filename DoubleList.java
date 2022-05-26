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
    public Object remove(long id){
        DoubleNode recorrer = head;
        while(recorrer != null){
            Object temp_data = recorrer.getData();
            if(((User)temp_data).getId() == id){
                if(recorrer == head){
                    return removeFirst();
                }else if(recorrer == tail){
                    return removeLast();
                }
                recorrer.getPrev().setNext(recorrer.getNext());
                recorrer.getNext().setPrev(recorrer.getPrev());
                recorrer.setPrev(null);
                recorrer.setNext(null);
                size--;
                return temp_data;
            }
            recorrer = recorrer.getNext();
        }
        return null;
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