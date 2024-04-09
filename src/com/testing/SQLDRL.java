package com.testing;
import java.sql.*;
/*
1) Create a connection
2) Create statement/Query
3) Execute statment/Query
4) close connection
*/

public class SQLDRL {
    public static void main(String[] args) throws SQLException {
        //1) Create a connection

        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TEST", "root","root");

//2) Create statement/Query Statement -con.createStatement();
      Statement stmt= con.createStatement();

      //String s="INSERT INTO T1 VALUES (2,'RAJ')";
         String s="select n,name from t1";
        //String s="UPDATE  STUDENT SET STUDENT_NAME='DAVID' WHERE S_NO=103";
        //  String s="DELETE FROM STUDENT WHERE S_NO=107)";

//3) Execute statment/Query AND Store Result Set
        //stmt.execute(s);
        ResultSet rs=stmt.executeQuery(s);
while (rs.next()){
    int num=rs.getInt("N");
      String name1=rs.getString("NAME");
      System.out.println(num +" "+ name1);
}

//4) close connection
        con.close();
        System.out.println("Query Executed...");
    }
}
