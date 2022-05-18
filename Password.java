public class Password{
    private String password;
    private char descrip;
    private User usu;
    public Password(){
        usu = null;
        password = null;
        descrip = ' ';
    }
    public Password(User u, String c, char d){
        usu = u;
        password = c;
        descrip = d;
    }
    public User getUsu(){
        return usu;
    }
    public String getPassword(){
        return password;
    }
    public char getDescrip(){
        return descrip;
    }
    public void setUsu(User u){
        usu = u;
    }
    public void setPassword(String c){
        password = c;
    }
    public void setDescrip(char d){
        descrip = d;
    }
    @Override
    public String toString(){
        return usu.getId() + " " + password + " " + descrip;
    }
}