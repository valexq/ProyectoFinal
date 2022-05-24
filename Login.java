import javax.swing.JOptionPane;

public class Login {
    private long user;
    private String pass;
    private String desc;
    public  long leerUser(){
        user =Long.parseLong( JOptionPane.showInputDialog ("Ingrese el Usuario (cedula):"));
        return user;
    }
    public String leerPass () {
        pass = JOptionPane.showInputDialog( null, "Ingrese la contraseña: " );
        if ( pass.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Contraseña incorrecta \n Este espacio no puede estar vacio, reintente por favor" );
            return leerPass ();
        }
        else
            return pass;
    }

}
