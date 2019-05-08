package pl.mavenSpringApplicationL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.mavenSpringApplicationL.entity.Task;
import pl.mavenSpringApplicationL.repositories.TaskRepository;


@Controller
public class PageController {

    @Autowired
    public TaskRepository taskRepository;

    @RequestMapping("/")
    @ResponseBody
    public String mainPage() {

        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String pageTwo() {

        return "Hello Spring Boot!";
    }

    @RequestMapping("/db")
    @ResponseBody
    public String taskMethod(){
        StringBuilder response = new StringBuilder();
        Task task = new Task()
                .withName("Task 1")
                .withDescription("Test task")
                .withBudget(123.55)
                .withDone(true);
        taskRepository.save(task);
        for(Task t: taskRepository.findAll()){
            response.append(t).append("<br>");
        }
        return response.toString();
    }
}
