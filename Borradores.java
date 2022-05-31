public class Borradores {
    private Stack borrador;
    public Borradores(){

        borrador = new Stack();
    }
    public void agregarB(Mensaje msj){
        borrador.Push(msj);
    }
}
