package src;

import src.Model.Answers;
import src.Model.Questions;
import src.Model.TableCreator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {


        // connection to database
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:quizer.db");
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // dropping all tables
        DBServices db = new DBServices();
        db.dropTables();

        // creating all tables
        TableCreator tc = new TableCreator();
        tc.createTables();

        // filling all tables
        TableSeeder ts = new TableSeeder();
        ts.seedTables();


        System.out.println(" \n");
        db.prettyPrintQuestion(1);
        db.prettyPrintQuestion(2);
        db.prettyPrintQuestion(3);



        // closing the database connection
        db.closeDBSession();
    }
}