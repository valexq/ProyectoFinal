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
    /* public DoubleNode findRecursive(long id, DoubleNode v){
         if (((User)v.getData()).getId() == id ){
             return v;
         }
         else {
             return findRecursive(id, v.getNext());
         }
     }
     public DoubleNode find(long id){
         return findRecursive(id, empleados.First());
   }*/
     public User BuscarU(long id){
         DoubleNode temp= empleados.First();
         while(temp != null && ((User)temp.getData()).getId() != id){
             temp = temp.getNext();
         }
         if (temp== null){
             return null;
         }
         else{
             System.out.println("Usuario Encontrado");
             return (User)temp.getData();
         }
     }
    public User EliminarU (long id){


        return (User)empleados.remove(id);
    }

    public void toFileE() {
        try {

            BufferedWriter e = new BufferedWriter(new FileWriter("Empleados.txt"));
            BufferedWriter p = new BufferedWriter(new FileWriter("Password.txt"));
            DoubleList temp;
            temp = empleados;
            while (!(empleados.isEmpty())) {
                User aux = (User)temp.removeFirst();
                e.write(( aux).toStringE());
                p.write(( aux).toStringP());
                e.newLine();
                p.newLine();
            }
            e.close();
            p.close();

        } catch (IOException e) {
            System.out.println("ERROR");
        }

    }
    public void importUser(String archivo){
        try{

            BufferedReader b1 = new BufferedReader(new FileReader(archivo));
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
    public void importPass(String archivo){
        try{

            BufferedReader b1 = new BufferedReader(new FileReader(archivo));
            String str = b1.readLine();

            while(str != null){
                User u1 = new User();
                u1.importFilePass(str);
                AgregarU(u1);
                str = b1.readLine();
            }
            b1.close();

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }
    public void printListUsu() {
        empleados.printListD();

    }
}
