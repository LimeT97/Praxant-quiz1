package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import src.Model.*;

// connection to DB
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

    /* unused methods
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

    public void dropDatabase() {
        File myObj = new File("quizer.db");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
    */

    // creating a table
    public void createTable(String tableQuery) {
        try {
            Statement st = this.connection.createStatement();
            st.execute(tableQuery);
        } catch (SQLException var3) {
            var3.printStackTrace();
        }

    }

    // DROPS
    public void dropTables() {
        PreparedStatement pstmt = null;

        try {
            // answers
            pstmt = this.connection.prepareStatement("DROP TABLE answers;");
            pstmt.executeUpdate();
            //questions
            pstmt = this.connection.prepareStatement("DROP TABLE questions;");
            pstmt.executeUpdate();
            // results
            pstmt = this.connection.prepareStatement("DROP TABLE results;");
            pstmt.executeUpdate();
            // user_in_quiz
            pstmt = this.connection.prepareStatement("DROP TABLE user_in_quiz;");
            pstmt.executeUpdate();
            // user
            pstmt = this.connection.prepareStatement("DROP TABLE user;");
            pstmt.executeUpdate();
            // quiz
            pstmt = this.connection.prepareStatement("DROP TABLE quiz;");
            pstmt.executeUpdate();
            // category
            pstmt = this.connection.prepareStatement("DROP TABLE category;");
            pstmt.executeUpdate();
            System.out.println("All Tables Dropped");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }



    // INSERTS

    // category
    public void insertCategory(Category category) {
        PreparedStatement pstmt = null;
        try {
            pstmt = this.connection.prepareStatement("INSERT INTO category (cat_id, cat_name) VALUES (?, ?)");
            pstmt.setInt(1, category.getCat_id());
            pstmt.setString(2, category.getCat_name());
            pstmt.executeUpdate();
            System.out.println(category.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }

    // quiz
    public void insertQuiz(Quiz quiz) {
        PreparedStatement pstmt = null;
        try {
            pstmt = this.connection.prepareStatement("INSERT INTO quiz (quiz_id, quiz_name, cat_id) VALUES (?, ?, ?)");
            pstmt.setInt(1, quiz.getQuiz_id());
            pstmt.setString(2, quiz.getQuiz_name());
            pstmt.setInt(3, quiz.getCat_id());
            pstmt.executeUpdate();
            System.out.println(quiz.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }

    // user
    public void insertUser(User user) {
        PreparedStatement pstmt = null;

        try {
            pstmt = this.connection.prepareStatement("INSERT INTO user (user_id , user_name, user_surname, user_email) VALUES (?, ?, ?, ?)");
            pstmt.setInt(1, user.getUser_id());
            pstmt.setString(2, user.getUser_name());
            pstmt.setString(3, user.getUser_surname());
            pstmt.setString(4, user.getUser_email());
            pstmt.executeUpdate();
            System.out.println(user.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }

    }

    // user_in_quiz
    public void insertUser_in_quiz(User_in_quiz uiq) {
        PreparedStatement pstmt = null;

        try {
            pstmt = this.connection.prepareStatement("INSERT INTO user_in_quiz (uiq_id, user_id, quiz_id) VALUES (?, ?, ?)");
            pstmt.setInt(1, uiq.getUiq_id());
            pstmt.setInt(2, uiq.getUser_id());
            pstmt.setInt(3, uiq.getQuiz_id());
            pstmt.executeUpdate();
            System.out.println(uiq.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }

    // results
    public void insertResults(Results res) {
        PreparedStatement pstmt = null;

        try {
            pstmt = this.connection.prepareStatement("INSERT INTO results (res_id, res1, res1_time, res2, res2_time, res3, res3_time, uiq_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, res.getRes_id());
            pstmt.setString(2, res.getRes1());
            pstmt.setInt(3, res.getRes1_time());
            pstmt.setString(4, res.getRes2());
            pstmt.setInt(5, res.getRes2_time());
            pstmt.setString(6, res.getRes3());
            pstmt.setInt(7, res.getRes3_time());
            pstmt.setInt(8, res.getUiq_id());
            pstmt.executeUpdate();
            System.out.println(res.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }

    // questions
    public void insertQuestions(Questions qst) {
        PreparedStatement pstmt = null;

        try {
            pstmt = this.connection.prepareStatement("INSERT INTO questions (qst_id, qst_text, qst_difficulty, qst_points, quiz_id) VALUES (?, ?, ?, ?, ?)");
            pstmt.setInt(1, qst.getQst_id());
            pstmt.setString(2, qst.getQst_text());
            pstmt.setInt(3, qst.getQst_difficulty());
            pstmt.setInt(4, qst.getQst_points());
            pstmt.setInt(5, qst.getQuiz_id());
            pstmt.executeUpdate();
            System.out.println(qst.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }

    // answers
    public void insertAnswers(Answers ans) {
        PreparedStatement pstmt = null;

        try {
            pstmt = this.connection.prepareStatement("INSERT INTO answers (ans_id, ans_text, ans_flag, qst_id) VALUES (?, ?, ?, ?)");
            pstmt.setInt(1, ans.getAns_id());
            pstmt.setString(2, ans.getAns_text());
            pstmt.setString(3, ans.getAns_flag());
            pstmt.setInt(4, ans.getQst_id());
            pstmt.executeUpdate();
            System.out.println(ans.toString() + " inserted in DB");
        } catch (SQLException var4) {
            var4.printStackTrace();
        }
    }




        // SELECTS (unused)
   /* public ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList();
        Statement stmt = null;

        try {
            stmt = this.connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT user_id, user_name, user_surname, user_email FROM users");

            while (rs.next()) {
                User u = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_surname"), rs.getString("user_email"));
                users.add(u);
            }
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

        return users;
    }

    public User getUserByName(String name) {
        PreparedStatement pstmt = null;
        User u = null;

        try {
            pstmt = this.connection.prepareStatement("SELECT user_id, user_name, user_surname, user_email FROM users WHERE user_name LIKE (?)");
            pstmt.setString(1, name);

            for (ResultSet rs = pstmt.executeQuery(); rs.next(); u = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getString("user_surname"), rs.getString("user_email"))) {
            }
        } catch (SQLException var5) {
            var5.printStackTrace();
        }

        return u;*/

}
