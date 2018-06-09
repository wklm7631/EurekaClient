package com.example.demo.com.bc.client.config;

//import org.omg.CORBA.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
@Configuration
public class DataSourceConfig {
    @Bean(name="dataSource")
    public DataSource dataSource(Environment env){
        HikariDataSource ds=new HikariDataSource();
        ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
        ds.setUserName(env.getProperty("spring.datasource.username"));
        ds.setPassword(env.getProperty("spring.datasource.password"));
        ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        return  ds;
    }
}