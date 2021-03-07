

package com.example.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.example.springboot.dao")

public class DataConfig {

/*    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;*/

    @Bean
    public DataSource dataSource() {

        //System.out.println("the passed in properties are : $$$$$$$$$$$$$$$ " + username + " " + password);

        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.microsoft.sqlserver.jdbc.SQLServerDriver.class);
        dataSource.setUrl("jdbc:sqlserver://dermssqlserver.database.windows.net:1433;database=dermsdb;" +
                "user=dermsadmin@dermssqlserver;password=derms@eda9;" +
                "encrypt=true;trustServerCertificate=false;" +
                "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
/*        dataSource.setUsername(username);

        dataSource.setPassword(password);*/

        return dataSource;
    }

/*    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("com.dukeenergy.derms.domain");
        //sessionFactory.setMapperLocations("classpath*:/mybatis/*Mapper.xml");
        return sessionFactory;
    }*/
}


