package com.bridgelabz.jdbcconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConcepts {
    public static void main(String[] args) throws SQLException {
// Step 1 : need a connection to perform any operation over mysql database server
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo_107", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student_info");
/*
while (resultSet.next()) {
for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
System.out.print(resultSet.getString("student_name") + "\t");
System.out.print(resultSet.getInt("id") + "\t");
System.out.print(resultSet.getString("stream") + "\t");
}
// String s = new Integer(1).toString();
System.out.println();
}

int i = statement.executeUpdate("update student_info set document='abc.txt'");

System.out.println("count :" + i);
*/

        System.out.println("======== Prepared ===========");
        resultSet = getTheStudentDetails(connection, new Scanner(System.in).nextInt());
        while (resultSet.next()) {
            for (int j = 1; j <= resultSet.getMetaData().getColumnCount(); j++) {
                System.out.print(resultSet.getString(j) + "\t");
            }
            System.out.println();
        }

        int count = deleteTheStudentDetails(connection, new Scanner(System.in).nextInt());
        System.out.println(count);
// int i = statement.executeUpdate("update student_info set ducument='abc.txt'");
//
// System.out.println("count :" + i);
    }

    // Dynamic Query
    public static ResultSet getTheStudentDetails(Connection connection, Integer id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from student_info where id = ?");
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public static int deleteTheStudentDetails(Connection connection, Integer id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from student_info where id = ?");
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate();
    }
/**
 * JDBC :
 */
}
