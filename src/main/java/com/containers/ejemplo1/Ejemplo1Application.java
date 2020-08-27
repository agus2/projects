package com.containers.ejemplo1;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@EnableJpaRepositories
@EnableJpaAuditing
@SpringBootApplication
public class Ejemplo1Application {
    static ConfigurableApplicationContext context;

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(Ejemplo1Application.class);
        context = app.run(args);
        ConfigurableEnvironment env = context.getEnvironment();
        log.info("\n    -----------------------\n\t "+
                        "The App '{}' is running.\n\t Exposed in: http://{}:{}/ \n\t"+
                        "----------------------",
                env.getProperty("spring.application.name"),
                InetAddress.getLocalHost().getHostName(),
                env.getProperty("server.port"));
        //deberia funcionar pero como no tengo las variable definidas en un yml , me dan null
    }

}
