package src;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import src.Model.Users;

public class DBServices {
    private Connection connection = null;

    public DBServices() {
        this.connectDB();
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void connectDB() {
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:quizer.db");
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }

    public void closeDBSession() {
        if (this.connection != null) {
            try {
                this.connection.close();
                System.out.println("Database session has been closed");
            } catch (SQLException var2) {
                var2.printStackTrace();
            }
        }

    }

    public void createTable(String tableQuery) {
        try {
            Statement st = this.connection.createStatement();
            st.execute(tableQuery);
            System.out.println("Table created");
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

    }

    public void insertUser(Users user) {
        PreparedStatement pstmt = null;

        try {
            pstmt = this.connection.prepareStatement("INSERT INTO users (user_id , user_name, user_surname, user_email) VALUES (?, ?, ?, ?)");
            pstmt.setInt(1, user.getId());
            pstmt.setString(2, user.getUser_name());
            pstmt.setString(3, user.getUser_surname());
            pstmt.setString(4, user.getUser_email());
            pstmt.executeUpdate();
            System.out.println(user.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }

    }

    public ArrayList<Users> getAllUsers() {
        ArrayList<Users> users = new ArrayList();
        Statement stmt = null;

        try {
            stmt = this.connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT usr_id, usr_name FROM player");

            while(rs.next()) {
                Users u = new Users(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_surname"),rs.getString("user_email"));
                users.add(u);
            }
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

        return users;
    }

    public Users getUserByName(String name) {
        PreparedStatement pstmt = null;
        Users u = null;

        try {
            pstmt = this.connection.prepareStatement("SELECT user_id, user_name, user_surname, user_email FROM users WHERE user_name LIKE (?)");
            pstmt.setString(1, name);

            for(ResultSet rs = pstmt.executeQuery(); rs.next(); u = new Users(rs.getInt("user_id"), rs.getString("user_name"),  rs.getString("user_surname"),rs.getString("user_email"))) {
            }
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

        return u;
    }
}
