package src.Model;

public class Answers {

    private int ans_id;
    private String ans_text;
    private String ans_flag;
    private int qst_id;

    public Answers(int ans_id, String ans_text, String ans_flag, int qst_id) {
        this.ans_id = ans_id;
        this.ans_text = ans_text;
        this.ans_flag = ans_flag;
        this.qst_id = qst_id;
    }

    public int getAns_id() {
        return ans_id;
    }

    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }

    public String getAns_text() {
        return ans_text;
    }

    public void setAns_text(String ans_text) {
        this.ans_text = ans_text;
    }

    public String getAns_flag() {
        return ans_flag;
    }

    public void setAns_flag(String ans_flag) {
        this.ans_flag = ans_flag;
    }

    public int getQst_id() {
        return qst_id;
    }

    public void setQst_id(int qst_id) {
        this.qst_id = qst_id;
    }

    @Override
    public String toString() {
        return "Answer: " + ans_id + " " + ans_text + " " + ans_flag + " " + qst_id;
    }
}
