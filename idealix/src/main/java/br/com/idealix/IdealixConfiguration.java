package br.com.idealix;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories
@EntityScan(basePackages = "br.com.idealix")
@ComponentScan(basePackages = "br.com.idealix")
public class IdealixConfiguration {
}
