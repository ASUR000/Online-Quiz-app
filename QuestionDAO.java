package dao;

import model.Question;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {
    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM Questions";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question q = new Question(
                    rs.getInt("id"),
                    rs.getString("question_text"),
                    rs.getString("option_a"),
                    rs.getString("option_b"),
                    rs.getString("option_c"),
                    rs.getString("option_d"),
                    rs.getString("correct_option").charAt(0)
                );
                questions.add(q);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return questions;
    }
}
