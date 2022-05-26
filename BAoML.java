public class BAoML {
    private DoubleList bandeja;
    private Stack mensajeL;

    public BAoML(){
        bandeja = new DoubleList();
        mensajeL =new Stack();
    }

    public DoubleList getBandeja() {
        return bandeja;
    }

    public Stack getMensajeL() {
        return mensajeL;
    }
    public void AgregarM (Mensaje m){
        bandeja.addFirst(m);
    }
}
