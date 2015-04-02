package bd;

import java.sql.*;

public class User {
    private Connection con;

    private int id;
    private String name, email, password;
    private Statement statement = null;


    public User() {
        String url = "jdbc:mysql://localhost/information";
        String name = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, name, password);
            System.out.println("Connected.");
            statement = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printResults(String password_) {

        String query = "select * from users where password= " + password_;
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
//                id = resultSet.getInt("id_user");
                name = resultSet.getString("name");
                email = resultSet.getString("email");
                password = resultSet.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveResult(String name_, String email_, String password_) {

        StringBuffer query = new StringBuffer("insert users (name, email, password) values ");
        query.append("('");
        query.append(name_);
        query.append("', '");
        query.append(email_);
        query.append("', '");
        query.append(password_);
        query.append("');");

        try {
         statement.executeUpdate(query.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

