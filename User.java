

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;






public class User {
    private String nombre;
    private long id;
    private Date fecha_nac;
    private String ciudad_nac;
    private long tel;
    private String email;
    private Adress dir;
    private String pass;
    private String desc;


    public User() {
        this.nombre = null;
        this.id = 0;
        this.fecha_nac = null;
        this.ciudad_nac = null;
        this.tel = 0;
        this.email = null;
        this.dir = null;
        this.pass = null;
        this.desc = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCiudad_nac() {
        return ciudad_nac;
    }

    public void setCiudad_nac(String ciudad_nac) {
        this.ciudad_nac = ciudad_nac;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adress getDir() {
        return dir;
    }

    public void setDir(Adress dir) {
        this.dir = dir;

    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    public String getDesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "\n\n Nombre: " + nombre + "\n ID: " + id + "\n Fecha de nacimiento: " + fecha_nac
                + "\n Ciudad de nacimiento: " + ciudad_nac + "\n Telefono: " + tel + "\n Email: " + email
                + "\n Direccion: " + dir;
    }
    public String toStringE() {
        return nombre + " " + id + " " + fecha_nac + " "
                + ciudad_nac + " " + tel + " " + email
                + " " + dir;
    }
    public String toStringP (){
        return id + " " + pass+ " "+ desc;
    }
    public void toFile(File input) {
        try {
            FileWriter archU = new FileWriter(input);
            BufferedWriter m = new BufferedWriter(archU);
            m.write(toStringE());
            m.newLine();
            m.close();
            System.out.println("File created sucessfully");

        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
    public void importFileUser(String input) {
        StringTokenizer ts = new StringTokenizer(input);
        this.nombre = ts.nextToken();
        this.id = Long.parseLong(ts.nextToken());
        this.fecha_nac = new Date (Short.valueOf(ts.nextToken()),Short.valueOf(ts.nextToken()),Short.valueOf(ts.nextToken()));
        this.ciudad_nac = ts.nextToken();
        this.tel =Long.parseLong(ts.nextToken());
        this.email = ts.nextToken();
        this.dir = new Adress(ts.nextToken(),ts.nextToken(),ts.nextToken(),ts.nextToken(),ts.nextToken(),ts.nextToken());
        this.pass = ts.nextToken();
        this.desc = ts.nextToken();

        System.out.println("User created sucessfully");


    }
    public void importFilePass(String input) {
        StringTokenizer ts = new StringTokenizer(input);
        this.id = Long.parseLong(ts.nextToken());
        this.pass = ts.nextToken();
        this.desc = ts.nextToken();

        System.out.println("User created sucessfully");


    }



}
  