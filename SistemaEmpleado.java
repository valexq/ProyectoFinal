import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaEmpleado {
    Scanner sc = new Scanner(System.in);
    Scanner tc = new Scanner(System.in);
    BAoML bandeja ;
    Borradores b;
    private static int Nmens;

    private static long remit;
    private Mensaje mens;
    public SistemaEmpleado(){
        mens = new Mensaje();
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
    public void crearM(long remitente){

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
                break;
            case 2:
                enviarB();
                break;
            case 3:


        }


    }
    public void enviarM(){
        Login g = new Login();
        bandeja.agregarbandeja(mens);
        g.SisEmp();

    }
    public void enviarB(){
        Login g = new Login();
        b.agregarB(mens);

        g.SisEmp();
    }

}