import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    private long user;
    private String pass;
    private String desc;
    public  long leerUser(){
        System.out.println ("Ingrese el Usuario (cedula):");
        user = sc.nextLong();
        return user;
    }
    public String leerPass () {
        System.out.println(  "Ingrese la contraseña: " );
        pass = sc.next();
        if ( pass.isEmpty( ) ) {
           System.out.println ( "Contraseña incorrecta \n Este espacio no puede estar vacio, reintente por favor" );
            return leerPass ();
        }
        else
            return pass;
    }

}
