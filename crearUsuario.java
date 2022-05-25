import java.util.Scanner;

public class crearUsuario {
    private  User usuario;
    Scanner sc = new Scanner(System.in);
    public crearUsuario(){
        usuario = new User();
    }
    public String  leerNombre(){
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = sc.next();

        if ( nombre.isEmpty( ) ) {
            System.out.println( "Este espacio no puede estar vacio, reintente por favor" );
            return leerNombre ();
        }
        else
            return nombre;
    }
    public long leerId(){
        System.out.println("Ingrese la cedula del usuario: " );
        long id = sc.nextLong();
            return id;
    }
    public Date leerFecha(){
        Date f = new Date();
        System.out.println( "Ingrese el dia de nacimiento del usuario: " );
        short dd = sc.nextShort();
        System.out.println("Ingrese el mes de nacimiento del usuario: ");
        short mm = sc.nextShort();
        System.out.println("Ingrese el año de nacimiento del usuario: " );
        short aa = sc.nextShort();
        f.setDd(dd);
        f.setMm(mm);
        f.setAa(aa);
        return f;
    }
    public String  leerCiudad_nac(){
        System.out.println("Ingrese la ciudad de nacimiento del usuario: ");
        String ciudad_nac = sc.next();

        if ( ciudad_nac.isEmpty( ) ) {
            System.out.println( "Este espacio no puede estar vacio, reintente por favor" );
            return leerCiudad_nac ();
        }
        else
            return ciudad_nac;
    }
    public long leerTel(){
        System.out.println("Ingrese el telefono del usuario: " );
        long tel = sc.nextLong();
        return tel;
    }
    public String  leerEmail(){
        System.out.println( "Ingrese el email del usuario: " );
        String email = sc.next();
        if ( email.isEmpty( ) ) {
            System.out.println ( "Este espacio no puede estar vacio, reintente por favor" );
            return leerEmail();
        }
        else
            return email;
    }
    public String  leerCalle(){
        System.out.println(  "Ingrese la calle donde vive el usuario: " );
        String calle = sc.next();
        if ( calle.isEmpty( ) ) {
            System.out.println ( "Este espacio no puede estar vacio, reintente por favor" );
            return leerCalle();
        }
        else
            return calle;
    }
    public String  leerNomenclatura(){
        System.out.println(  "Ingrese la nomenclatura donde vive el usuario: " );
        String nomenclatura = sc.next();
        if ( nomenclatura.isEmpty( ) ) {
            System.out.println( "Este espacio no puede estar vacio, reintente por favor" );
            return leerNomenclatura();
        }
        else
            return nomenclatura;
    }
    public String  leerBarrio(){
        System.out.println( "Ingrese el barrio donde vive el  usuario: " );
        String barrio =sc.next();
        if ( barrio.isEmpty( ) ) {
            System.out.println ( "Este espacio no puede estar vacio, reintente por favor" );
            return leerBarrio();
        }
        else
            return barrio;
    }
    public String  leerCiudad(){
        System.out.println( "Ingrese la ciudad donde vive el usuario: " );
        String ciudad = sc.next();
        if ( ciudad.isEmpty( ) ) {
            System.out.println( "Este espacio no puede estar vacio, reintente por favor" );
            return leerCiudad();
        }
        else
            return ciudad;
    }
    public String  leerEdificio(){
        System.out.println(  "Ingrese el nombre del edificio donde  vive el usuario: " );
        String edificio = sc.next();
        if ( edificio.isEmpty( ) ) {
            System.out.println ( "Este espacio no puede estar vacio, reintente por favor" );
            return leerEdificio();
        }
        else
            return edificio;
    }
    public String  leerApto(){
        System.out.println( "Ingrese el nombre del edificio donde  vive el usuario: " );
        String apto = sc.next();
        if ( apto.isEmpty( ) ) {
            System.out.println ("Este espacio no puede estar vacio, reintente por favor" );
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
        System.out.println( "Ingrese la contraseña del usuario: " );
        String pass = sc.next();
        if ( pass.isEmpty( ) ) {
            System.out.println( "Este espacio no puede estar vacio, reintente por favor" );
            return leerPass ();
        }
        else
            return pass;
    }
        public String leerDesc () {
        System.out.println( "Ingrese la contraseña: " );
        String desc = sc.next();

        if (desc.isEmpty() ) {
            System.out.println ( " Este espacio no puede estar vacio, reintente por favor" );
            return leerDesc ();
        }
        else
            return desc;
    }
    public User UsuarioNuevo(){
        usuario.setNombre(leerNombre());
        usuario.setId(leerId());
        usuario.setFecha_nac(leerFecha());
        usuario.setCiudad_nac(leerCiudad_nac());
        usuario.setTel(leerTel());
        usuario.setEmail(leerEmail());
        usuario.setDir(leerDireccion());
        usuario.setPass(leerPass());
        usuario.setDesc(leerDesc());

        return usuario;
    }



}
