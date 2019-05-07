package pl.mavenSpringApplicationL.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mavenSpringApplicationL.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
