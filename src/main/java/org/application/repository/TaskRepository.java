package org.application.repository;

import org.application.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    Task findByTitle(String title);

    Task findByTaskId(int taskId);

    Task findByTitleAndTaskId(String title, int taskId);

    List<Task> findByAuthor(String author);

}
