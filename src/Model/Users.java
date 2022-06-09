package src.Model;

public class Users {

    private int id;
    private String user_name;
    private String user_surname;
    private String user_email;

    public Users(int id, String user_name, String user_surname, String user_email) {
        this.id = id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_email = user_email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
