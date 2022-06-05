import java.util.Scanner;

public class Login {
    Scanner sc = new Scanner(System.in);
    SistemaAdministrador c ;
    SistemaEmpleado e;
    Borradores b;
    BAoML m;
    crearUsuario u;
    private long user;
    private String pass;
    private String desc;
    private static long idUser;



    public Login(){
        c = new SistemaAdministrador();
        e = new SistemaEmpleado( );
        b = new Borradores();
        m = new BAoML();
        u = new crearUsuario();
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
    private void PreguntarU(){
        System.out.print("Enter user's id to change: ");
        long id = sc.nextLong();
        User temp = c.BuscarU(id);
        if(temp== null){
            System.out.println("User not founded");
            PreguntarU();
        }else{
            System.out.print("Enter user's password to change: ");
            String newpass = sc.next();
            c.CambiarPass(id, newpass);
            c.toFileE();
        }
    }
    public void SisEmp(){


        System.out.println("\n Menu Employee: " +
                "\n Choose an option: " +
                "\n 1. Create message" +
                "\n 2. View inbox" +
                "\n 3. View Read Messages" +
                "\n 4. View Drafts"+
                "\n 5. cerrar sesion");
        int p = sc.nextInt();
        switch (p){
            case 1:

                e.crearM(idUser, "E");
                break;
            case 2:
                verBA();
                System.out.println("1. Ver mensaje"
                        + "\n2. Volver al menu anterior ");
                int t = sc.nextInt();
                switch (t){
                    case 1:
                        verM();
                        SisEmp();
                        break;
                    case 2:
                        SisEmp();
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
                break;
            case 3:
                verML();
                SisEmp();
                break;
            case 4:
                verB();
                System.out.println("\n1. Ver primer mensaje "+
                        "\n2. Enviar primer mensaje  "+
                        "\n3. Eliminar primer mensaje ");
                int o = sc.nextInt();
                switch (o){
                    case 1:
                        Mensaje temp =  b.mostrarPrimerM();
                        System.out.println(temp.toStringPrintM());
                        SisEmp();
                        break;
                    case 2:
                        Mensaje men=  b.mostrarPrimerM();
                        enviarMensaje(men);

                        SisEmp();
                        break;
                    case 3:
                        b.eliminar();
                        SisEmp();
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        //falta while
                }
                break;
            case 5:
                menuLogin();
            default:
                System.out.println("Opcion incorrecta");
                SisEmp();

        }
    }
    public void verM (){
        System.out.println("Ingrese el indice del mensaje que quiere ver: ");
        int i = sc.nextInt();
        DoubleNode temp = m.verMensaje(i);
        Mensaje men = (Mensaje) temp.getData();
        System.out.println(men.toStringPrintM());
    }

    public void SistAdmin(){
        System.out.println("\n Menu Administrator: " +
                "\n Choose an option: " +
                "\n 1. Create message" +
                "\n 2. View inbox" +
                "\n 3. View Read Messages" +
                "\n 4. View Drafts" +
                "\n 5. Create user" +
                "\n 6. Search user" +
                "\n 7. Delete user" +
                "\n 8. Change user's password"+
                "\n 9. cerrar sesion"
        );
        int p = sc.nextInt();
        switch (p){
            case 1:

                e.crearM(idUser, "A");
                break;
            case 2:
                verBA();
                System.out.println("1. Ver mensaje"
                + "\n2. Volver al menu anterior ");
                int t = sc.nextInt();
                switch (t){
                    case 1:
                        verM();
                        SistAdmin();
                        break;
                    case 2:
                        SistAdmin();
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        SisEmp();
                }


                break;
            case 3:
                verML();
                SistAdmin();
                break;
            case 4:
                verB();
                System.out.println("1. Ver primer mensaje "+
                                   "\n2. Enviar primer mensaje  "+
                                   "\n3. Eliminar primer mensaje ");
                int o = sc.nextInt();
                switch (o){
                    case 1:
                        Mensaje temp =  b.mostrarPrimerM();
                        System.out.println(temp.toStringPrintM());
                        SistAdmin();
                        break;
                    case 2:
                        Mensaje men=  b.mostrarPrimerM();
                        enviarMensaje(men);
                        SistAdmin();
                        break;
                    case 3:
                        b.eliminar();
                        SistAdmin();
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        SistAdmin();
                        break;
                }
            case 5:
                u.UsuarioNuevo();
            case 6:
                System.out.println("Ingrese el ID del usuario que desea buscar:");
                int w = sc.nextInt();
                System.out.println(c.BuscarU(w));
                SistAdmin();
            case 7:
                System.out.println("Ingrese el ID del usuario que desea eliminar:");
                int z = sc.nextInt();
                c.EliminarU(z);
                SistAdmin();
            case 8:
                PreguntarU();
                System.out.println("Usuario eliminado exitosamente");
                SistAdmin();
            case 9:
                menuLogin();
            default:
                System.out.println("Opcion incorrecta");
                SistAdmin();
        }
    }
    public void enviarMensaje( Mensaje me){
        m.agregarbandeja(me);
        b.eliminar();

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
            default:
                System.out.println("Opcion incorrecta");
                menuLogin();


        }
    }
    public void verBA(){
        String rem = Long.toString(idUser);
        if (m.isEmptyBA()) {
            m.importBA("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\" + rem + "BA.txt");
        }else{
            m.mostrarBA();
        }
    }
    public void verML(){
        String rem = Long.toString(idUser);
        if (m.isEmptyML()) {
            m.importML("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\" + rem + "ML.txt");
        }else {
            m.mostrarML();
        }
    }
    public void verB(){
        String rem = Long.toString(idUser);
        if (b.isEmptyB()) {
            b.importB("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\" + rem + "B.txt");
        }else {
            b.mostrarB();
        }
    }
}