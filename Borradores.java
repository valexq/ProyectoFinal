import java.io.*;

public class Borradores {
    private Stack borrador;
    public Borradores(){

        borrador = new Stack();
    }
    public void agregarB(Mensaje msj){
        borrador.Push(msj);
        mandarToFile(msj);
    }
    public void mostrarB(){
        borrador.printListS();
    }
    public void mandarToFile(Mensaje mens){

        String remitente = Long.toString(mens.getRemitente());
        toFileS(remitente);
    }
    public void toFileS(String remitente) {
        try {
            BufferedWriter p = new BufferedWriter(new FileWriter(remitente +"B.txt", true));
            Stack temp;
            temp = borrador;
            while (!(borrador.isEmpty())) {
                p.write(((Mensaje) temp.pop()).toStringM());
                p.newLine();
            }

            p.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void import_S(String archivo){
        try{

            BufferedReader b1 = new BufferedReader( new FileReader(archivo));
            String str = b1.readLine();
            Stack temp = new Stack();
            while(str != null){
                Mensaje m1 = new Mensaje ();
                m1.importFileMens(b1, str);
                temp.Push(m1);
                str = b1.readLine();
            }
            System.out.println("Mensaje importado ");
            temp.printListS();
            b1.close();

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }

}