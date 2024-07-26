package com.powernode.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 9:31
 * @description:
 */
@Component
public class MyDataSource implements DataSource {
    private String driver;
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;


    @Value("com.mysql.cj.jdbc.Driver")
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(@Value("jdbc:mysql://localhost:3307/spring6") String url) {
        this.url = url;
    }



    @Override
    public String toString() {
        return "MyDataSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public Connection getConnection() throws SQLException {

        return null;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
