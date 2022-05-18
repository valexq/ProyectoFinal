import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class crearUsuario {
        private  List registro;

        public crearUsuario() {
            registro = new List();
        }

        public void AgregarUsu(User u){
           registro.addFirst(u);
        }
        public void AgregarPass(Password c){
            registro.addFirst(c);
        }
        public User BuscarUsu(long id){
            Node temp= registro.first();
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
        public Password BuscarPass(long id){
            Node temp= registro.first();
            while(temp != null && ((Password)temp.getData()).getUsu().getId() != id){
                temp = temp.getNext();
            }
            if (temp== null){
                return null;
            }
            else{
                System.out.println("Usuario Encontrado");
                return (Password) temp.getData();
            }
        }


    public Boolean eliminar(int id){
        if (!registro.isEmpty()){
            Node anterior = null;
            Node temp = registro.first();
            while(temp != null && ((User)temp.getData()).getId()!= id){
                anterior = temp;
                temp = temp.getNext();
            }
            if(temp == null){
                System.out.println("Usuario Eliminado");
                return false;
            }else{
                if (temp == registro.first()){
                    registro.removeFirst();
                    return true;
                }
                else{
                    anterior.setNext(temp.getNext());
                    temp.setNext(null);
                    registro.setSize(registro.size()-1);
                    System.out.println("Usuario Eliminado");
                    return true;
                }
            }


        }else{
            return false;

        }
    }
        public void toFileUsu(String input) {
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter(input));
                Node temp = registro.first();
                while(temp != null){
                    out.write(((User)temp.getData()).toString1());
                    out.newLine();
                    temp = temp.getNext();
                }
                out.close();
            }catch(IOException e){
                System.out.println("Error de escritura");
            }

        }
        public void toFilePass(String input) {
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter(input));
                Node temp = registro.first();
                while(temp != null){
                    out.write(((Password)temp.getData()).toString());
                    out.newLine();
                    temp = temp.getNext();
                }
                out.close();
            }catch(IOException e){
                System.out.println("Error de escritura");
            }

        }
        public void import_(String archivo){
            try{
                FileReader in = new FileReader(archivo);
                BufferedReader b1 = new BufferedReader(in);
                String str = b1.readLine();

                while(str != null){
                    User u1 = new User();
                    u1.importFileUser(str);
                    AgregarUsu(u1);
                    str = b1.readLine();
                }
                b1.close();

            }catch(Exception e){
                System.out.println("ERROR");
            }

        }

}