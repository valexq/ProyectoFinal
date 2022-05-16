public class Date {
    private short dd;
    private short mm;
    private short aa;

    public Date(){
        this.dd = 0;
        this.mm = 0;
        this.aa = 0;
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

