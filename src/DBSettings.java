package src;

public class DBSettings {
    public static final String URL = "jdbc:sqlite:quizer.db";
    public static final String QUERY_CREATE_PLAYER_TABLE = "CREATE TABLE IF NOT EXISTS users (user_id integer NOT NULL, user_name VARCHAR(100) NOT NULL, user_surname VARCHAR(100) NOT NULL, user_email VARCHAR(100) NOT NULL)";
    public static final String QUERY_ADD_PLAYER = "INSERT INTO users (user_id , user_name , user_surname , user_email) VALUES (?, ?, ?, ?)";
    public static final String QUERY_SELECT_ALL_PLAYERS = "SELECT user_id, user_name, user_surname, user_email FROM player";
    public static final String QUERY_SELECT_PLAYER_BY_NAME = "SELECT user_id, user_name, user_surname, user_email FROM player WHERE user_name like (?)";

    public DBSettings() {
    }
}
