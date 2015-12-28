/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperate1;

import java.sql.*;

/**
 *
 * @author Administrator
 */
public class DBOperate {

    private static ResultSetMetaData fields;
    private static int n;
    private static int i;
    private static ResultSet tables;

    public static void main(String args[]) throws Exception {
        Connection con;
        Statement stmt, stmt1;
        ResultSet rs;
        DatabaseMetaData meta;


        Class jdbcDriver = Class.forName("com.mysql.jdbc.Driver");

        java.sql.DriverManager.registerDriver((Driver) jdbcDriver.newInstance());

        String dbUrl = "jdbc:mysql://222.201.101.15:3306/MYSTUDENTDB";
        String dbUser = "myroot";
        String dbPwd = "my999";

        con = java.sql.DriverManager.getConnection(dbUrl, dbUser, dbPwd);


        meta = con.getMetaData();
        tables = meta.getTables(null, null, null, new String[]{"TABLE"});
        while (tables.next()) {
            System.out.println(tables.getString(1));
            System.out.println(tables.getString(2));
            System.out.println(tables.getString(3));
            System.out.println(tables.getString(4));
            System.out.println(tables.getString(5));
        }

        stmt = (Statement) con.createStatement();
        rs = stmt.executeQuery("select * from courses");
        fields = rs.getMetaData();//会返回该表的字段信息
        n = fields.getColumnCount();//会返回表中字段的数目
        for (int i = 1; i < n; i++) {
            System.out.println(fields.getColumnLabel(i));
            System.out.println(fields.getColumnTypeName(i));
        }
        //会返回表中第i个字段名


        String sName = new String("林浩笙".getBytes("GB2312"), "ISO-8859-1");
        String sClass = new String("软件工程1302".getBytes("GB2312"), "ISO-8859-1");
        String sip = new String("192.168.207.192".getBytes("GB2312"), "ISO-8859-1");
//        String timeStamp = new Date();
//
        System.out.println("insert into boyandgirls (YOURNO,YOURNAME,AGE,CLASS)" + " VALUES ('20131003612','" + sName + "',21,'" + sClass + "')");
        stmt.executeUpdate("insert into boyandgirls (YOURNO,YOURNAME,AGE,CLASS)" + " VALUES ('20131003612','" + sName + "',21,'" + sClass + "')");

        rs = stmt.executeQuery("select * from boyandgirls ");

//        System.out.println("insert into courses (NAME,TIME)" + " VALUES ('" + sName + "','1202')");
//        stmt.executeUpdate("insert into courses (NAME,TIME)" + " VALUES ('" + sName + "','1202')");
//
//        rs = stmt.executeQuery("select * from courses where NAME = '林浩笙'");
        
        while (rs.next()) {
            String sNo2 = rs.getString(2);
            String sName2 = rs.getString(3);
            int age2 = rs.getInt(4);
            sName2 = new String(sName2.getBytes("ISO-8859-1"), "GB2312");
            try {
                String sc = rs.getString(5);
                sc = new String(sc.getBytes("ISO-8859-1"), "GB2312");
                System.out.println("NO=" + sNo2 + ",name=" + sName2 + ",age=" + age2 + "class=" + sc);
            } catch (Exception e) {
                
            }
            

            
            

            
        }

    }
}
