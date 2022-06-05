import javax.swing.*;
import java.io.*;
public class SistemaAdministrador extends   SistemaEmpleado {
    private DoubleList empleados;

    public SistemaAdministrador(){
        super();
        empleados = new DoubleList();

    }

    public void CambiarPass(long id, String p){
        User temp = BuscarU(id);
        temp.setPass(p);
        System.out.println("Password changed succesfully");
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
             System.out.println("Usuario Encontrado");
             return (User)temp.getData();
         }
     }
    public void EliminarU(long id){

        empleados.remove(id);
        toFileE();
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


    public void importUser(String emp, String pass){
        try{

            BufferedReader b1 = new BufferedReader(new FileReader(emp));
            BufferedReader b2 = new BufferedReader(new FileReader(pass));
            String str = b1.readLine();
            String ctr = b2.readLine();

            while(str != null){
                User u1 = new User();
                u1.importFileUser(str);
                u1.importFilePass(ctr);
                AgregarU(u1);
                str = b1.readLine();
                ctr = b2.readLine();
            }
            b1.close();
            b2.close();

        }catch(Exception e){
            System.out.println("ERROR");
        }

    }


    public void printListUsu() {
        empleados.printListD();

    }


}
