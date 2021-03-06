import javax.swing.*;
import java.io.*;
public class SistemaAdministrador extends   SistemaEmpleado {
    private DoubleList empleados;
    private crearUsuario usuario;
    public SistemaAdministrador(){
        empleados = new DoubleList();
        usuario = new crearUsuario();
    }
    public void  crearUser(){
        usuario.UsuarioNuevo();

    }
    public void AgregarU(User u){
        empleados.addFirst(u);
    }
    public User BuscarU(long id){
        DoubleNode temp= empleados.First();
        while(temp != null && ((User)temp.getData()).getId() != id){
            temp = temp.getNext();
        }
        if (temp== null){
            return null;
        }
        else{
            System.out.println("U   suario Encontrado");
            return (User)temp.getData();
        }
    }
    public void toFileP() {
        try {
            FileWriter archU = new FileWriter("Password.txt");
            BufferedWriter p = new BufferedWriter(archU);
            DoubleList temp;
            temp = empleados;
            while (!(empleados.isEmpty())) {
                p.write(((User) temp.removeFirst()).toStringP());
                p.newLine();
            }

            p.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void toFileE() {
        try {
            FileWriter archU = new FileWriter("Empleados.txt");
            BufferedWriter p = new BufferedWriter(archU);
            DoubleList temp;
            temp = empleados;
            while (!(empleados.isEmpty())) {
                p.write(((User) temp.removeFirst()).toStringE());
                p.newLine();
            }

            p.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void importUser(String archivo){
        try{
            FileReader in = new FileReader(archivo);
            BufferedReader b1 = new BufferedReader(in);
            String str = b1.readLine();

            while(str != null){
                User u1 = new User();
                u1.importFileUser(str);
                AgregarU(u1);
                str = b1.readLine();
            }
            b1.close();

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }

}
