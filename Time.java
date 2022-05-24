public class Time {
    private short hh;
    private short mm;
    private short ss;

    public Time(){
        this.hh = 0;
        this.mm = 0;
        this.ss = 0;
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