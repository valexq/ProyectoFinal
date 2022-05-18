public class BinaryTree {

    private DoubleNode root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Boolean isRoot(DoubleNode n) {
        return n == root;
    }

    public Boolean isInternal(DoubleNode n) {
        if (n.getNext() == null && n.getPrev() == null) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean hasLeft(DoubleNode n) {
        if (n.getPrev() == null) {
            return false;
        } else {
            return true;
        }
    }

    public Boolean hasRight(DoubleNode n) {
        return !(n.getNext() == null);
    }

    public DoubleNode root() {
        return root;
    }

    public DoubleNode left(DoubleNode n) {
        return n.getPrev();
    }

    public DoubleNode right(DoubleNode n) {
        return n.getNext();
    }

    public DoubleNode Parent(DoubleNode n) {
        if (isRoot(n)) {
            return null;
        } else {
            Queue q = new Queue();
            q.Enqueue(root);
            DoubleNode temp = root;
            while (!q.isEmpty() && (left((DoubleNode) q.First())) != n && (right((DoubleNode) q.First()) != n)) {
                temp = (DoubleNode) q.Dequeue();
                if (hasLeft(temp)) {
                    q.Enqueue(left(temp));
                }
                if (hasRight(temp)) {
                    q.Enqueue(right(temp));
                }
            }
            return temp;
        }
    }

    public int depth(DoubleNode n) {
        if (isRoot(n)) {
            return 0;
        } else {
            return 1 + depth(Parent(n));
        }
    }

    public int height(DoubleNode n) {
        if (!isInternal(n)) {
            return 0;
        } else {
            return 1 + Math.max(height(left(n)), height(right(n)));
        }
    }

    public void addRoot(Object o) {
        root = new DoubleNode(o);
        size = 1;
    }

    public void insertLeft(DoubleNode n, Object o) {
        DoubleNode left = new DoubleNode(o);
        n.setPrev(left);
        size++;
    }

    public void insertRight(DoubleNode n, Object o) {
        n.setNext(new DoubleNode(o));
        size++;
    }

    public void remove(DoubleNode n) {
        DoubleNode p = Parent(n);
        if (!isInternal(n)) {
            if (left(p) == n) {
                p.setPrev(null);
            } else {
                p.setNext(null);
            }
        } else {
            DoubleNode child = null;
            if (hasLeft(n)) {
                child = left(n);
            } else {
                child = right(n);

            }
            if (left(p) == n) {
                p.setPrev(child);

            } else {
                p.setNext(child);
            }
        }
        size--;
    }

    public void PreOrder(BinaryTree t, DoubleNode n) {
        System.out.print(n.getData());
        if (t.hasLeft(n)) {
            PreOrder(t, t.left(n));
        }
        if (t.hasRight(n)) {
            PreOrder(t, t.right(n));
        }
    }

    public void InOrder(BinaryTree t, DoubleNode n) {
        if (t.hasLeft(n)) {
            InOrder(t, t.left(n));
        }
        System.out.print(n.getData());
        if (t.hasRight(n)) {
            InOrder(t, t.right(n));
        }
    }
    public void PostOrder(BinaryTree t, DoubleNode n) {
        if (t.hasLeft(n)) {
            PostOrder(t, t.left(n));
        }
        if (t.hasRight(n)) {
            PostOrder(t, t.right(n));
        }
        System.out.print(n.getData());
    }

}