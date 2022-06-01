import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
    public  void agregarbandeja(Mensaje mens){

        bandeja.addFirst(mens);
        mandarToFile(mens);
    }
    public void mandarToFile(Mensaje mens){

        String receptor = Long.toString(mens.getReceptor());
        toFileBA(receptor);
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
    public void toFileML(String receptor) {
        try {

            BufferedWriter p = new BufferedWriter(new FileWriter(receptor +"ML.txt", true));
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




}
