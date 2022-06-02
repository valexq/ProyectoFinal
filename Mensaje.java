import java.util.StringTokenizer;

public class Mensaje {
    private long remitente;
    private String fechaIn;
    private String horaIn;
    private String asunto;
    private String msj;
    private long receptor;
    public Mensaje(){
        remitente = 0;
        fechaIn = null;
        horaIn = null;
        asunto = null;
        msj = null;
        receptor = 0;
    }

    public long getRemitente() {
        return remitente;
    }

    public void setRemitente(long remitente) {
        this.remitente = remitente;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getHoraIn() {
        return horaIn;
    }

    public void setHoraIn(String horaIn) {
        this.horaIn = horaIn;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    public long getReceptor (){
        return receptor;
    }

    public void setReceptor(long receptor) {
        this.receptor = receptor;
    }

    public String toStringPrintM() {
        return "\n Remitente: " + remitente +
                "\n Receiver: " + receptor+
                "\n Date: " + fechaIn +
                "\n Hour: " + horaIn +
                "\n Subject: " + asunto +
                "\n Message: " + msj ;
    }
    public String toStringM() {
        return remitente +
                "\n" + receptor+
                "\n" + fechaIn +
                "\n" + horaIn +
                "\n" + asunto +
                "\n" + msj ;
    }


    @Override

    public String toString() {
        return "\n Remitente: " + remitente + "\t\t\t Date: " + fechaIn +
                "\n Subject: " + asunto ;
    }
    public void importFileMens(String input) {
        StringTokenizer ts = new StringTokenizer(input);
        this.remitente = Long.parseLong(ts.nextToken());
        this.receptor = Long.parseLong(ts.nextToken());
        this.fechaIn = String.valueOf(new Date(Short.valueOf(ts.nextToken()), Short.valueOf(ts.nextToken()), Short.valueOf(ts.nextToken())));
        this.horaIn = String.valueOf(new Time(Short.valueOf(ts.nextToken()), Short.valueOf(ts.nextToken()), Short.valueOf(ts.nextToken())));
        this.asunto = ts.nextToken();
        this.msj = ts.nextToken();
    }
}