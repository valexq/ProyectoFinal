public class Password {
    private String password;
    private char descrip;
    private User usu;

    public Password() {
        usu = null;
        password = null;
        descrip = ' ';
    }

    public Password(User u, String c, char d) {
        usu = u;
        password = c;
        descrip = d;
    }

    public User getUsu() {
        return usu;
    }

    public String getPassword() {
        return password;
    }
}