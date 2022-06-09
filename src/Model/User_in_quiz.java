package src.Model;

public class User_in_quiz {

    private int uiq_id;
    private int user_id;
    private int quiz_id;

    public User_in_quiz(int uiq_id, int user_id, int quiz_id) {
        this.uiq_id = uiq_id;
        this.user_id = user_id;
        this.quiz_id = quiz_id;
    }

    public int getUiq_id() {
        return uiq_id;
    }

    public void setUiq_id(int uiq_id) {
        this.uiq_id = uiq_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }
}
