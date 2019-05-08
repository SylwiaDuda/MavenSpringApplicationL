package pl.mavenSpringApplicationL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.mavenSpringApplicationL.config.SecurityConfiguration;
import pl.mavenSpringApplicationL.config.WebAppConfiguration;
import pl.mavenSpringApplicationL.controller.MainController;
import pl.mavenSpringApplicationL.controller.PageController;
import pl.mavenSpringApplicationL.entity.Task;
import pl.mavenSpringApplicationL.repositories.TaskRepository;


@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {Task.class, PageController.class, SecurityConfiguration.class,
        MainController.class, WebAppConfiguration.class})
@EnableJpaRepositories(basePackageClasses = TaskRepository.class)

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}