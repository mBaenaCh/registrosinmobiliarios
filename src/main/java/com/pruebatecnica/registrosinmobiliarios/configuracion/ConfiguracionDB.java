package com.pruebatecnica.registrosinmobiliarios.configuracion;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class ConfiguracionDB {

    private static String JDBC_URL = "jdbc:mysql://localhost:3306/inmobiliapp";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    @Bean
    public DataSource dataSource(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        return new HikariDataSource(config);
    }

    @Bean
    public JdbcTemplate jdbcTemplate(
            DataSource dataSource
    ){
        return new JdbcTemplate(dataSource);
    }
}
