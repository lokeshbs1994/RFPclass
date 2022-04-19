package com.bridgelabz.jdbcconcepts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConcepts2 {
    public static void main(String[] args) throws SQLException {
// Step 1 : need a connection to perform any operation over mysql database server
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo_107", "root", "credable");
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

int i = statement.executeUpdate("update student_info set ducument='abc.txt'");

System.out.println("count :" + i);
*/
/*
System.out.println("======== Prepared ===========");
// resultSet = getTheStudentDetails(connection, new Scanner(System.in).nextInt());
while (resultSet.next()) {
for (int j = 1; j <= resultSet.getMetaData().getColumnCount(); j++) {
System.out.print(resultSet.getString(j) + "\t");
}
System.out.println();
}*/

        System.out.println("============= Transaction =============");
        try {
            connection.setAutoCommit(false);
            int count = deleteTheStudentDetails(connection, new Scanner(System.in).nextInt(), new Scanner(System.in).nextLine());
// System.out.println(count);
// int i = statement.executeUpdate("update student_info set ducument='abc.txt'");
//
// System.out.println("count :" + i);
            connection.commit();

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();

        }

/**
 * Ram - 5000 through UPI -> 10AM upiPayment(dis-5000) -> 5000 -> 5000
 * Ram - 5000 through Net Banking -> 10AM netBankPayment(dis-5000) -> 5000 -> 5000
 * Ram - 5000 at ATM -> 10AM -> AtmPayment(dis-5000) -> 5000 -> 5000
 * Balance : 5000
 * CONCURRENCY PROBLEM
 *
 */

/**
 * Transaction
 */
    }

    // Dynamic Query
    public static ResultSet getTheStudentDetails(Connection connection, Integer id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from student_info where id = ?");
        preparedStatement.setInt(1, id);
        return preparedStatement.executeQuery();
    }

    public static int deleteTheStudentDetails(Connection connection, Integer id, String documnent) throws SQLException {
        System.out.println(id + " " + documnent);
        PreparedStatement preparedStatement = connection.prepareStatement("update student_info set ducument= ? where id = ?");
        preparedStatement.setString(1, documnent);
        preparedStatement.setInt(2, id);
        return preparedStatement.executeUpdate();
    }
/**
 * JDBC :
 */
}
