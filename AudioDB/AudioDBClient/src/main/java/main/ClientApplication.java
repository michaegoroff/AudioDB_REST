package main;

import client.AudioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"client","dtos"})
@EnableJpaRepositories(basePackages = {"repositories"})
@EntityScan(basePackages = {"model"})
public class ClientApplication implements CommandLineRunner {

    private AudioClient client;

    public ClientApplication(AudioClient client){
        this.client = client;
    }

    public static void main(String[] args){
        SpringApplication.run(ClientApplication.class,args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}
