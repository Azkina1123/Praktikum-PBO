package posttest5;

public abstract class Akun {
    public String username;
    public String password;

    // CONSTRUCTOR ========================================

    public Akun(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Akun() {}

    // SETTER GETTER ========================================
    public abstract String getUsername();

    public abstract void setUsername(String username);

    public abstract String getPassword();

    public abstract void setPassword(String password);

    // METHOD ===============================================
    
    
}
