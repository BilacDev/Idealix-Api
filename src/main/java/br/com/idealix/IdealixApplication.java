package br.com.idealix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@Import(value = {IdealixConfiguration.class})
public class IdealixApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdealixApplication.class, args);
    }
}
