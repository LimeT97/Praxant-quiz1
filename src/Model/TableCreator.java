package src.Model;

import src.DBServices;

public class TableCreator {


    // creating tables
    public void createTables(){

        DBServices db = new DBServices();

        // category
        db.createTable("CREATE TABLE IF NOT EXISTS category" +
                "(\n" +
                " cat_id NUMBER PRIMARY KEY,\n" +
                " cat_name VARCHAR(100) NOT NULL\n" +
                ");"
        );
        System.out.println("Category table created");

        // quiz
        db.createTable("CREATE TABLE IF NOT EXISTS quiz" +
                "(\n" +
                " quiz_id NUMBER PRIMARY KEY,\n" +
                " quiz_name VARCHAR(100) NOT NULL,\n" +
                " cat_id NUMBER NOT NULL,\n" +
                " FOREIGN KEY (cat_id) REFERENCES category(cat_id)\n" +
                ");"
        );
        System.out.println("Quiz table created");

        // user
        db.createTable("CREATE TABLE IF NOT EXISTS user" +
                "(\n" +
                " user_id NUMBER PRIMARY KEY,  \n" +
                " user_name VARCHAR(100) NOT NULL,  \n" +
                " user_surname VARCHAR(100) NOT NULL,\n" +
                " user_email VARCHAR(100) NOT NULL\n" +
                ");"
        );
        System.out.println("User table created");

        // user_in_quiz
        db.createTable("CREATE TABLE IF NOT EXISTS user_in_quiz" +
                "(\n" +
                " uiq_id NUMBER PRIMARY KEY,\n" +
                " user_id NUMBER NOT NULL,\n" +
                " quiz_id NUMBER NOT NULL,\n" +
                " FOREIGN KEY (user_id) REFERENCES users(user_id),\n" +
                " FOREIGN KEY (quiz_id) REFERENCES quiz(quiz_id)\n" +
                ");"
        );

        // results
        db.createTable("CREATE TABLE IF NOT EXISTS results(" +
                " res_id NUMBER PRIMARY KEY,\n" +
                " res1 CHAR(1) NOT NULL,\n" +
                " res1_time NUMBER NOT NULL,\n" +
                " res2 CHAR(1) NOT NULL,\n" +
                " res2_time NUMBER NOT NULL,\n" +
                " res3 CHAR(1) NOT NULL,\n" +
                " res3_time NUMBER NOT NULL,\n" +
                " uiq_id NUMBER NOT NULL,\n" +
                " FOREIGN KEY (uiq_id) REFERENCES user_in_quiz(uiq_id)\n" +
                ");"
        );

        // questions
        db.createTable("CREATE TABLE IF NOT EXISTS questions(" +
                " qst_id NUMBER PRIMARY KEY,\n" +
                " qst_text VARCHAR(200) NOT NULL,\n" +
                " qst_difficulty NUMBER NOT NULL,\n" +
                " qst_points NUMBER NOT NULL,\n" +
                " quiz_id NUMBER NOT NULL,\n" +
                " FOREIGN KEY (quiz_id) REFERENCES quiz(quiz_id)\n" +
                ");"
        );

        // answers
        db.createTable("CREATE TABLE IF NOT EXISTS answers(" +
                " ans_id NUMBER PRIMARY KEY,\n" +
                " ans_text VARCHAR(200) NOT NULL,\n" +
                " ans_flag CHAR(1) NOT NULL,\n" +
                " qst_id NUMBER NOT NULL,\n" +
                " FOREIGN KEY (qst_id) REFERENCES questions(qst_id)\n" +
                ");\n"
        );
    }
}