import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Principal {


    static crearUsuario sA = new crearUsuario();
    public static void main(String[] args) {
        Login log= new Login();
login();
log.menuLogin();
    }

    private static void login(){
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
        sA.toFileE();











    }
}
