package HalukHocaProje;

public class User {
    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signeIn;
    public User(int id, String username, String password, boolean active, boolean signeIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signeIn = signeIn;
    }
    public User(){
        System.out.println("parametresız user cont");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public boolean isSigneIn() {
        return signeIn;
    }
    public void setSigneIn(boolean signeIn) {
        this.signeIn = signeIn;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signeIn=" + signeIn +
                '}';
    }
}

