package src;

import src.Model.*;

public class TableSeeder {

    DBServices db = new DBServices();


    // filling all tables
    public void seedTables() {

        // category
        Category category_easy = insertCategory(1, "easy");
        Category category_medium = insertCategory(2,"medium");
        Category category_hard =  insertCategory(3,"hard");

        // quiz
        Quiz quiz_variables = insertQuiz(1, "variables", category_easy.getCat_id());
        Quiz quiz_languages =  insertQuiz(2, "languages",category_medium.getCat_id());
        Quiz quiz_databases = insertQuiz(3, "databases", category_easy.getCat_id());
        Quiz quiz_objects = insertQuiz(4, "objects", category_medium.getCat_id());
        Quiz quiz_variablesdetails = insertQuiz(5, "variables-details", category_hard.getCat_id());

        // user
        User user_peter = insertUser(1,"Peter", "Lesko", "lesko@spse-po.sk");
        User user_kristian = insertUser(2, "Kristian", "Kapec", "kapec@spse-po.sk");
        User user_marek = insertUser(3, "Marek", "Ilcik", "ilcik@spse-po.sk");

        // user_in_quiz
        User_in_quiz user_in_quiz_1 = insertUser_in_quiz(1,user_peter.getUser_id(),quiz_variables.getQuiz_id());
        User_in_quiz user_in_quiz_2 = insertUser_in_quiz(2,user_kristian.getUser_id(),quiz_languages.getQuiz_id());
        User_in_quiz user_in_quiz_3 = insertUser_in_quiz(3,user_marek.getUser_id(),quiz_databases.getQuiz_id());

        // results
        Results results_1 = insertResults(1,"t",3,"t",2,"f",0,user_in_quiz_1.getUiq_id());
        Results results_2 = insertResults(2,"f",0,"t",2,"f",0,user_in_quiz_2.getUiq_id());
        Results results_3 = insertResults(3,"t",5,"f",0,"t",1,user_in_quiz_3.getUiq_id());

        // questions
        Questions questions_1 = insertQuestions(1,"What's the maximum int value?",3,10,quiz_variablesdetails.getQuiz_id());
        Questions questions_2 = insertQuestions(2,"What programming language is used to create GUIs?",2,7,quiz_languages.getQuiz_id());
        Questions questions_3 = insertQuestions(3,"What variable is used to store words?",1,5,quiz_variables.getQuiz_id());
        Questions questions_4 = insertQuestions(4,"What variable is used to store decimal numbers?",1,5,quiz_variables.getQuiz_id());
        Questions questions_5 = insertQuestions(5,"What variable is used to store numbers?",1,5,quiz_variables.getQuiz_id());
        Questions questions_6 = insertQuestions(6,"What variable is used to store logical values?",1,5,quiz_variables.getQuiz_id());
        Questions questions_7 = insertQuestions(7,"What variable is used to store numbers over the maximum integer value?",1,5,quiz_variables.getQuiz_id());
        Questions questions_8 = insertQuestions(8,"What variable is used to store letters?",1,5,quiz_variables.getQuiz_id());
        Questions questions_9 = insertQuestions(9,"What language is used to create databases?",1,5,quiz_languages.getQuiz_id());

        // answers
        Answers answer_1 = insertAnswers(1 ,"2147483647","t", questions_1.getQst_id());
        Answers answer_2 = insertAnswers(2 ,"3547483647","f", questions_1.getQst_id());
        Answers answer_3 = insertAnswers(3 ,"7483647","f", questions_1.getQst_id());
        Answers answer_4 = insertAnswers(4 ,"1247483647","f", questions_1.getQst_id());
        Answers answer_5 = insertAnswers(5 ,"JAVA","f", questions_2.getQst_id());
        Answers answer_6 = insertAnswers(6 ,"JAVAFX","t", questions_2.getQst_id());
        Answers answer_7 = insertAnswers(7 ,"PYTHON","f", questions_2.getQst_id());
        Answers answer_8 = insertAnswers(8 ,"C++","f", questions_2.getQst_id());
        Answers answer_9 = insertAnswers(9 ,"int","f", questions_3.getQst_id());
        Answers answer_10 = insertAnswers(10,"boolean","f", questions_3.getQst_id());
        Answers answer_11 = insertAnswers(11,"long","f", questions_3.getQst_id());
        Answers answer_12 = insertAnswers(12,"String","t", questions_3.getQst_id());
        Answers answer_13 = insertAnswers(13,"int","f", questions_4.getQst_id());
        Answers answer_14 = insertAnswers(14,"boolean","f", questions_4.getQst_id());
        Answers answer_15 = insertAnswers(15,"long","f", questions_4.getQst_id());
        Answers answer_16 = insertAnswers(16,"double","t", questions_4.getQst_id());
        Answers answer_17 = insertAnswers(17,"int","t", questions_5.getQst_id());
        Answers answer_18 = insertAnswers(18,"boolean","f", questions_5.getQst_id());
        Answers answer_19 = insertAnswers(19,"String","f", questions_5.getQst_id());
        Answers answer_20 = insertAnswers(20,"char","f", questions_5.getQst_id());
        Answers answer_21 = insertAnswers(21,"int","f", questions_6.getQst_id());
        Answers answer_22 = insertAnswers(22,"boolean","t", questions_6.getQst_id());
        Answers answer_23 = insertAnswers(23,"long","f", questions_6.getQst_id());
        Answers answer_24 = insertAnswers(24,"char","f", questions_6.getQst_id());
        Answers answer_25 = insertAnswers(25,"double","f", questions_7.getQst_id());
        Answers answer_26 = insertAnswers(26,"boolean","f", questions_7.getQst_id());
        Answers answer_27 = insertAnswers(27,"long","t", questions_7.getQst_id());
        Answers answer_28 = insertAnswers(28,"char","f", questions_7.getQst_id());
        Answers answer_29 = insertAnswers(29,"int","f", questions_8.getQst_id());
        Answers answer_30 = insertAnswers(30,"boolean","f", questions_8.getQst_id());
        Answers answer_31 = insertAnswers(31,"char","t", questions_8.getQst_id());
        Answers answer_32 = insertAnswers(32,"String","f", questions_8.getQst_id());
        Answers answer_33 = insertAnswers(33,"C++","f", questions_9.getQst_id());
        Answers answer_34 = insertAnswers(34,"SQL","t", questions_9.getQst_id());
        Answers answer_35 = insertAnswers(35,"JAVA","f", questions_9.getQst_id());
        Answers answer_36 = insertAnswers(36,"WIRING","f", questions_9.getQst_id());
    }


    // category
    public Category insertCategory(int cat_id, String cat_name){
        Category cat = new Category(cat_id,cat_name);
        db.insertCategory(cat);
        return cat;
    }

    // quiz
    public Quiz insertQuiz(int quiz_id, String quiz_name, int cat_id){
        Quiz quiz = new Quiz(quiz_id, quiz_name, cat_id);
        db.insertQuiz(quiz);
        return quiz;
    }

    // user
    public User insertUser(int user_id, String user_name, String user_surname, String user_email){
        User user = new User(user_id,user_name,user_surname,user_email);
        db.insertUser(user);
        return user;
    }

    // user_in_quiz
    public User_in_quiz insertUser_in_quiz(int uiq_id, int user_id, int quiz_id){
        User_in_quiz uiq = new User_in_quiz(uiq_id, user_id, quiz_id);
        db.insertUser_in_quiz(uiq);
        return uiq;
    }

    // results
    public Results insertResults(int res_id, String res1, int res1_time, String res2, int res2_time, String res3, int res4_time, int uiq_id){
        Results res = new Results(res_id, res1, res1_time, res2, res2_time, res3, res4_time, uiq_id);
        db.insertResults(res);
        return res;
    }

    // questions
    public Questions insertQuestions(int qst_id, String qst_text, int qst_difficulty, int qst_points, int quiz_id){
        Questions qst = new Questions(qst_id,qst_text,qst_difficulty,qst_points,quiz_id);
        db.insertQuestions(qst);
        return qst;
    }

    // answers
    public Answers insertAnswers(int ans_id, String ans_text, String ans_flag, int qst_id){
        Answers ans = new Answers(ans_id,ans_text,ans_flag, qst_id);
        db.insertAnswers(ans);
        return ans;
    }
}
