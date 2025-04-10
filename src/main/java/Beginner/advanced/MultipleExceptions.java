package Beginner.advanced;

import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptions {
    public static void main(String[] args) {
        MultipleExceptions obj = new MultipleExceptions();
        try {
            obj.code();
        } catch (IOException | SQLException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public void code() throws IOException, SQLException {
        // logic that may throw either IOException or SQLException
        if (true) {
            throw new IOException("IO failed");
        } else {
            throw new SQLException("DB failed");
        }
    }
}
