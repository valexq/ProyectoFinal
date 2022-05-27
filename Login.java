import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    SistemaAdministrador c = new SistemaAdministrador();

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
    public boolean Verificar(User u) {

        c.importUser("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Empleados.txt", "C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Password.txt");

        if (user == u.getId() && pass == u.getPass() ){
            return true;
        }else{
            return false;
        }
    }
    public void SisEmp(){
        SistemaEmpleado e = new SistemaEmpleado();

        System.out.println("Menu Empleado: " +
                           "\n 1. Crear Mensaje" );
        int p = sc.nextInt();
        switch (p){
            case 1:
                e.crearM();

        }
    }
    public void menuLogin(){
        int a;
        System.out.println( "Menu: " +
                            "\n 1. Empleado" +
                            "\n 2. Administrador");
        a = sc.nextInt();

        switch (a){
            case 1:
                leerUser();
                leerPass();
                User usua = c.BuscarU(user);
                desc = "E";
                if (Verificar(usua) == true && desc == usua.getDesc() ){
                    SisEmp();
                }



        }
    }
}
