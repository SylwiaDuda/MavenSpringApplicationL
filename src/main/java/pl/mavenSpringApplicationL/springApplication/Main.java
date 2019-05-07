package pl.mavenSpringApplicationL.springApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import pl.mavenSpringApplicationL.controller.PageController;
import pl.mavenSpringApplicationL.entity.Task;


@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {PageController.class, Task.class})
//@EnableJpaRepositories(basePackageClasses = TaskRepository.class)
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}