package src.Model;

public class Quiz {

    private int quiz_id;
    private String quiz_name;
    private int cat_id;

    public Quiz(int quiz_id, String quiz_name, int cat_id) {
        this.quiz_id = quiz_id;
        this.quiz_name = quiz_name;
        this.cat_id = cat_id;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public String getQuiz_name() {
        return quiz_name;
    }

    public void setQuiz_name(String quiz_name) {
        this.quiz_name = quiz_name;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }
}
