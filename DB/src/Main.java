import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    int Id;
    String Name;
    String Surname;
    int Age;

    public Person() {

    }

    public Person(int id, String name, String surname, int age) {
        Id = id;
        Name = name;
        Surname = surname;
        Age = age;
    }

    public Person(String name, String surname, int age) {
        Name = name;
        Surname = surname;
        Age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
       final StringBuilder sb = new StringBuilder("Person{");
       sb.append("Id=").append(Id);
       sb.append(", Name='").append(Name).append('\'');
       sb.append(", Surname='").append(Surname).append('\'');
       sb.append(", Age=").append(Age);
       sb.append('}');
       return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
try {
    String url = "jdbc:mysql://127.0.0.1:3306/myDb";
    String username = "root";
    String password = "";

Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
try (Connection connection = DriverManager.getConnection(url, username, password)) {
    System.out.println("Connected!");

    Statement statement = connection.createStatement();

    //CREATE TABLE
    /*String sql = "CREATE TABLE Persons (Id INT PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(30), Surname VARCHAR(30), Age INT)";
    statement.executeUpdate(sql);
    System.out.println("Table created!");*/

    //INSERT
    /*String sql = "INSERT  Persons (Name, Surname, Age) VALUES ('John', 'Donte', 30), ('Sawka', 'Pankov', 25), ('Olga', 'Kubinka', 17)";
    int rows = statement.executeUpdate(sql);
    System.out.println("Add " + rows + " rows");*/

    //UPDATE
    /*String sql = "UPDATE Persons SET Age = 99 WHERE Name LIKE '%a%a%'";
    int rows = statement.executeUpdate(sql);
    System.out.println("Update " + rows + " rows");*/

    //DELETE
    /*String sql = "DELETE FROM Persons WHERE Name LIKE '%a%a%'";
    int rows = statement.executeUpdate(sql);
    System.out.println("Delete " + rows + " rows");*/

    //SELECT
    /*String sql = "SELECT * FROM Persons";
    ResultSet resultSet = statement.executeQuery(sql);

    List<Person> people = new ArrayList<>();

    while (resultSet.next()) {
        *//*int Id = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String surname = resultSet.getString(3);
        int age = resultSet.getInt(4);*//*

        int id = resultSet.getInt("Id");
        String name = resultSet.getString("Name");
        String surname = resultSet.getString("Surname");
        int age = resultSet.getInt("Age");

        Person person = new Person(id, name, surname, age);
        people.add(person);
    }
    people.stream().forEach(p -> System.out.println(p));*/

    //INSERT
    /*Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name:");
    String Name = scanner.nextLine();

    System.out.println("Enter surname:");
    String Surname = scanner.nextLine();

    System.out.println("Enter age:");
    int Age = scanner.nextInt();

    String sql = "INSERT INTO Persons (Name, Surname, Age) VALUES (?, ?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, Name);
    preparedStatement.setString(2, Surname);
    preparedStatement.setInt(3, Age);
    int rows = preparedStatement.executeUpdate();
    System.out.println("Add " + rows + " rows");*/

    //SELECT
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter age: ");
    Integer Age = scanner.nextInt();

    String sql = "SELECT * FROM Persons WHERE Age < ?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, Age);

    ResultSet resultSet = preparedStatement.executeQuery();

    List<Person> people = new ArrayList<>();

    while (resultSet.next()) {
        int id = resultSet.getInt("Id");
        String name = resultSet.getString("Name");
        String surname = resultSet.getString("Surname");
        int age = resultSet.getInt("Age");

        Person person = new Person(id, name, surname, age);
        people.add(person);
    }

    people.stream().forEach(p -> System.out.println(p));

//    statement.executeUpdate(); INSERT, UPDATE, DELETE, CREATE, DROP
//    statement.execute();
//    statement.executeQuery(); SELECT -> ResultSet

}
} catch (Exception e) {
    System.out.println("Not Connected!" + e.getMessage());
    System.out.println(e.getMessage());
}
    }
}