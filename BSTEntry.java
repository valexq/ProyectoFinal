public class BSTEntry {
    private Object data;
    private int k;

    public BSTEntry (Object o,int k){
        data = o;
        this.k =k;
    }

    public Object getData() {
        return data;
    }

    public int getKey() {
        return k;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setKey(int k) {
        this.k = k;
    }

}
