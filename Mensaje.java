public class Mensaje {
    private long remitente;
    private Date fechaIn;
    private Time horaIn;
    private String asunto;
    private String msj;

    public Mensaje(){
        remitente = 0;
        fechaIn = null;
        horaIn = null;
        asunto = null;
        msj = null;
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


    public String toStringPrintM() {
        return "Mensaje" +
                "\n Remitente: " + remitente +
                "\n Fecha: " + fechaIn +
                "\n Hora: " + horaIn +
                "\n Asunto: " + asunto +
                "\n Mensaje: " + msj ;
    }
    public String toStringM() {
        return  remitente + " " + fechaIn + " " + horaIn + " " + asunto + " " + msj ;
    }

    @Override
    //no es remitente si no el nombre del usuario
    public String toString() {
        return "\n Remitente: " + remitente + "\t\t\t Fecha: " + fechaIn +
                "\n Asunto: " + asunto ;
    }
}