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

    public int getK() {
        return k;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setK(int k) {
        this.k = k;
    }

}
