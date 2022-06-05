import java.util.Scanner;

public class crearUsuario {
    private  User usuario;
    Scanner sc = new Scanner(System.in);
    SistemaAdministrador a;
    public crearUsuario(){
        usuario = new User();
        a = new SistemaAdministrador();
    }
    public String  leerNombre(){
        System.out.println("Enter username: ");
        String nombre = sc.next();

        if ( nombre.isEmpty( ) ) {
            System.out.println("This space can't be empty, try again, please" );
            return leerNombre ();
        }
        else
            return nombre;
    }
    public long leerId(){
        System.out.println("Enter user's ID: " );
        long id = sc.nextLong();
        return id;
    }
    public Date leerFecha(){
        Date f = new Date();
        System.out.println( "Enter birthday's user: " );
        short dd = sc.nextShort();
        System.out.println("Enter birth month: ");
        short mm = sc.nextShort();
        System.out.println("Enter birth year : " );
        short aa = sc.nextShort();
        f.setDd(dd);
        f.setMm(mm);
        f.setAa(aa);
        return f;
    }
    public String  leerCiudad_nac(){
        System.out.println("Enter city of birth of user: ");
        String ciudad_nac = sc.next();

        if ( ciudad_nac.isEmpty( ) ) {
            System.out.println( "This space can't be empty, try again, please" );
            return leerCiudad_nac ();
        }
        else
            return ciudad_nac;
    }
    public long leerTel(){
        System.out.println("Enter phone's user: " );
        long tel = sc.nextLong();
        return tel;
    }
    public String  leerEmail(){
        System.out.println( "Enter email's user: " );
        String email = sc.next();
        if ( email.isEmpty( ) ) {
            System.out.println ( "This space can't be empty, try again, please" );
            return leerEmail();
        }
        else
            return email;
    }
    public String  leerCalle(){
        System.out.println("Enter street where user lives: " );
        String calle = sc.next();
        if ( calle.isEmpty( ) ) {
            System.out.println ( "This space can't be empty, try again, please" );
            return leerCalle();
        }
        else
            return calle;
    }
    public String  leerNomenclatura(){
        System.out.println(  "Enter nomenclature where user lives: " );
        String nomenclatura = sc.next();
        if ( nomenclatura.isEmpty( ) ) {
            System.out.println( "This space can't be empty, try again, please\"" );
            return leerNomenclatura();
        }
        else
            return nomenclatura;
    }
    public String  leerBarrio(){
        System.out.println( "Enter neighborhood where user lives: " );
        String barrio =sc.next();
        if ( barrio.isEmpty( ) ) {
            System.out.println ( "This space can't be empty, try again, please" );
            return leerBarrio();
        }
        else
            return barrio;
    }
    public String  leerCiudad(){
        System.out.println( "Enter city where user lives: " );
        String ciudad = sc.next();
        if ( ciudad.isEmpty( ) ) {
            System.out.println( "This space can't be empty, try again, please" );
            return leerCiudad();
        }
        else
            return ciudad;
    }
    public String  leerEdificio(){
        System.out.println(  "Enter name of building where user lives: " );
        String edificio = sc.next();
        if ( edificio.isEmpty( ) ) {
            System.out.println ( "This space can't be empty, try again, please" );
            return leerEdificio();
        }
        else
            return edificio;
    }
    public String  leerApto(){
        System.out.println( "Enter number of apartment where user lives: " );
        String apto = sc.next();
        if ( apto.isEmpty( ) ) {
            System.out.println ("This space can't be empty, try again, please" );
            return leerApto();
        }
        else
            return apto;
    }
    public Adress leerDireccion(){
        Adress dir = new Adress();
        dir.setCalle(leerCalle());
        dir.setNomenclatura(leerNomenclatura());
        dir.setBarrio(leerBarrio());
        dir.setCiudad(leerCiudad());
        dir.setEdificio(leerEdificio());
        dir.setApto(leerApto());
        return dir;
    }
    public String leerPass () {
        System.out.println( "Enter password's user: " );
        String pass = sc.next();
        if ( pass.isEmpty( ) ) {
            System.out.println( "This space can't be empty, try again, please" );
            return leerPass ();
        }
        else
            return pass;
    }
    public String leerDesc () {
        System.out.println( "Enter description: " );
        String desc = sc.next();

        if (desc.isEmpty() ) {
            System.out.println ( "This space can't be empty, try again, please" );
            return leerDesc ();
        }
        else
            return desc;
    }
    public void UsuarioNuevo(){
        usuario.setNombre(leerNombre());
        usuario.setId(leerId());
        usuario.setFecha_nac(leerFecha());
        usuario.setCiudad_nac(leerCiudad_nac());
        usuario.setTel(leerTel());
        usuario.setEmail(leerEmail());
        usuario.setDir(leerDireccion());
        usuario.setPass(leerPass());
        usuario.setDesc(leerDesc());
        agregarU();
    }
public void agregarU(){
        a.AgregarU(usuario);
        //a.toFileER();
}


}