

package com.example.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Autowired
    private ConfigProperties configProperties;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(configProperties.getConfigValue("spring.datasource.url"));
        dataSourceBuilder.username(configProperties.getConfigValue("spring.datasource.username"));
        dataSourceBuilder.password(configProperties.getConfigValue("spring.datasource.password"));
        dataSourceBuilder.driverClassName(configProperties.getConfigValue("spring.datasource.driverClassName"));
        System.out.println(dataSourceBuilder.toString());
        return dataSourceBuilder.build();
    }
}


