package src;

import src.Model.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:quizer.db");
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBServices db = new DBServices();
        db.createTable("CREATE TABLE IF NOT EXISTS user (user_id integer NOT NULL, user_name VARCHAR(100) NOT NULL, user_surname VARCHAR(100) NOT NULL, user_email VARCHAR(100) NOT NULL)");

        Users u = new Users(1, "Peter", "Lesko", "lesko@spse-po.sk");


        db.insertUser(u);
        System.out.println(db.getAllUsers());
        System.out.println(db.getUserByName("Peter"));



    }
}