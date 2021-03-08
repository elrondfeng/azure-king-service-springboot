package com.example.springboot;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Value("${env}")
    static private String env;

    @Value("#{systemProperties}")
    static private Map<String, String> systemPropertiesMap;

    @Autowired
    static private Environment environment;


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        logger.debug("the passed in env is : ********  *********  " + env);

        printEnvironmentVariable();

        //todo figure this out.

        // System.out.println("************************print system property***************************");

        // printSystemProperty();

        //todo figure this environment out.
        //environment.getProperty(" +****************************** jdbc.url");
    }

    static private void printSystemProperty() {
        systemPropertiesMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }


    static private void printEnvironmentVariable() {

        Map<String, String> env = System.getenv();

        LinkedHashMap<String, String> collect =
                env.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        collect.forEach((k, v) -> System.out.println(k + ":" + v));
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
