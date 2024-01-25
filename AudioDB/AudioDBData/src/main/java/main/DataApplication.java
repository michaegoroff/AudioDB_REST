package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.DataCatalog;
import repositories.IDataCatalog;

@SpringBootApplication(scanBasePackages = {"repositories","model"})
@EnableJpaRepositories(basePackages = {"repositories"})
@EntityScan(basePackages = {"model"})
public class DataApplication implements CommandLineRunner {
    private DataCatalog dataCatalog;

    public DataApplication(DataCatalog dataCatalog){
        this.dataCatalog = dataCatalog;
    }

    public static void main(String[] args){
        SpringApplication.run(DataApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
