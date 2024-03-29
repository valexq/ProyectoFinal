public class Time extends java.util.Date  {
    private short hh;
    private short mm;
    private short ss;

    public Time(){
        super();
    }

    public Time(short hh, short mm, short ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public short getHh() {
        return hh;
    }

    public short getMm() {
        return mm;
    }

    public short getSs() {
        return ss;
    }

    public void setHh(short hh) {
        this.hh = hh;
    }

    public void setMm(short mm) {
        this.mm = mm;
    }

    public void setSs(short ss) {
        this.ss = ss;
    }
    @Override
    public String toString(){
        return hh + " " + mm + " " + ss;
    }
}