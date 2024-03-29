public class Date extends java.util.Date {
    private short dd;
    private short mm;
    private short aa;

    public Date(){
        super();

    }

    public Date(short dd, short mm, short aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    public short getDd() {
        return dd;
    }

    public short getMm() {
        return mm;
    }

    public short getAa() {
        return aa;
    }

    public void setDd(short dd) {
        this.dd = dd;
    }

    public void setMm(short mm) {
        this.mm = mm;
    }

    public void setAa(short aa) {
        this.aa = aa;
    }
    @Override
    public String toString(){
        return dd + " " + mm + " " + aa;
    }
}

