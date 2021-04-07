package org.example;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        //1.获得一个DataSource
        MysqlDataSource dataSource =new MysqlDataSource();
        //2.url,user,password
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/mydata?characterEncoding=utf8&useSSL=true");
        //3.MySQL的用户和密码
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        //4.获得连接
        Connection connection = dataSource.getConnection();
        //5.拼接SQL
        String sql="select * from student where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,2);
        //6.得到结果
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            System.out.println("查询的数据name:"+resultSet.getString("name"));
        }
        //7.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
