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
        return "Mensaje" +
                "\n Remitente: " + remitente +
                "\n Receptor: " + receptor+
                "\n Fecha: " + fechaIn +
                "\n Hora: " + horaIn +
                "\n Asunto: " + asunto +
                "\n Mensaje: " + msj ;
    }
    public String toStringM() {
        return  remitente +" " + receptor+ " " + fechaIn + " " + horaIn + " " + asunto + " " + msj ;
    }

    @Override

    public String toString() {
        return "\n Remitente: " + remitente + "\t\t\t Fecha: " + fechaIn +
                "\n Asunto: " + asunto ;
    }
}