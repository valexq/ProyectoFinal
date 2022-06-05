import java.io.*;

public class BAoML {
    private DoubleList bandeja;
    private Stack mensajeL;

    public BAoML(){
        bandeja = new DoubleList();
        mensajeL =new Stack();
    }
    public boolean isEmptyBA() {
        if (bandeja.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    public boolean isEmptyML() {
        if (mensajeL.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public  void agregarbandeja(Mensaje mens){

        bandeja.addFirst(mens);
        mandarToFileBA(mens);
    }

    public void mandarToFileBA(Mensaje mens){

        String receptor = Long.toString(mens.getReceptor());
        toFileBA(receptor);
    }
    public void mandarToFileBAR(Mensaje mens){

        String receptor = Long.toString(mens.getReceptor());
        toFileBAR(receptor);
    }
    public void mandarToFileML(Mensaje mens){

        String receptor = Long.toString(mens.getReceptor());
        toFileML(receptor);
    }
    public DoubleNode verMensaje (int i ){
        DoubleNode recorrer = bandeja.First();
        if (bandeja != null) {
            for (int j = 0; j < i-1; j++) {
                recorrer = recorrer.getNext();
            }
        }
        DoubleNode temp = recorrer;
        bandeja.removeM(recorrer);
        Mensaje aux = (Mensaje) recorrer.getData();
        mensajeL.Push(aux);
        mandarToFileML(aux);
        mandarToFileBAR(aux);
        return temp;
    }

    public void mostrarML(){
        mensajeL.printListS();
    }
    public void mostrarBA(){
        bandeja.printListD();
    }
    public void toFileBA(String receptor) {
        try {

            BufferedWriter p = new BufferedWriter(new FileWriter(receptor +"BA.txt", true));
            DoubleList temp;
            temp = bandeja;
            while (!(bandeja.isEmpty())) {
                Mensaje aux = (Mensaje)temp.removeFirst();
                p.write(( aux).toStringM());
                p.newLine();
            }
            p.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void toFileBAR(String receptor) {
        try {

            BufferedWriter p = new BufferedWriter(new FileWriter(receptor +"BA.txt", false));
            DoubleList temp;
            temp = bandeja;
            while (!(bandeja.isEmpty())) {
                Mensaje aux = (Mensaje)temp.removeFirst();
                p.write(( aux).toStringM());
                p.newLine();
            }
            p.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void toFileML(String remitente) {
        try {

            BufferedWriter p = new BufferedWriter(new FileWriter(remitente +"ML.txt", true));
            Stack temp;
            temp = mensajeL;
            while (!(mensajeL.isEmpty())) {
                Mensaje aux = (Mensaje)temp.pop();
                p.write(( aux).toStringM());
                p.newLine();
            }
            p.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void importBA(String archivo){
        try{

            BufferedReader b1 = new BufferedReader( new FileReader(archivo));
            String str = b1.readLine();

            while(str != null){
                Mensaje m1 = new Mensaje ();
                m1.importFileMens(b1, str);
                bandeja.addFirst(m1);
                str = b1.readLine();
            }
            System.out.println("Mensaje importado ");
            bandeja.printListD();
            b1.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
}
    public void importML(String archivo){
        try{

            BufferedReader b1 = new BufferedReader( new FileReader(archivo));
            String str = b1.readLine();

            while(str != null){
                Mensaje m1 = new Mensaje ();
                m1.importFileMens(b1, str);
                mensajeL.Push(m1);
                str = b1.readLine();
            }
            System.out.println("Mensaje importado ");
            mensajeL.printListS();
            b1.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }






}
