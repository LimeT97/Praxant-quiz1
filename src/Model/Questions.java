package src.Model;

public class Questions {

    private int qst_id;
    private String qst_text;
    private int qst_difficulty;
    private int qst_points;
    private int quiz_id;

    public Questions(int qst_id, String qst_text, int qst_difficulty, int qst_points, int quiz_id) {
        this.qst_id = qst_id;
        this.qst_text = qst_text;
        this.qst_difficulty = qst_difficulty;
        this.qst_points = qst_points;
        this.quiz_id = quiz_id;
    }

    public int getQst_id() {
        return qst_id;
    }

    public void setQst_id(int qst_id) {
        this.qst_id = qst_id;
    }

    public String getQst_text() {
        return qst_text;
    }

    public void setQst_text(String qst_text) {
        this.qst_text = qst_text;
    }

    public int getQst_difficulty() {
        return qst_difficulty;
    }

    public void setQst_difficulty(int qst_difficulty) {
        this.qst_difficulty = qst_difficulty;
    }

    public int getQst_points() {
        return qst_points;
    }

    public void setQst_points(int qst_points) {
        this.qst_points = qst_points;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    @Override
    public String toString() {
        return "Question: " + qst_id + " " +qst_text + " " + qst_difficulty + " " + qst_points + " " + quiz_id;
    }
}
