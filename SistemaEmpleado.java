import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaEmpleado {
    Scanner sc = new Scanner(System.in);
    Scanner tc = new Scanner(System.in);
    BAoML bandeja ;
    Borradores b;


    private static long remit;
    private Mensaje mens;
    public SistemaEmpleado(){

        bandeja = new BAoML();
        b = new Borradores();

    }


    public void leerReceptor(){
        SistemaAdministrador buscador = new SistemaAdministrador();
        System.out.println("Enter receiver's ID: ");
        long receptor = sc.nextLong();
        buscador.importUser("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Empleados.txt", "C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Password.txt");
        User recep = buscador.BuscarU(receptor);
        if (recep != null) {
            mens.setReceptor(receptor);

        }else{
            System.out.println("This user doesn't exist, try again please");
            leerReceptor();
        }
    }

    public void crearM(long remitente, String desc){
        Login g = new Login();
        mens = new Mensaje();
        remit = remitente;
        mens.setRemitente(remit);
        leerReceptor();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        mens.setFechaIn(dtf.format(LocalDateTime.now()));
        DateTimeFormatter dhr = DateTimeFormatter.ofPattern("HH:mm:ss ");
        mens.setHoraIn(dhr.format(LocalDateTime.now()));
        System.out.println("Enter message's subject: ");
        String asunto = tc.nextLine();
        mens.setAsunto(asunto);
        System.out.println("Enter message: ");
        String msj = tc.nextLine();
        mens.setMsj(msj);
        System.out.println(mens.toStringPrintM());

        System.out.println("\n 1. Send Message" +
                           "\n 2. Send to drafts"+
                           "\n 3. Delete ");
        int w= sc.nextInt();
        switch (w){
            case 1:
                enviarM();
                if (desc.equals("E")){
                    g.SisEmp();
                }else if(desc.equals("A")){
                    g.SistAdmin();
                }
                break;
            case 2:
                enviarB();
                if (desc.equals("E")){
                    g.SisEmp();
                }else if(desc.equals("A")){
                    g.SistAdmin();
                }
                break;
            case 3:
                System.out.println("Mensaje eliminado");
                if (desc.equals("E")){
                    g.SisEmp();
                }else if(desc.equals("A")){
                    g.SistAdmin();
                }
                break;
            default:
                System.out.println("Opcion incorrecta");


        }


    }
    public void enviarM(){
        bandeja.agregarbandeja(mens);
    }

    public void enviarB(){

        b.agregarB(mens);

    }

}