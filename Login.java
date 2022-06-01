import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    SistemaAdministrador c ;
    SistemaEmpleado e;
    private long user;
    private String pass;
    private String desc;

    public Login(){
        c = new SistemaAdministrador();
        e = new SistemaEmpleado();
    }
    public  long leerUser(){
        System.out.println ("Enter user's ID:");
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
        if (user == u.getId() && pass.equals(u.getPass()) ){
            return true;
        }else{
            return false;
        }
    }
  public void SisEmp(){


        System.out.println("Menu Empleado: " +
                            "\n 1. Crear Mensaje" +
                            "\n 2. Ver Bandeja de Entrada" +
                            "\n 3. Ver Mensajes Leidos" +
                            "\n 4. Ver Borradores");
        int p = sc.nextInt();
        switch (p){
            case 1:
                e.crearM(user);
            case 2:


        }
    }
   public void menuLogin(){
        int a;
        System.out.println( "Menu: " +
                            "\n 1. Empleado" +
                            "\n 2. Administrador");
        a = sc.nextInt();
       c.importUser("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Empleados.txt", "C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Password.txt");

        switch (a){
            case 1:
                leerUser();
                leerPass();
                User usua = c.BuscarU(user);
                desc = "E";
                if (usua != null) {
                    if (Verificar(usua) == true && desc.equals(usua.getDesc())) {
                        SisEmp();
                    }
                    else{
                        System.out.println("Su contraseña es incorrecta, vuelva a ingresar por favor ");
                        menuLogin();
                    }
                }else{
                    System.out.println("Usuario o contraseña incorrectas ");
                    menuLogin();
                }


        }
    }

}
