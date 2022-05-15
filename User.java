import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;



public class User {
    private String nombre;
    private long id;



    public User() {
        this.nombre = nombre;
        this.id = id;

    }


    public User(String nombre, long id) {
        this();
        this.nombre = nombre;
        this.id = id;

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
    public String toString1() {
        return nombre + " " + id + " " ;
    }
    public void toFile(File input) {
        try {
            FileWriter archU = new FileWriter(input);
            BufferedWriter m = new BufferedWriter(archU);
            m.write(toString1());
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


        System.out.println("User created sucessfully");


    }


}

