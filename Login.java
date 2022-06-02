import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    SistemaAdministrador c ;
    SistemaEmpleado e;
    Borradores b;
    BAoML m;
    private long user;
    private String pass;
    private String desc;
    private static long idUser;


    public Login(){
        c = new SistemaAdministrador();
        e = new SistemaEmpleado( );
        b = new Borradores();
        m = new BAoML();

    }
    public  long leerUser(){
        System.out.println ("Enter user's ID:");
        user = sc.nextLong();
        idUser = user;
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


        System.out.println("Menu Employee: " +
                "\n Choose an option: " +
                "\n 1. Create message" +
                "\n 2. View inbox" +
                "\n 3. View Read Messages" +
                "\n 4. View Drafts" );
        int p = sc.nextInt();
        switch (p){
            case 1:

                e.crearM(idUser);
                break;
            case 2:
                verBA();
                SisEmp();
                break;
            case 3:
                verML();
                SisEmp();
                break;
            case 4:
                verB();
                SisEmp();
                break;

        }
    }
    public void SistAdmin(){
        System.out.println("Menu Administrator: " +
                "\n Choose an option: " +
                "\n 1. Create message" +
                "\n 2. View inbox" +
                "\n 3. View Read Messages" +
                "\n 4. View Drafts" +
                "\n 5. Create user" +
                "\n 6. Search user" +
                "\n 7. Delete user" +
                "\n 8. Change user's password"
        );
        int p = sc.nextInt();
        switch (p){
            case 1:
                e.crearM(idUser);
                break;
            case 2:






        }
    }
    public void menuLogin(){
        int a;
        System.out.println( "Choose type of user: " +
                "\n 1. Employee" +
                "\n 2. Administrator");
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
            case 2:
                leerUser();
                leerPass();
                User usua2 = c.BuscarU(user);
                desc = "A";
                if (usua2!= null) {
                    if (Verificar(usua2) == true && desc.equals(usua2.getDesc())) {
                        SistAdmin();
                    }
                    else{
                        System.out.println("Your credencial is not able");
                        menuLogin();
                    }
                }else{
                    System.out.println("User or password are incorrect ");
                    menuLogin();
                }



        }
    }
    public void verBA(){
        String rem = Long.toString(idUser);

        m.importBA("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\"+rem+"BA.txt");

    }
    public void verML(){
        String rem = Long.toString(idUser);

        m.importML("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\"+rem+"B.txt");
        m.mostrarML();
    }
    public void verB(){
        String rem = Long.toString(idUser);

        b.import_S("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\"+rem+"B.txt");
        b.mostrarB();
    }
}