package pl.mavenSpringApplicationL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.mavenSpringApplicationL.config.SecurityConfig;
import pl.mavenSpringApplicationL.controller.PageController;
import pl.mavenSpringApplicationL.entity.Task;
import pl.mavenSpringApplicationL.repositories.TaskRepository;


@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {Task.class, PageController.class, SecurityConfig.class})
@EnableJpaRepositories(basePackageClasses = TaskRepository.class)

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}