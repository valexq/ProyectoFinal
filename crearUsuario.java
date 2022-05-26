import javax.swing.*;

public class crearUsuario {
    private  User usuario;
    public crearUsuario(){
        usuario = new User();
    }
    public String  leerNombre(){
        String nombre = JOptionPane.showInputDialog( null, "Ingrese el nombre del usuario: " );

        if ( nombre.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerNombre ();
        }
        else
            return nombre;
    }
    public long leerId(){
        long id = Long.parseLong(JOptionPane.showInputDialog( null, "Ingrese la cedula del usuario: " ));
            return id;
    }
    public Date leerFecha(){
        Date f = new Date();
        short dd = Short.parseShort(JOptionPane.showInputDialog( null, "Ingrese el dia de nacimiento del usuario: " ));
        short mm = Short.parseShort(JOptionPane.showInputDialog( null, "Ingrese el mes de nacimiento del usuario: " ));
        short aa = Short.parseShort(JOptionPane.showInputDialog( null, "Ingrese el año de nacimiento del usuario: " ));
        f.setDd(dd);
        f.setMm(mm);
        f.setAa(aa);
        return f;
    }
    public String  leerCiudad_nac(){
        String ciudad_nac = JOptionPane.showInputDialog( null, "Ingrese la ciudad de nacimiento del usuario: " );

        if ( ciudad_nac.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerCiudad_nac();
        }
        else
            return ciudad_nac;
    }
    public long leerTel(){
        long tel = Long.parseLong(JOptionPane.showInputDialog( null, "Ingrese el telefono del usuario: " ));
        return tel;
    }
    public String  leerEmail(){
        String email = JOptionPane.showInputDialog( null, "Ingrese el email del usuario: " );

        if ( email.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerEmail();
        }
        else
            return email;
    }
    public String  leerCalle(){
        String calle = JOptionPane.showInputDialog( null, "Ingrese la calle donde vive el usuario: " );

        if ( calle.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerCalle();
        }
        else
            return calle;
    }
    public String  leerNomenclatura(){
        String nomenclatura = JOptionPane.showInputDialog( null, "Ingrese la nomenclatura donde vive el usuario: " );

        if ( nomenclatura.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerNomenclatura();
        }
        else
            return nomenclatura;
    }
    public String  leerBarrio(){
        String barrio = JOptionPane.showInputDialog( null, "Ingrese el barrio donde vive el  usuario: " );

        if ( barrio.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerBarrio();
        }
        else
            return barrio;
    }
    public String  leerCiudad(){
        String ciudad = JOptionPane.showInputDialog( null, "Ingrese la ciudad donde vive el usuario: " );

        if ( ciudad.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerCiudad();
        }
        else
            return ciudad;
    }
    public String  leerEficio(){
        String eficio = JOptionPane.showInputDialog( null, "Ingrese el nombre del edificio donde  vive el usuario: " );

        if ( eficio.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
            return leerEficio();
        }
        else
            return eficio;
    }
    public String  leerApto(){
        String apto = JOptionPane.showInputDialog( null, "Ingrese el nombre del edificio donde  vive el usuario: " );

        if ( apto.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Este espacio no puede estar vacio, reintente por favor" );
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
        dir.setEdificio(leerEficio());
        dir.setApto(leerApto());
        return dir;
    }
    public String leerPass () {
        String pass = JOptionPane.showInputDialog( null, "Ingrese la contraseña: " );
        if ( pass.isEmpty( ) ) {
            JOptionPane.showMessageDialog ( null,"Contraseña incorrecta \n Este espacio no puede estar vacio, reintente por favor" );
            return leerPass ();
        }
        else
            return pass;
    }
        public String leerDesc () {
        String desc =  JOptionPane.showInputDialog( null, "Ingrese la contraseña: " );

        if (desc.isEmpty() ) {
            JOptionPane.showMessageDialog ( null,"Contraseña incorrecta \n Este espacio no puede estar vacio, reintente por favor" );
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

    public static void main(String[] args) {


        User e1 = new User();
        e1.setNombre("Carolina");
        e1.setId(1007061);
        e1.setFecha_nac(new Date((short)30, (short)06, (short)2003));
        e1.setCiudad_nac("Bello");
        e1.setEmail("c.echev03@gmail.com");
        e1.setTel(1001621);
        e1.setDir(new Adress("Calle", "45","Junin","504","Fundadores","Medellin"));
        e1.setPass("carolina123");
        e1.setDesc("E");

        User e2 = new User();
        e2.setNombre("Vanessa");
        e2.setId(1025489);
        e2.setFecha_nac(new Date((short)11, (short)07, (short)2002));
        e2.setCiudad_nac("Barranquilla");
        e2.setEmail("valexq11@gmail.com");
        e2.setTel(2154582);
        e2.setDir(new Adress("Calle", "23","Milagros","201","Reservas","Medellin"));
        e2.setPass("vanessa123");
        e2.setDesc("E");

        User e3 = new User();
        e3.setNombre("Carlos");
        e3.setId(1098889);
        e3.setFecha_nac(new Date((short)24, (short)10, (short)1985));
        e3.setCiudad_nac("Caldas");
        e3.setEmail("Carlos12@gmail.com");
        e3.setTel(2655582);
        e3.setDir(new Adress("Carrera", "47","Asuncion","208","TorreSofia","Medellin"));
        e3.setPass( "carlos123");
        e3.setDesc("A");

        User e4 = new User();
        e4.setNombre("Stiven");
        e4.setId(2068589);
        e4.setFecha_nac(new Date((short)13, (short)02, (short)1994));
        e4.setCiudad_nac("Medellin");
        e4.setEmail("stiven14m@gmail.com");
        e4.setTel(4452589);
        e4.setDir(new Adress("Carrera", "18","Cabañitas","509","Fabricato","Bello"));
        e4.setPass("stiven123");
        e4.setDesc("E");

        User e5 = new User();
        e5.setNombre("Milena ");
        e5.setId(3785589);
        e5.setFecha_nac(new Date((short)30, (short)11, (short)1992));
        e5.setCiudad_nac("Bello");
        e5.setEmail("milenitahermosita@gmail.com");
        e5.setTel(7858552);
        e5.setDir(new Adress("Calle", "29B","Boston","204","Vidia","Medellin"));
        e5.setPass("milena123");
        e5.setDesc("E");
        SistemaAdministrador sA = new SistemaAdministrador();
        sA.AgregarU(e1);
        sA.AgregarU(e2);
        sA.AgregarU(e3);
        sA.AgregarU(e4);
        sA.AgregarU(e5);
        System.out.println(sA.BuscarU(2068589));
        sA.importUser("C:\\Users\\Acer\\Documents\\GitHub\\ProyectoFinal\\Empleados.txt");



    }

}
