package Marcos.Bacete2.Modelos;

public class Usuario {

    private String mail, password;

    public Usuario() {
    }

    public Usuario(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
