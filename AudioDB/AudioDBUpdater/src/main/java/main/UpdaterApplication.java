package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import updater.AudioUpdater;

@SpringBootApplication(scanBasePackages = {"updater","mappers","client","repositories","dtos","model"})
@EnableJpaRepositories(basePackages = {"repositories"})
@EntityScan(basePackages = {"model"})
public class UpdaterApplication implements CommandLineRunner {

    private AudioUpdater updater;
    public UpdaterApplication(AudioUpdater updater){
        this.updater = updater;
    }

    public static void main(String[] args){
        SpringApplication.run(UpdaterApplication.class,args);
    }
    @Override
    public void run(String... args) throws Exception {

    }
}
