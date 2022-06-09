package src.Model;

public class Results {

    private int res_id;
    private String res1;
    private int res1_time;
    private String res2;
    private int res2_time;
    private String res3;
    private int res3_time;
    private int uiq_id;

    public Results(int res_id, String res1, int res1_time, String res2, int res2_time, String res3, int res4_time, int uiq_id) {
        this.res_id = res_id;
        this.res1 = res1;
        this.res1_time = res1_time;
        this.res2 = res2;
        this.res2_time = res2_time;
        this.res3 = res3;
        this.res3_time = res4_time;
        this.uiq_id = uiq_id;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getRes1() {
        return res1;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public int getRes1_time() {
        return res1_time;
    }

    public void setRes1_time(int res1_time) {
        this.res1_time = res1_time;
    }

    public String getRes2() {
        return res2;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public int getRes2_time() {
        return res2_time;
    }

    public void setRes2_time(int res2_time) {
        this.res2_time = res2_time;
    }

    public String getRes3() {
        return res3;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

    public int getRes3_time() {
        return res3_time;
    }

    public void setRes3_time(int res4_time) {
        this.res3_time = res4_time;
    }

    public int getUiq_id() {
        return uiq_id;
    }

    public void setUiq_id(int uiq_id) {
        this.uiq_id = uiq_id;
    }

    @Override
    public String toString() {
        return "Results: " + res_id + " " + res1 + " " + res1_time + " " + res2 + " " + res2_time + " " + res3 + " " + res3_time + " " + uiq_id;
    }
}
