import javax.swing.JOptionPane;
public class Principal {

    static Login log= new Login();
    static crearUsuario sA = new crearUsuario();
    public static void main(String[] args) {
        login();


    }
    private static void login(){
        long id ;
        String pass;
        id = sA.leerId();

        JOptionPane.showMessageDialog (null, id);
    }
}
