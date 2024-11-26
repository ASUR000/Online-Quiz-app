package dao;

import model.User;
import java.sql.*;

public class UserDAO {
    public boolean registerUser(User user) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO Users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User authenticateUser(String username, String password) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM Users WHERE username = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
