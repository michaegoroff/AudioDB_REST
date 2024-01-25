package main;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"controllers","updater","mappers","client","repositories","model","dtos"})
@EnableJpaRepositories(basePackages = {"repositories"})
@EntityScan(basePackages = {"model"})
public class WebApiApplication implements CommandLineRunner {

    public static void main(String[] args){
        SpringApplication.run(WebApiApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
