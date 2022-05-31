import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SistemaEmpleado {
    Scanner sc = new Scanner(System.in);
    Scanner tc = new Scanner(System.in);

    private Mensaje mens;
    public SistemaEmpleado(){
        mens = new Mensaje();

    }
    public void crearM(){
        System.out.println("Ingrese la cedula del remitente: ");
        long remitente = sc.nextLong();
        mens.setRemitente(remitente);
        System.out.println("Ingrese la cedula del receptor: ");
        long receptor = sc.nextLong();
        mens.setReceptor(receptor);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        mens.setFechaIn(dtf.format(LocalDateTime.now()));
        DateTimeFormatter dhr = DateTimeFormatter.ofPattern("HH:mm:ss ");
        mens.setHoraIn(dhr.format(LocalDateTime.now()));
        System.out.println("Ingrese el asunto del mensaje: ");
        String asunto = tc.nextLine();
        mens.setAsunto(asunto);
        System.out.println("Ingrese el mensaje: ");
        String msj = tc.nextLine();
        mens.setMsj(msj);
        System.out.println(mens.toStringPrintM());

        System.out.println("\n 1. Enviar Mensaje" +
                           "\n 2. Enviar a Borradores"+
                           "\n 3. Eliminar ");
        int w= sc.nextInt();
        switch (w){
            case 1:
                enviarM();
            case 2:
                enviarB();
            case 3:


        }


    }
    public void enviarM(){
        BAoML bandeja = new BAoML();
        bandeja.agregarbandeja(mens);
         Login g = new Login();
        g.SisEmp();

    }
    public void enviarB(){
        Borradores b = new Borradores();
        b.agregarB(mens);
    }
    public void verBA(){

    }
}
