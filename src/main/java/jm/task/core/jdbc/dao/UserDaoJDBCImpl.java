/*package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }
    @Override
    public void createUsersTable() {

        String sql = "CREATE TABLE IF NOT EXISTS users (id BIGINT PRIMARY KEY AUTO_INCREMENT," +
                " name VARCHAR(50), lastName VARCHAR(50), age TINYINT)";
        try {
            Connection connection = Util.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            //System.out.println("Таблица Users создана");

        } catch (SQLException e) {
            System.out.println("Ошибка при создании таблицы " + e.getMessage());
        }
    }
    @Override
    public void dropUsersTable() {
        String dsql = "DROP TABLE IF EXISTS users";
        try {
            Connection connection = Util.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate(dsql);
            //System.out.println("Таблица Users успешно удалена");
        } catch (SQLException e) {
            System.out.println("Ошибка при удалении таблицы" + e.getMessage());
        }
    }
    @Override
    public void saveUser(String name, String lastName, byte age) {
        String ssql = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
        try {
            Connection connection = Util.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ssql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.executeUpdate();


        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении пользователя" + e.getMessage());
        }
    }
    @Override
    public void removeUserById(long id) {
        String rsql = "DELETE FROM users WHERE id = ?";
        try {
            Connection connection = Util.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(rsql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка" + e.getMessage());
        }
    }
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String gsql = "SELECT * FROM users";
        try {
            Connection connection = Util.getConnection();
            ResultSet resultSet = connection.createStatement().executeQuery(gsql);
            while (resultSet.next()) {
                User user = new User(resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getByte("age"));
                user.setId(resultSet.getLong("id"));
                users.add(user);

            }
            }catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    @Override
    public void cleanUsersTable() {
        String csql = "DELETE FROM users";
        try {
            Connection connection = Util.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(csql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}*/
