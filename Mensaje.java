public class Mensaje {
    private long remitente;
    private Date fechaIn;
    private Time horaIn;
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

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Time getHoraIn() {
        return horaIn;
    }

    public void setHoraIn(Time horaIn) {
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
        return "Mensaje" +
                "\n Receptor: " + receptor+
                "\n Remitente: " + remitente +
                "\n Fecha: " + fechaIn +
                "\n Hora: " + horaIn +
                "\n Asunto: " + asunto +
                "\n Mensaje: " + msj ;
    }
    public String toStringM() {
        return receptor+ remitente + " " + fechaIn + " " + horaIn + " " + asunto + " " + msj ;
    }

    @Override

    public String toString() {
        return "\n Remitente: " + remitente + "\t\t\t Fecha: " + fechaIn +
                "\n Asunto: " + asunto ;
    }
}