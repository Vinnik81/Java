import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
try {
    String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
    String username = "root";
    String password = "";

Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
try (Connection connection = DriverManager.getConnection(url, username, password)) {
    System.out.println("Connected!");

    Statement statement = connection.createStatement();
//    statement.executeUpdate();
//    statement.execute();
//    statement.executeQuery();

}
} catch (Exception e) {
    System.out.println("Not Connected!" + e.getMessage());
    System.out.println(e.getMessage());
}
    }
}