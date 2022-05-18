public class BST extends BinaryTree{
    public BST(){
        super();
    }
    public Object Min (BST T, DoubleNode u){
        if (T.hasLeft(u)){
            return Min(T, T.left(u));
        }else{
            return u.getData();
        }
    }
    public Object Max (BST T, DoubleNode u){
        if (T.hasRight(u)){
            return Max(T, T.right(u));
        }else{
            return u.getData();
        }
    }
    public DoubleNode find (int k){
        return findRecursive(k,root());
    }
    private DoubleNode findRecursive(int k, DoubleNode v){
        BSTEntry u = (BSTEntry) v.getData();
        if (u.getKey() == k){
            return v;
        } else if (k< u.getKey()) {
            return findRecursive(k, left(v));
        }else {
            return findRecursive(k, right(v));
        }
    }
    public void insert (Object o, int k ){
        BSTEntry v = new BSTEntry(o, k);
        if (isEmpty()){
            addRoot(v);
        }
        else{
            addEntry(root(), v);
        }
    }
    private void addEntry(DoubleNode u, BSTEntry o){
        BSTEntry temp = (BSTEntry) u.getData();
        DoubleNode nD = new DoubleNode(o);
        if (o.getKey() <= temp.getKey()){
            if (hasLeft(u)){
                addEntry(left(u), o);
            }
            else{
                insertLeft(u, o);
            }
        }else{
            if(hasRight(u)){
                addEntry(right(u), o);
            }
            else{
                insertRight(u, o);
            }
        }
    }
    public void remove (int k){
        DoubleNode temp = find(k);
        if (hasLeft(temp) && hasRight(temp)){
            DoubleNode w = predecesor(temp);
            if (hasLeft(w)){
                Parent(w).setNext(left(w));
            }
            temp.setData(w.getData());
            size--;
        }
        else {
            super.remove(temp);
        }

    }
    private DoubleNode predecesor (DoubleNode v){
        DoubleNode temp = v.getPrev();
        return maxNode(temp);
    }
    private DoubleNode maxNode(DoubleNode m){
        if (hasRight(m)){
            return maxNode(right(m));
        }
        else{
            return m;
        }
    }
}
