package src.Model;

public class User {

    private int user_id;
    private String user_name;
    private String user_surname;
    private String user_email;

    public User(int id, String user_name, String user_surname, String user_email) {
        this.user_id = id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_email = user_email;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setId(int id) {
        this.user_id = id;
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

    @Override
    public String toString() {
        return "User: " + user_id + " " + user_name + " " + user_surname + " " + user_email;
    }
}
